package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.math.BigInteger;
import java.time.ZonedDateTime;

/**
 * Schedule
 *
 * A schedule defines a repeating time period used to describe a regularly occurring <a class="localLink" href="https://schema.org/Event">Event</a>. At a minimum a schedule will specify <a class="localLink" href="https://schema.org/repeatFrequency">repeatFrequency</a> which describes the interval between occurences of the event. Additional information can be provided to specify the schedule more precisely.
 *       This includes identifying the day(s) of the week or month when the recurring event will take place, in addition to its start and end time. Schedules may also
 *       have start and end dates to indicate when they are active, e.g. to define a limited calendar of events.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Schedule extends Intangible {
  /**
   * Defines the day(s) of the week on which a recurring <a class="localLink" href="https://schema.org/Event">Event</a> takes place. May be specified using either <a class="localLink" href="https://schema.org/DayOfWeek">DayOfWeek</a>, or alternatively <a class="localLink" href="https://schema.org/Text">Text</a> conforming to iCal's syntax for byDay recurrence rules.
   */
  public DayOfWeek byDay;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
   */
  public Duration duration;

  /**
   * Defines the frequency at which <a class="localLink" href="https://schema.org/Event">Event</a>s will occur according to a schedule <a class="localLink" href="https://schema.org/Schedule">Schedule</a>. The intervals between
   *       events should be defined as a <a class="localLink" href="https://schema.org/Duration">Duration</a> of time.
   */
  public Duration repeatFrequency;

  /**
   * Indicates the timezone for which the time(s) indicated in the <a class="localLink" href="https://schema.org/Schedule">Schedule</a> are given. The value provided should be among those listed in the IANA Time Zone Database.
   */
  public String scheduleTimezone;

  /**
   * Defines the month(s) of the year on which a recurring <a class="localLink" href="https://schema.org/Event">Event</a> takes place. Specified as an <a class="localLink" href="https://schema.org/Integer">Integer</a> between 1-12. January is 1.
   */
  public BigInteger byMonth;

  /**
   * Defines the day(s) of the month on which a recurring <a class="localLink" href="https://schema.org/Event">Event</a> takes place. Specified as an <a class="localLink" href="https://schema.org/Integer">Integer</a> between 1-31.
   */
  public BigInteger byMonthDay;

  /**
   * Defines the week(s) of the month on which a recurring Event takes place. Specified as an Integer between 1-5. For clarity, byMonthWeek is best used in conjunction with byDay to indicate concepts like the first and third Mondays of a month.
   */
  public BigInteger byMonthWeek;

  /**
   * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime endDateZonedDateTime;

  /**
   * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime endDate;

  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>
   *
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  public ZonedDateTime endTimeZonedDateTime;

  /**
   * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>
   *
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  public ZonedDateTime endTime;

  /**
   * Defines a <a class="localLink" href="https://schema.org/Date">Date</a> or <a class="localLink" href="https://schema.org/DateTime">DateTime</a> during which a scheduled <a class="localLink" href="https://schema.org/Event">Event</a> will not take place. The property allows exceptions to
   *       a <a class="localLink" href="https://schema.org/Schedule">Schedule</a> to be specified. If an exception is specified as a <a class="localLink" href="https://schema.org/DateTime">DateTime</a> then only the event that would have started at that specific date and time
   *       should be excluded from the schedule. If an exception is specified as a <a class="localLink" href="https://schema.org/Date">Date</a> then any event that is scheduled for that 24 hour period should be
   *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
   */
  public ZonedDateTime exceptDateZonedDateTime;

  /**
   * Defines a <a class="localLink" href="https://schema.org/Date">Date</a> or <a class="localLink" href="https://schema.org/DateTime">DateTime</a> during which a scheduled <a class="localLink" href="https://schema.org/Event">Event</a> will not take place. The property allows exceptions to
   *       a <a class="localLink" href="https://schema.org/Schedule">Schedule</a> to be specified. If an exception is specified as a <a class="localLink" href="https://schema.org/DateTime">DateTime</a> then only the event that would have started at that specific date and time
   *       should be excluded from the schedule. If an exception is specified as a <a class="localLink" href="https://schema.org/Date">Date</a> then any event that is scheduled for that 24 hour period should be
   *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
   */
  public ZonedDateTime exceptDate;

  /**
   * Defines the number of times a recurring <a class="localLink" href="https://schema.org/Event">Event</a> will take place
   */
  public BigInteger repeatCount;

  /**
   * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime startDateZonedDateTime;

  /**
   * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime startDate;

  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>
   *
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  public ZonedDateTime startTimeZonedDateTime;

  /**
   * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>
   *
   * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
   */
  public ZonedDateTime startTime;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/Schedule";
}

