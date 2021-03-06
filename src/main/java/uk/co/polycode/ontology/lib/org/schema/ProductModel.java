package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * ProductModel
 *
 * A datasheet or vendor specification of a product (in the sense of a prototypical description).
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class ProductModel extends Product {
  /**
   * Indicates the kind of product that this is a variant of. In the case of <a class="localLink" href="https://schema.org/ProductModel">ProductModel</a>, this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a <a class="localLink" href="https://schema.org/ProductGroup">ProductGroup</a>, the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with <a class="localLink" href="https://schema.org/ProductGroup">ProductGroup</a>, this property can apply to any <a class="localLink" href="https://schema.org/Product">Product</a> included in the group.
   */
  public ProductGroup isVariantOfProductGroup;

  /**
   * Indicates the kind of product that this is a variant of. In the case of <a class="localLink" href="https://schema.org/ProductModel">ProductModel</a>, this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a <a class="localLink" href="https://schema.org/ProductGroup">ProductGroup</a>, the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with <a class="localLink" href="https://schema.org/ProductGroup">ProductGroup</a>, this property can apply to any <a class="localLink" href="https://schema.org/Product">Product</a> included in the group.
   */
  public ProductModel isVariantOf;

  /**
   * A pointer from a previous, often discontinued variant of the product to its newer variant.
   */
  public ProductModel predecessorOf;

  /**
   * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
   */
  public ProductModel successorOf;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/ProductModel";
}

