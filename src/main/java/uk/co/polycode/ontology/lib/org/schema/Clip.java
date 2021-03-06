package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Clip
 *
 * A short TV or radio program or a segment/part of a program.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Clip extends CreativeWork {
  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  public Person actor;

  /**
   * Position of the clip within an ordered group of clips.
   */
  public BigInteger clipNumber;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   */
  public Person director;

  /**
   * The end time of the clip expressed as the number of seconds from the beginning of the work.
   */
  public BigDecimal endOffsetBigDecimal;

  /**
   * The end time of the clip expressed as the number of seconds from the beginning of the work.
   */
  public HyperTocEntry endOffset;

  /**
   * The composer of the soundtrack.
   */
  public MusicGroup musicByMusicGroup;

  /**
   * The composer of the soundtrack.
   */
  public Person musicBy;

  /**
   * The episode to which this clip belongs.
   */
  public Episode partOfEpisode;

  /**
   * The season to which this episode belongs.
   */
  public CreativeWorkSeason partOfSeason;

  /**
   * The series to which this episode or season belongs.
   */
  public CreativeWorkSeries partOfSeries;

  /**
   * The start time of the clip expressed as the number of seconds from the beginning of the work.
   */
  public BigDecimal startOffsetBigDecimal;

  /**
   * The start time of the clip expressed as the number of seconds from the beginning of the work.
   */
  public HyperTocEntry startOffset;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Clip";
}

