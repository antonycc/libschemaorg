package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * DrugLegalStatus
 *
 * The legal availability status of a medical drug.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class DrugLegalStatus extends MedicalIntangible {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/DrugLegalStatus";

  /**
   * The location in which the status applies.
   */
  public AdministrativeArea applicableLocation;
}
