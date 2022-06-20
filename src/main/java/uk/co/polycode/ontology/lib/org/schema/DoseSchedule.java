package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.math.BigDecimal;

/**
 * DoseSchedule
 *
 * A specific dosing schedule for a drug or supplement.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class DoseSchedule extends MedicalIntangible {
  /**
   * The unit of the dose, e.g. 'mg'.
   */
  public String doseUnit;

  /**
   * The value of the dose, e.g. 500.
   */
  public BigDecimal doseValueBigDecimal;

  /**
   * The value of the dose, e.g. 500.
   */
  public QualitativeValue doseValue;

  /**
   * How often the dose is taken, e.g. 'daily'.
   */
  public String frequency;

  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   */
  public String targetPopulation;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/DoseSchedule";
}

