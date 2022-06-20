package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * Brand
 *
 * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Brand extends Intangible {
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating aggregateRating;

  /**
   * An associated logo.
   */
  public ImageObject logo;

  /**
   * A review of the item.
   */
  public Review review;

  /**
   * A slogan or motto associated with the item.
   */
  public String slogan;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Brand";
}

