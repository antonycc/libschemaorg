package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;
import java.math.BigInteger;

/**
 * MusicPlaylist
 *
 * A collection of music tracks in playlist form.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MusicPlaylist extends CreativeWork {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/MusicPlaylist";

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
   */
  public ItemList track;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
   */
  public MusicRecording trackMusicRecording;

  /**
   * The number of tracks in this album or playlist.
   */
  public BigInteger numTracks;
}
