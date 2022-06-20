package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * PostalCodeRangeSpecification
 *
 * Indicates a range of postalcodes, usually defined as the set of valid codes between <a class="localLink" href="https://schema.org/postalCodeBegin">postalCodeBegin</a> and <a class="localLink" href="https://schema.org/postalCodeEnd">postalCodeEnd</a>, inclusively.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class PostalCodeRangeSpecification extends StructuredValue {
  /**
   * First postal code in a range (included).
   */
  public String postalCodeBegin;

  /**
   * Last postal code in the range (included). Needs to be after <a class="localLink" href="https://schema.org/postalCodeBegin">postalCodeBegin</a>.
   */
  public String postalCodeEnd;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/PostalCodeRangeSpecification";
}

