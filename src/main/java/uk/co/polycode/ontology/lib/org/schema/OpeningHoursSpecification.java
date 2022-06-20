package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.time.ZonedDateTime;

/**
 * OpeningHoursSpecification
 *
 * A structured value providing information about the opening hours of a place or a certain service inside a place.<br/><br/>
 *
 * The place is <strong>open</strong> if the <a class="localLink" href="https://schema.org/opens">opens</a> property is specified, and <strong>closed</strong> otherwise.<br/><br/>
 *
 * If the value for the <a class="localLink" href="https://schema.org/closes">closes</a> property is less than the value for the <a class="localLink" href="https://schema.org/opens">opens</a> property then the hour range is assumed to span over the next day.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class OpeningHoursSpecification extends StructuredValue {
  /**
   * The day of the week for which these opening hours are valid.
   */
  public DayOfWeek dayOfWeek;

  /**
   * The closing hour of the place or service on the given day(s) of the week.
   */
  public ZonedDateTime closes;

  /**
   * The opening hour of the place or service on the given day(s) of the week.
   */
  public ZonedDateTime opens;

  /**
   * The date when the item becomes valid.
   */
  public ZonedDateTime validFromZonedDateTime;

  /**
   * The date when the item becomes valid.
   */
  public ZonedDateTime validFrom;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  public ZonedDateTime validThroughZonedDateTime;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  public ZonedDateTime validThrough;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/OpeningHoursSpecification";
}

