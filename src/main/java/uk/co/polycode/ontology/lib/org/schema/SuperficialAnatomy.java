package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * SuperficialAnatomy
 *
 * Anatomical features that can be observed by sight (without dissection), including the form and proportions of the human body as well as surface landmarks that correspond to deeper subcutaneous structures. Superficial anatomy plays an important role in sports medicine, phlebotomy, and other medical specialties as underlying anatomical structures can be identified through surface palpation. For example, during back surgery, superficial anatomy can be used to palpate and count vertebrae to find the site of incision. Or in phlebotomy, superficial anatomy can be used to locate an underlying vein; for example, the median cubital vein can be located by palpating the borders of the cubital fossa (such as the epicondyles of the humerus) and then looking for the superficial signs of the vein, such as size, prominence, ability to refill after depression, and feel of surrounding tissue support. As another example, in a subluxation (dislocation) of the glenohumeral joint, the bony structure becomes pronounced with the deltoid muscle failing to cover the glenohumeral joint allowing the edges of the scapula to be superficially visible. Here, the superficial anatomy is the visible edges of the scapula, implying the underlying dislocation of the joint (the related anatomical structure).
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class SuperficialAnatomy extends MedicalEntity {
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   */
  public String associatedPathophysiology;

  /**
   * Anatomical systems or structures that relate to the superficial anatomy.
   */
  public AnatomicalSystem relatedAnatomyAnatomicalSystem;

  /**
   * Anatomical systems or structures that relate to the superficial anatomy.
   */
  public AnatomicalStructure relatedAnatomy;

  /**
   * A medical condition associated with this anatomy.
   */
  public MedicalCondition relatedCondition;

  /**
   * A medical therapy related to this anatomy.
   */
  public MedicalTherapy relatedTherapy;

  /**
   * The significance associated with the superficial anatomy; as an example, how characteristics of the superficial anatomy can suggest underlying medical conditions or courses of treatment.
   */
  public String significance;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/SuperficialAnatomy";
}

