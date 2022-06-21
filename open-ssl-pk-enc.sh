#!/usr/bin/env bash
# Purpose: Open SSL public private key encrption
# Usage:
#   Show usage:
#     ./open-ssl-pk-enc.sh
#   Invoke command:
#     ./open-ssl-pk-enc.sh <command>
# See:
#   https://linux.die.net/man/1/rsautl
#   https://www.openssl.org/docs/man1.0.2/man1/openssl-enc.html
#   https://www.czeskis.com/random/openssl-encrypt-file.html
#   https://rietta.com/blog/openssl-generating-rsa-key-from-command/
# TODO:
#   Decrypt files and consult in the current shell
#   Is there a standard way to locate the local .PEMs?
#   Allow parameter override of KEY_DIR
#   Standard approach for parameter handling
#   Document manual equivelant in README
#   Docker execution
#   Capture Macos (Brew) and Debian package manager dependencies
#   Test package dependencies
#   Test suite
#   Key structure diagram
#   Adopt Google Coding standards: https://google.github.io/styleguide/shell.xml

# Constants
readonly KEY_DIR=~/.ssh
readonly CIPHERNAME='aes-256-cbc'
readonly RSA_KEY_SIZE='2048'
readonly RSA_KEY_ALGO='des3'
readonly RECIPIENTS_DIR='recipients'
readonly SECRETS_FILE='secret-files.txt'
readonly ARCHIVE_FILE='archive'
#readonly TAR_DEBUG=' '
#readonly ENC_DEBUG=' '
readonly TAR_DEBUG='--verbose'
readonly ENC_DEBUG='-v'

# Parameters
readonly COMMAND="${1:list}"
readonly PUBLIC_PRIVATE_PAIR="${2}"

if [[ "${COMMAND?}" == 'generate-keypair' ]] ;
then

  openssl genrsa -${RSA_KEY_ALGO?} \
    -out "${PUBLIC_PRIVATE_PAIR?}.pem" \
    ${RSA_KEY_SIZE?} \
  && mv "${PUBLIC_PRIVATE_PAIR?}.pem" "${KEY_DIR?}/." \
  && chmod 600 "${KEY_DIR?}/${PUBLIC_PRIVATE_PAIR?}.pem" \
  ; ls -l "${KEY_DIR?}/${PUBLIC_PRIVATE_PAIR?}.pem"

elif [[ "${COMMAND?}" == 'list-available-keypairs' ]] ;
then

  # List PEM files in the local key store
  find "${KEY_DIR?}" \
    -name "*.pem" \
    | while read -r public_private_pair_pem_file ;
    do
      echo -n "[${KEY_DIR?}/] " ;
      public_private_pair="${public_private_pair_pem_file//.pem/}" ;
      public_key_file="${RECIPIENTS_DIR?}/$(basename "${public_private_pair?}".public)" ;
      if [[ -e "${public_key_file}" ]] ;
      then
        echo "$public_private_pair_pem_file?} (.pem format, installed to ${RECIPIENTS_DIR?})" ;
      else
        echo "${public_private_pair_pem_file?} (.pem format)" ;
      fi ;
    done ;

  # List RSA files in the local key store
  find "${KEY_DIR?}" \
    -name "*.pub" \
    | while read -r public_private_pair_pem_file ;
    do
      echo -n "[${KEY_DIR?}/] " ;
      public_private_pair="${public_private_pair_pem_file//.pub/}" ;
      public_key_file="${RECIPIENTS_DIR?}/$(basename "${public_private_pair?}".public)" ;
      if [[ -e "${public_key_file}" ]] ;
      then
        echo "${public_private_pair?} (RSA format, installed to ${RECIPIENTS_DIR?})" ;
      else
        echo "${public_private_pair?} (RSA format)" ;
      fi ;
    done ;

elif [[ "${COMMAND?}" == 'list-recipients' ]] ;
then

  # List public key files in the local key store
  find "${RECIPIENTS_DIR?}" \
    -name "*.public" \
    | while read -r public_key_file ;
    do
      echo -n "[${RECIPIENTS_DIR?}/] " ;
      recipient=$(basename "${public_key_file?}" | sed -e 's/.public$//') ;
      public_private_pair_pem_file="${KEY_DIR?}/${recipient?}.pem" ;
      public_private_pair_rsa_file="${KEY_DIR?}/${recipient?}" ;
      if [[ -e "${public_private_pair_pem_file}" ]] ;
      then
        echo "${recipient?} (PEM is available locally in ${KEY_DIR?})" ;
      elif [[ -e "${public_private_pair_rsa_file}" ]] ;
      then
        echo "${recipient?} (RSA is available locally in ${KEY_DIR?})" ;
      else
        echo "${recipient?}" ;
      fi ;
    done ;

elif [[ "${COMMAND?}" == 'add-recipient' ]] ;
then

  # Resolve file names
  recipient=$(basename "${PUBLIC_PRIVATE_PAIR?}" | sed -e 's/.pem$//') ;
  public_private_pair_rsa_file="${KEY_DIR?}/${recipient?}.pem" ;
  public_private_pair_pem_file="${KEY_DIR?}/${recipient?}.pem" ;

  # Generate a PEM if we need to and add to the local key store
  if [[ ! -e "${public_private_pair_pem_file?}" && -e "${public_private_pair_rsa_file?}" ]] ;
  then
     echo "Found RSA \"${public_private_pair_rsa_file?}\" generating a PEM and adding to \"${KEY_DIR?}\"" \
     && openssl rsa \
       -in "${public_private_pair_rsa_file?}" \
       -outform pem \
       > "${public_private_pair_pem_file?}" \
     && chmod 600 "${public_private_pair_pem_file?}" ;
  fi ;

  # Extract a public key from the key store and add this to the recipients list
  if [[ -e "${public_private_pair_pem_file?}" ]] ;
  then
    echo "Found .pem \"${public_private_pair_pem_file?}\" extracting the public key and adding to \"${RECIPIENTS_DIR?}\"" \
    && mkdir -p "${RECIPIENTS_DIR?}" \
    && openssl rsa \
      -in "${public_private_pair_pem_file?}" \
      -pubout \
      > "${RECIPIENTS_DIR?}/${recipient?}.public" \
    ; "./${0}" list-recipients

  fi ;

elif [[ "${COMMAND?}" == 'remove-recipient' ]] ;
then

  # Remove a public key from the recipients list
  rm "${RECIPIENTS_DIR?}/${PUBLIC_PRIVATE_PAIR?}.public" \
  ; "./${0}" list-recipients

elif [[ "${COMMAND?}" == 'encrypt' ]] ;
then

  # Build an archive containing all the secret files,
  # then encrypt the secret archive for each registered recipient
  rm -f "${ARCHIVE_FILE?}.tar" \
  && while IFS='' read -r SECRET_FILE ;
    do
      tar -r ${TAR_DEBUG} \
        --file "${ARCHIVE_FILE?}.tar" \
        "${SECRET_FILE?}" ;
    done < "${SECRETS_FILE?}" \
  && ls -l "${ARCHIVE_FILE?}.tar" \
  && rm -f "${ARCHIVE_FILE?}.enc.tar" \
  && find "${RECIPIENTS_DIR?}" \
    -name "*.public" \
    | while read -r PUBLIC_KEY_FILE ;
    do
      echo "Encrypting \"${ARCHIVE_FILE?}.tar\" with public key \"${PUBLIC_KEY_FILE?}\"" ;
      recipient=$(basename "${PUBLIC_KEY_FILE?}" | sed -e 's/.public$//') \
      && rm -f "${recipient?}.key.bin" \
      && openssl rand -base64 32 > "${recipient?}.key.bin" \
      && rm -f "${recipient?}.key.bin.enc" \
      && openssl rsautl \
        -encrypt \
        -inkey "${PUBLIC_KEY_FILE?}" \
        -pubin \
        -in "${recipient?}.key.bin" \
        -out "${recipient?}.key.bin.enc" \
      && tar -r ${TAR_DEBUG} \
        --file "${ARCHIVE_FILE?}.enc.tar" \
        "${recipient?}.key.bin.enc" \
      ; rm -f "${recipient?}.key.bin.enc" \
      ; rm -f "${recipient?}.${ARCHIVE_FILE?}.tar.enc" \
      && openssl enc -${CIPHERNAME?} ${ENC_DEBUG} \
        -salt \
        -in "${ARCHIVE_FILE?}.tar" \
        -out "${recipient?}.${ARCHIVE_FILE?}.tar.enc" \
        -pass "file:./${recipient?}.key.bin" \
      ; rm -f "${recipient?}.key.bin" \
      && tar -r ${TAR_DEBUG} \
        --file "${ARCHIVE_FILE?}.enc.tar" \
        "${recipient?}.${ARCHIVE_FILE?}.tar.enc" \
      && rm "${recipient?}.${ARCHIVE_FILE?}.tar.enc" ;
    done \
  ; rm -f "${ARCHIVE_FILE?}.tar" \
  ; ls -l "${ARCHIVE_FILE?}.enc.tar" ;

elif [[ "${COMMAND?}" == 'decrypt' ]] ;
then

  # Extract for the recipients for which a keypair exists locally
  rm -f "${ARCHIVE_FILE?}.tar" \
  && tar -t \
    --file "${ARCHIVE_FILE?}.enc.tar" \
    | grep 'key.bin.enc$' \
    | while read -r recipient_key_encrypted ;
    do
      echo "recipient_key_encrypted = \"${recipient_key_encrypted?}\""
      recipient=$(basename "${recipient_key_encrypted?}" | sed -e 's/.key.bin.enc$//') \
      && public_private_pair_pem_file="${KEY_DIR?}/${recipient?}.pem" \
      && if [[ -e "${public_private_pair_pem_file?}" ]] ;
      then
        echo "Decrypting \"${recipient?}.${ARCHIVE_FILE?}.tar.enc\" with public key \"${public_private_pair_pem_file?}\"" ;
        tar -x ${TAR_DEBUG} \
          --file "${ARCHIVE_FILE?}.enc.tar" "${recipient?}.key.bin.enc" \
        && tar -x ${TAR_DEBUG} \
          --file "${ARCHIVE_FILE?}.enc.tar" "${recipient?}.${ARCHIVE_FILE?}.tar.enc" \
        && openssl rsautl \
          -decrypt \
          -inkey "${public_private_pair_pem_file?}" \
          -in "${recipient?}.key.bin.enc" \
          -out "${recipient?}.key.bin" \
        && rm -f "${recipient?}.key.bin.enc" \
        && openssl enc -${CIPHERNAME?} ${ENC_DEBUG} \
          -d \
          -in "${recipient?}.${ARCHIVE_FILE?}.tar.enc" \
          -out "${ARCHIVE_FILE?}.tar" \
          -pass "file:./${recipient?}.key.bin" \
        ; rm -f "${recipient?}.key.bin" \
        ; rm -f "${recipient?}.${ARCHIVE_FILE?}.tar.enc" \
        && tar -x ${TAR_DEBUG} \
          --file "${ARCHIVE_FILE?}.tar" \
        ; rm -f "${ARCHIVE_FILE?}.tar" ;
      else
        echo "Skipping \"${public_private_pair_pem_file?}\" (no local key pair)" ;
      fi ;
    done ;

elif [[ "${COMMAND?}" == 'decrypt-to-env' ]] ;
then

  echo 'TODO: Decrypt files and consult in the current shell' ;

else

  echo 'Usage:' ;
  echo '  ./open-ssl-pk-enc.sh generate-keypair <keypair name>' ;
  echo '  ./open-ssl-pk-enc.sh list-available-keypairs' ;
  echo '  ./open-ssl-pk-enc.sh list-recipients' ;
  echo '  ./open-ssl-pk-enc.sh add-recipient <.pem filename>' ;
  echo '  ./open-ssl-pk-enc.sh remove-recipient <.pem filename>' ;
  echo '  ./open-ssl-pk-enc.sh encrypt' ;
  echo '  ./open-ssl-pk-enc.sh decrypt' ;
  echo '  ./open-ssl-pk-enc.sh decrypt-to-env' ;

fi ;
