package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * MedicalDevice
 *
 * Any object used in a medical capacity, such as to diagnose or treat a patient.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MedicalDevice extends MedicalEntity {
  /**
   * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
   */
  public MedicalEntity adverseOutcome;

  /**
   * A contraindication for this therapy.
   */
  public MedicalContraindication contraindication;

  /**
   * A description of the postoperative procedures, care, and/or followups for this device.
   */
  public String postOp;

  /**
   * A description of the workup, testing, and other preparations required before implanting this device.
   */
  public String preOp;

  /**
   * A description of the procedure involved in setting up, using, and/or installing the device.
   */
  public String procedure;

  /**
   * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
   */
  public MedicalEntity seriousAdverseOutcome;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/MedicalDevice";
}

