package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * AudioObject
 *
 * An audio file.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class AudioObject extends MediaObject {
  /**
   * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the <a class="localLink" href="https://schema.org/encodingFormat">encodingFormat</a>.
   */
  public MediaObject caption;

  /**
   * Represents textual captioning from a <a class="localLink" href="https://schema.org/MediaObject">MediaObject</a>, e.g. text of a 'meme'.
   */
  public String embeddedTextCaption;

  /**
   * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
   */
  public String transcript;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/AudioObject";
}

