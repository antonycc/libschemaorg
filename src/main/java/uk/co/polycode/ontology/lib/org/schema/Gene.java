package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * Gene
 *
 * A discrete unit of inheritance which affects one or more biological traits (Source: <a href="https://en.wikipedia.org/wiki/Gene">https://en.wikipedia.org/wiki/Gene</a>). Examples include FOXP2 (Forkhead box protein P2), SCARNA21 (small Cajal body-specific RNA 21), A- (agouti genotype).
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Gene extends BioChemEntity {
  /**
   * Another gene which is a variation of this one.
   */
  public Gene alternativeOf;

  /**
   * Another BioChemEntity encoded by this one.
   */
  public BioChemEntity encodesBioChemEntity;

  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  public AnatomicalStructure expressedInAnatomicalStructure;

  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  public AnatomicalSystem expressedInAnatomicalSystem;

  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  public BioChemEntity expressedInBioChemEntity;

  /**
   * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
   */
  public DefinedTerm expressedIn;

  /**
   * A symbolic representation of a BioChemEnity. For example, a nucleotide sequence of a Gene or an amino acid sequence of a Protein.
   */
  public String hasBioPolymerSequence;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/Gene";
}

