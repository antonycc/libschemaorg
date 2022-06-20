package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * DataFeed
 *
 * A single feed providing structured information about one or more entities or topics.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class DataFeed extends Dataset {
  /**
   * An item within in a data feed. Data feeds may have many elements.
   */
  public DataFeedItem dataFeedElementDataFeedItem;

  /**
   * An item within in a data feed. Data feeds may have many elements.
   */
  public Thing dataFeedElement;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/DataFeed";
}

