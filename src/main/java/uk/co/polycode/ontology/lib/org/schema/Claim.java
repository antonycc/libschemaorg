package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * Claim
 *
 * A <a class="localLink" href="https://schema.org/Claim">Claim</a> in Schema.org represents a specific, factually-oriented claim that could be the <a class="localLink" href="https://schema.org/itemReviewed">itemReviewed</a> in a <a class="localLink" href="https://schema.org/ClaimReview">ClaimReview</a>. The content of a claim can be summarized with the <a class="localLink" href="https://schema.org/text">text</a> property. Variations on well known claims can have their common identity indicated via <a class="localLink" href="https://schema.org/sameAs">sameAs</a> links, and summarized with a <a class="localLink" href="https://schema.org/name">name</a>. Ideally, a <a class="localLink" href="https://schema.org/Claim">Claim</a> description includes enough contextual information to minimize the risk of ambiguity or inclarity. In practice, many claims are better understood in the context in which they appear or the interpretations provided by claim reviews.<br/><br/>
 *
 * Beyond <a class="localLink" href="https://schema.org/ClaimReview">ClaimReview</a>, the Claim type can be associated with related creative works - for example a <a class="localLink" href="https://schema.org/ScholarlyArticle">ScholarlyArticle</a> or <a class="localLink" href="https://schema.org/Question">Question</a> might be <a class="localLink" href="https://schema.org/about">about</a> some <a class="localLink" href="https://schema.org/Claim">Claim</a>.<br/><br/>
 *
 * At this time, Schema.org does not define any types of relationship between claims. This is a natural area for future exploration.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Claim extends CreativeWork {
  /**
   * Indicates an occurence of a <a class="localLink" href="https://schema.org/Claim">Claim</a> in some <a class="localLink" href="https://schema.org/CreativeWork">CreativeWork</a>.
   */
  public CreativeWork appearance;

  /**
   * For a <a class="localLink" href="https://schema.org/Claim">Claim</a> interpreted from <a class="localLink" href="https://schema.org/MediaObject">MediaObject</a> content
   *     sed to indicate a claim contained, implied or refined from the content of a <a class="localLink" href="https://schema.org/MediaObject">MediaObject</a>.
   */
  public Organization claimInterpreterOrganization;

  /**
   * For a <a class="localLink" href="https://schema.org/Claim">Claim</a> interpreted from <a class="localLink" href="https://schema.org/MediaObject">MediaObject</a> content
   *     sed to indicate a claim contained, implied or refined from the content of a <a class="localLink" href="https://schema.org/MediaObject">MediaObject</a>.
   */
  public Person claimInterpreter;

  /**
   * Indicates the first known occurence of a <a class="localLink" href="https://schema.org/Claim">Claim</a> in some <a class="localLink" href="https://schema.org/CreativeWork">CreativeWork</a>.
   */
  public CreativeWork firstAppearance;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/Claim";
}

