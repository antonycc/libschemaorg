package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * Class
 *
 * A class, also often called a 'Type'; equivalent to rdfs:Class.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Class extends Intangible {
  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  public Enumeration supersededByEnumeration;

  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  public Property supersededByProperty;

  /**
   * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
   */
  public Class supersededBy;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://meta.schema.org/Class";
}

