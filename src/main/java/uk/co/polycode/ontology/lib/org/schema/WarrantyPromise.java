package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * WarrantyPromise
 *
 * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class WarrantyPromise extends StructuredValue {
  /**
   * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
   */
  public QuantitativeValue durationOfWarranty;

  /**
   * The scope of the warranty promise.
   */
  public WarrantyScope warrantyScope;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/WarrantyPromise";
}

