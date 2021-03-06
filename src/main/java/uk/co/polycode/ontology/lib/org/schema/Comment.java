package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.math.BigInteger;

/**
 * Comment
 *
 * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the <a class="localLink" href="https://schema.org/text">text</a> property, and its topic via <a class="localLink" href="https://schema.org/about">about</a>, properties shared with all CreativeWorks.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Comment extends CreativeWork {
  /**
   * The parent of a question, answer or item in general.
   */
  public Comment parentItem;

  /**
   * The number of downvotes this question, answer or comment has received from the community.
   */
  public BigInteger downvoteCount;

  /**
   * The number of upvotes this question, answer or comment has received from the community.
   */
  public BigInteger upvoteCount;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Comment";
}

