package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * MusicGroup
 *
 * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MusicGroup extends PerformingGroup {
  /**
   * A music album.
   */
  public MusicAlbum album;

  /**
   * Genre of the creative work, broadcast channel or group.
   */
  public String genre;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
   */
  public MusicRecording trackMusicRecording;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
   */
  public ItemList track;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/MusicGroup";
}

