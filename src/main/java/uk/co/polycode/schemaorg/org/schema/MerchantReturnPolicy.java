package uk.co.polycode.schemaorg.org.schema;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZonedDateTime;

/**
 * MerchantReturnPolicy
 *
 * A MerchantReturnPolicy provides information about product return policies associated with an <a class="localLink" href="https://schema.org/Organization">Organization</a>, <a class="localLink" href="https://schema.org/Product">Product</a>, or <a class="localLink" href="https://schema.org/Offer">Offer</a>.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MerchantReturnPolicy extends Intangible {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/MerchantReturnPolicy";

  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>
   *
   * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   */
  public PropertyValue additionalProperty;

  /**
   * A country where a particular merchant return policy applies to, for example the two-letter ISO 3166-1 alpha-2 country code.
   */
  public Country applicableCountry;

  /**
   * The type of return fees if the product is returned due to customer remorse.
   */
  public ReturnFeesEnumeration customerRemorseReturnFees;

  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
   */
  public ReturnLabelSourceEnumeration customerRemorseReturnLabelSource;

  /**
   * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property <a class="localLink" href="https://schema.org/customerRemorseReturnFees">customerRemorseReturnFees</a> equals <a class="localLink" href="https://schema.org/ReturnShippingFees">ReturnShippingFees</a>.
   */
  public MonetaryAmount customerRemorseReturnShippingFeesAmount;

  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   */
  public OfferItemCondition itemCondition;

  /**
   * The type of return fees for returns of defect products.
   */
  public ReturnFeesEnumeration itemDefectReturnFees;

  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
   */
  public ReturnLabelSourceEnumeration itemDefectReturnLabelSource;

  /**
   * Amount of shipping costs for defect product returns. Applicable when property <a class="localLink" href="https://schema.org/itemDefectReturnFees">itemDefectReturnFees</a> equals <a class="localLink" href="https://schema.org/ReturnShippingFees">ReturnShippingFees</a>.
   */
  public MonetaryAmount itemDefectReturnShippingFeesAmount;

  /**
   * Specifies a Web page or service by URL, for product returns.
   */
  public String merchantReturnLink;

  /**
   * A refund type, from an enumerated list.
   */
  public RefundTypeEnumeration refundType;

  /**
   * Use <a class="localLink" href="https://schema.org/MonetaryAmount">MonetaryAmount</a> to specify a fixed restocking fee for product returns, or use <a class="localLink" href="https://schema.org/Number">Number</a> to specify a percentage of the product price paid by the customer.
   */
  public MonetaryAmount restockingFee;

  /**
   * Use <a class="localLink" href="https://schema.org/MonetaryAmount">MonetaryAmount</a> to specify a fixed restocking fee for product returns, or use <a class="localLink" href="https://schema.org/Number">Number</a> to specify a percentage of the product price paid by the customer.
   */
  public BigDecimal restockingFeeBigDecimal;

  /**
   * The type of return fees for purchased products (for any return reason)
   */
  public ReturnFeesEnumeration returnFees;

  /**
   * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
   */
  public ReturnLabelSourceEnumeration returnLabelSource;

  /**
   * The type of return method offered, specified from an enumeration.
   */
  public ReturnMethodEnumeration returnMethod;

  /**
   * Specifies an applicable return policy (from an enumeration).
   */
  public MerchantReturnEnumeration returnPolicyCategory;

  /**
   * The country where the product has to be sent to for returns, for example "Ireland" using the <a class="localLink" href="https://schema.org/name">name</a> property of <a class="localLink" href="https://schema.org/Country">Country</a>. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>. Note that this can be different from the country where the product was originally shipped from or sent too.
   */
  public Country returnPolicyCountry;

  /**
   * Seasonal override of a return policy.
   */
  public MerchantReturnPolicySeasonalOverride returnPolicySeasonalOverride;

  /**
   * Amount of shipping costs for product returns (for any reason). Applicable when property <a class="localLink" href="https://schema.org/returnFees">returnFees</a> equals <a class="localLink" href="https://schema.org/ReturnShippingFees">ReturnShippingFees</a>.
   */
  public MonetaryAmount returnShippingFeesAmount;

  /**
   * Are in-store returns offered? (for more advanced return methods use the <a class="localLink" href="https://schema.org/returnMethod">returnMethod</a> property)
   */
  public Boolean inStoreReturnsOffered;

  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the <a class="localLink" href="https://schema.org/returnPolicyCategory">returnPolicyCategory</a> property is specified as <a class="localLink" href="https://schema.org/MerchantReturnFiniteReturnWindow">MerchantReturnFiniteReturnWindow</a>.
   */
  public ZonedDateTime merchantReturnDays;

  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the <a class="localLink" href="https://schema.org/returnPolicyCategory">returnPolicyCategory</a> property is specified as <a class="localLink" href="https://schema.org/MerchantReturnFiniteReturnWindow">MerchantReturnFiniteReturnWindow</a>.
   */
  public ZonedDateTime merchantReturnDaysZonedDateTime;

  /**
   * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the <a class="localLink" href="https://schema.org/returnPolicyCategory">returnPolicyCategory</a> property is specified as <a class="localLink" href="https://schema.org/MerchantReturnFiniteReturnWindow">MerchantReturnFiniteReturnWindow</a>.
   */
  public BigInteger merchantReturnDaysBigInteger;
}
