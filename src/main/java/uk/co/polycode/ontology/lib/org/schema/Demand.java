package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Demand
 *
 * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Demand extends Intangible {
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  public PaymentMethod acceptedPaymentMethodPaymentMethod;

  /**
   * The payment method(s) accepted by seller for this offer.
   */
  public LoanOrCredit acceptedPaymentMethod;

  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  public QuantitativeValue advanceBookingRequirement;

  /**
   * The geographic area where a service or offered item is provided.
   */
  public GeoShape areaServedGeoShape;

  /**
   * The geographic area where a service or offered item is provided.
   */
  public Place areaServedPlace;

  /**
   * The geographic area where a service or offered item is provided.
   */
  public AdministrativeArea areaServed;

  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  public ItemAvailability availability;

  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   */
  public Place availableAtOrFrom;

  /**
   * The delivery method(s) available for this offer.
   */
  public DeliveryMethod availableDeliveryMethod;

  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  public BusinessFunction businessFunction;

  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
   */
  public QuantitativeValue deliveryLeadTime;

  /**
   * The type(s) of customers for which the given offer is valid.
   */
  public BusinessEntityType eligibleCustomerType;

  /**
   * The duration for which the given offer is valid.
   */
  public QuantitativeValue eligibleDuration;

  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  public QuantitativeValue eligibleQuantity;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>
   *
   * See also <a class="localLink" href="https://schema.org/ineligibleRegion">ineligibleRegion</a>.
   */
  public Place eligibleRegionPlace;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>
   *
   * See also <a class="localLink" href="https://schema.org/ineligibleRegion">ineligibleRegion</a>.
   */
  public GeoShape eligibleRegion;

  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  public PriceSpecification eligibleTransactionVolume;

  /**
   * A Global Trade Item Number (<a href="https://www.gs1.org/standards/id-keys/gtin">GTIN</a>). GTINs identify trade items, including products and services, using numeric identification codes. The <a class="localLink" href="https://schema.org/gtin">gtin</a> property generalizes the earlier <a class="localLink" href="https://schema.org/gtin8">gtin8</a>, <a class="localLink" href="https://schema.org/gtin12">gtin12</a>, <a class="localLink" href="https://schema.org/gtin13">gtin13</a>, and <a class="localLink" href="https://schema.org/gtin14">gtin14</a> properties. The GS1 <a href="https://www.gs1.org/standards/Digital-Link/">digital link specifications</a> express GTINs as URLs. A correct <a class="localLink" href="https://schema.org/gtin">gtin</a> value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a "GS1 Digital Link" URL based on such a string. The numeric component should also have a <a href="https://www.gs1.org/services/check-digit-calculator">valid GS1 check digit</a> and meet the other rules for valid GTINs. See also <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1's GTIN Summary</a> and <a href="https://en.wikipedia.org/wiki/Global_Trade_Item_Number">Wikipedia</a> for more details. Left-padding of the gtin values is not required or encouraged.
   */
  public String gtin;

  /**
   * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String gtin12;

  /**
   * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String gtin13;

  /**
   * The GTIN-14 code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String gtin14;

  /**
   * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String gtin8;

  /**
   * This links to a node or nodes indicating the exact quantity of the products included in  an <a class="localLink" href="https://schema.org/Offer">Offer</a> or <a class="localLink" href="https://schema.org/ProductCollection">ProductCollection</a>.
   */
  public TypeAndQuantityNode includesObject;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>
   *
   * See also <a class="localLink" href="https://schema.org/eligibleRegion">eligibleRegion</a>.
   */
  public GeoShape ineligibleRegionGeoShape;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>
   *
   * See also <a class="localLink" href="https://schema.org/eligibleRegion">eligibleRegion</a>.
   */
  public Place ineligibleRegion;

  /**
   * The current approximate inventory level for the item or items.
   */
  public QuantitativeValue inventoryLevel;

  /**
   * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
   */
  public OfferItemCondition itemCondition;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Event itemOfferedEvent;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Product itemOfferedProduct;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public AggregateOffer itemOfferedAggregateOffer;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public CreativeWork itemOfferedCreativeWork;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public MenuItem itemOfferedMenuItem;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Service itemOfferedService;

  /**
   * An item being offered (or demanded). The transactional nature of the offer or demand is documented using <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a>, e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Trip itemOffered;

  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  public String mpn;

  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  public PriceSpecification priceSpecification;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  public Organization sellerOrganization;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  public Person seller;

  /**
   * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
   */
  public String serialNumber;

  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  public String sku;

  /**
   * The warranty promise(s) included in the offer.
   */
  public WarrantyPromise warranty;

  /**
   * The end of the availability of the product or service included in the offer.
   */
  public ZonedDateTime availabilityEndsZonedDateTime;

  /**
   * The end of the availability of the product or service included in the offer.
   */
  public ZonedDateTime availabilityEnds;

  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  public ZonedDateTime availabilityStartsZonedDateTime;

  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  public ZonedDateTime availabilityStarts;

  /**
   * The date when the item becomes valid.
   */
  public ZonedDateTime validFromZonedDateTime;

  /**
   * The date when the item becomes valid.
   */
  public ZonedDateTime validFrom;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  public ZonedDateTime validThroughZonedDateTime;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  public ZonedDateTime validThrough;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Demand";
}

