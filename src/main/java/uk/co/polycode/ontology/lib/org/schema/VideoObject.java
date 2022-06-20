package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * VideoObject
 *
 * A video file.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class VideoObject extends MediaObject {
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  public Person actor;

  /**
   * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the <a class="localLink" href="https://schema.org/encodingFormat">encodingFormat</a>.
   */
  public MediaObject caption;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   */
  public Person director;

  /**
   * Represents textual captioning from a <a class="localLink" href="https://schema.org/MediaObject">MediaObject</a>, e.g. text of a 'meme'.
   */
  public String embeddedTextCaption;

  /**
   * The composer of the soundtrack.
   */
  public MusicGroup musicByMusicGroup;

  /**
   * The composer of the soundtrack.
   */
  public Person musicBy;

  /**
   * Thumbnail image for an image or video.
   */
  public ImageObject thumbnail;

  /**
   * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
   */
  public String transcript;

  /**
   * The frame size of the video.
   */
  public String videoFrameSize;

  /**
   * The quality of the video.
   */
  public String videoQuality;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/VideoObject";
}

