package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * MedicalStudy
 *
 * A medical study is an umbrella type covering all kinds of research studies relating to human medicine or health, including observational studies and interventional trials and registries, randomized, controlled or not. When the specific type of study is known, use one of the extensions of this type, such as MedicalTrial or MedicalObservationalStudy. Also, note that this type should be used to mark up data that describes the study itself; to tag an article that publishes the results of a study, use MedicalScholarlyArticle. Note: use the code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MedicalStudy extends MedicalEntity {
  /**
   * Specifying the health condition(s) of a patient, medical study, or other target audience.
   */
  public MedicalCondition healthCondition;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  public Organization sponsorOrganization;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  public Person sponsor;

  /**
   * The status of the study (enumerated).
   */
  public EventStatusType statusEventStatusType;

  /**
   * The status of the study (enumerated).
   */
  public MedicalStudyStatus status;

  /**
   * The location in which the study is taking/took place.
   */
  public AdministrativeArea studyLocation;

  /**
   * A subject of the study, i.e. one of the medical conditions, therapies, devices, drugs, etc. investigated by the study.
   */
  public MedicalEntity studySubject;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/MedicalStudy";
}

