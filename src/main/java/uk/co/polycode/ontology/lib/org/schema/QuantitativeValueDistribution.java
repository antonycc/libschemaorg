package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.math.BigDecimal;

/**
 * QuantitativeValueDistribution
 *
 * A statistical distribution of values.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class QuantitativeValueDistribution extends StructuredValue {
  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
   */
  public Duration duration;

  /**
   * The median value.
   */
  public BigDecimal median;

  /**
   * The 10th percentile value.
   */
  public BigDecimal percentile10;

  /**
   * The 25th percentile value.
   */
  public BigDecimal percentile25;

  /**
   * The 75th percentile value.
   */
  public BigDecimal percentile75;

  /**
   * The 90th percentile value.
   */
  public BigDecimal percentile90;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/QuantitativeValueDistribution";
}

