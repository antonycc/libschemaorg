package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * TherapeuticProcedure
 *
 * A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class TherapeuticProcedure extends MedicalProcedure {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/TherapeuticProcedure";

  /**
   * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
   */
  public MedicalEntity adverseOutcome;

  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  public DoseSchedule doseSchedule;

  /**
   * Specifying a drug or medicine used in a medication procedure.
   */
  public Drug drug;
}
