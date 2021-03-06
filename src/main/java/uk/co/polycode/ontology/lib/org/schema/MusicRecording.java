package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * MusicRecording
 *
 * A music recording (track), usually a single song.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MusicRecording extends CreativeWork {
  /**
   * The artist that performed this album or recording.
   */
  public MusicGroup byArtistMusicGroup;

  /**
   * The artist that performed this album or recording.
   */
  public Person byArtist;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
   */
  public Duration duration;

  /**
   * The album to which this recording belongs.
   */
  public MusicAlbum inAlbum;

  /**
   * The playlist to which this recording belongs.
   */
  public MusicPlaylist inPlaylist;

  /**
   * The International Standard Recording Code for the recording.
   */
  public String isrcCode;

  /**
   * The composition this track is a recording of.
   */
  public MusicComposition recordingOf;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/MusicRecording";
}

