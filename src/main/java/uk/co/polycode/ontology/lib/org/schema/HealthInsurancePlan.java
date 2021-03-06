package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.net.URL;

/**
 * HealthInsurancePlan
 *
 * A US-style health insurance plan, including PPOs, EPOs, and HMOs.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class HealthInsurancePlan extends Intangible {
  /**
   * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
   */
  public URL benefitsSummaryUrl;

  /**
   * A contact point for a person or organization.
   */
  public ContactPoint contactPoint;

  /**
   * TODO.
   */
  public String healthPlanDrugOption;

  /**
   * The tier(s) of drugs offered by this formulary or insurance plan.
   */
  public String healthPlanDrugTier;

  /**
   * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
   */
  public String healthPlanId;

  /**
   * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
   */
  public URL healthPlanMarketingUrl;

  /**
   * Formularies covered by this plan.
   */
  public HealthPlanFormulary includesHealthPlanFormulary;

  /**
   * Networks covered by this plan.
   */
  public HealthPlanNetwork includesHealthPlanNetwork;

  /**
   * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare &amp; Medicaid Services for more details.
   */
  public String usesHealthPlanIdStandard;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/HealthInsurancePlan";
}

