package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * Service
 *
 * A service provided by an organization, e.g. delivery service, print services, etc.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Service extends Intangible {
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating aggregateRating;

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
   * An intended audience, i.e. a group for whom something was created.
   */
  public Audience audience;

  /**
   * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
   */
  public ServiceChannel availableChannel;

  /**
   * An award won by or for this item.
   */
  public String award;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public Brand brandBrand;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public Organization brand;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  public Organization brokerOrganization;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  public Person broker;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public PhysicalActivityCategory categoryPhysicalActivityCategory;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public CategoryCode categoryCategoryCode;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public Thing category;

  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service.
   */
  public OfferCatalog hasOfferCatalog;

  /**
   * The hours during which this service or contact is available.
   */
  public OpeningHoursSpecification hoursAvailable;

  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  public Product isRelatedToProduct;

  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  public Service isRelatedTo;

  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  public Product isSimilarToProduct;

  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  public Service isSimilarTo;

  /**
   * An associated logo.
   */
  public ImageObject logo;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a <a class="localLink" href="https://schema.org/Demand">Demand</a>. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Demand offersDemand;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a <a class="localLink" href="https://schema.org/Demand">Demand</a>. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Offer offers;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Organization providerOrganization;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Person provider;

  /**
   * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
   */
  public String providerMobility;

  /**
   * A review of the item.
   */
  public Review review;

  /**
   * The tangible thing generated by the service, e.g. a passport, permit, etc.
   */
  public Thing serviceOutput;

  /**
   * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
   */
  public GovernmentBenefitsType serviceType;

  /**
   * A slogan or motto associated with the item.
   */
  public String slogan;

  /**
   * Human-readable terms of service documentation.
   */
  public String termsOfService;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Service";
}

