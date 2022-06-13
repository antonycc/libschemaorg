package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Organization
 *
 * An organization such as a school, NGO, corporation, club, etc.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Organization extends Thing {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Organization";

  /**
   * For a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> or other news-related <a class="localLink" href="https://schema.org/Organization">Organization</a>, a statement about public engagement activities (for news media, the newsroom’s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
   */
  public CreativeWork actionableFeedbackPolicy;

  /**
   * Physical address of the item.
   */
  public PostalAddress address;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating aggregateRating;

  /**
   * Alumni of an organization.
   */
  public Person alumni;

  /**
   * The geographic area where a service or offered item is provided.
   */
  public AdministrativeArea areaServed;

  /**
   * The geographic area where a service or offered item is provided.
   */
  public GeoShape areaServedGeoShape;

  /**
   * The geographic area where a service or offered item is provided.
   */
  public Place areaServedPlace;

  /**
   * An award won by or for this item.
   */
  public String award;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public Organization brand;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public Brand brandBrand;

  /**
   * A contact point for a person or organization.
   */
  public ContactPoint contactPoint;

  /**
   * For an <a class="localLink" href="https://schema.org/Organization">Organization</a> (e.g. <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a statement describing (in news media, the newsroom’s) disclosure and correction policy for errors.
   */
  public CreativeWork correctionsPolicy;

  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  public Organization department;

  /**
   * Statement on diversity policy by an <a class="localLink" href="https://schema.org/Organization">Organization</a> e.g. a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>. For a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>, a statement describing the newsroom’s diversity policy on both staffing and sources, typically providing staffing data.
   */
  public CreativeWork diversityPolicy;

  /**
   * For an <a class="localLink" href="https://schema.org/Organization">Organization</a> (often but not necessarily a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
   */
  public Article diversityStaffingReport;

  /**
   * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
   */
  public String duns;

  /**
   * Email address.
   */
  public String email;

  /**
   * Someone working for this organization.
   */
  public Person employee;

  /**
   * Statement about ethics policy, e.g. of a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> regarding journalistic and publishing practices, or of a <a class="localLink" href="https://schema.org/Restaurant">Restaurant</a>, a page describing food source policies. In the case of a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>, an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
   */
  public CreativeWork ethicsPolicy;

  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  public Event event;

  /**
   * The fax number.
   */
  public String faxNumber;

  /**
   * A person who founded this organization.
   */
  public Person founder;

  /**
   * The place where the Organization was founded.
   */
  public Place foundingLocation;

  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  public Person funder;

  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  public Organization funderOrganization;

  /**
   * A <a class="localLink" href="https://schema.org/Grant">Grant</a> that directly or indirectly provide funding or sponsorship for this item. See also <a class="localLink" href="https://schema.org/ownershipFundingInfo">ownershipFundingInfo</a>.
   */
  public Grant funding;

  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  public String globalLocationNumber;

  /**
   * A credential awarded to the Person or Organization.
   */
  public EducationalOccupationalCredential hasCredential;

  /**
   * Specifies a MerchantReturnPolicy that may be applicable.
   */
  public MerchantReturnPolicy hasMerchantReturnPolicy;

  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service.
   */
  public OfferCatalog hasOfferCatalog;

  /**
   * Points-of-Sales operated by the organization or person.
   */
  public Place hasPOS;

  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  public InteractionCounter interactionStatistic;

  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String isicV4;

  /**
   * An organization identifier as defined in ISO 6523(-1). Note that many existing organization identifiers such as <a href="https://schema.org/leiCode">leiCode</a>, <a href="https://schema.org/duns">duns</a> and <a href="https://schema.org/vatID">vatID</a> can be expressed as an ISO 6523 identifier by setting the ICD part of the ISO 6523 identifier accordingly.
   */
  public String iso6523Code;

  /**
   * Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property.
   */
  public DefinedTerm keywords;

  /**
   * Of a <a class="localLink" href="https://schema.org/Person">Person</a>, and less typically of an <a class="localLink" href="https://schema.org/Organization">Organization</a>, to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or <a class="localLink" href="https://schema.org/JobPosting">JobPosting</a> descriptions.
   */
  public Thing knowsAbout;

  /**
   * Of a <a class="localLink" href="https://schema.org/Person">Person</a>, and less typically of an <a class="localLink" href="https://schema.org/Organization">Organization</a>, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>.
   */
  public Language knowsLanguage;

  /**
   * The official name of the organization, e.g. the registered company name.
   */
  public String legalName;

  /**
   * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
   */
  public String leiCode;

  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   */
  public PostalAddress location;

  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   */
  public Place locationPlace;

  /**
   * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
   */
  public VirtualLocation locationVirtualLocation;

  /**
   * An associated logo.
   */
  public ImageObject logo;

  /**
   * A pointer to products or services offered by the organization or person.
   */
  public Offer makesOffer;

  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  public Person member;

  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  public Organization memberOrganization;

  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  public ProgramMembership memberOf;

  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  public Organization memberOfOrganization;

  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  public String naics;

  /**
   * nonprofit Status indicates the legal status of a non-profit organization in its primary place of business.
   */
  public NonprofitType nonprofitStatus;

  /**
   * The number of employees in an organization e.g. business.
   */
  public QuantitativeValue numberOfEmployees;

  /**
   * For an <a class="localLink" href="https://schema.org/Organization">Organization</a> (often but not necessarily a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the <a class="localLink" href="https://schema.org/funder">funder</a> is also available and can be used to make basic funder information machine-readable.
   */
  public AboutPage ownershipFundingInfo;

  /**
   * For an <a class="localLink" href="https://schema.org/Organization">Organization</a> (often but not necessarily a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the <a class="localLink" href="https://schema.org/funder">funder</a> is also available and can be used to make basic funder information machine-readable.
   */
  public CreativeWork ownershipFundingInfoCreativeWork;

  /**
   * Products owned by the organization or person.
   */
  public Product owns;

  /**
   * Products owned by the organization or person.
   */
  public OwnershipInfo ownsOwnershipInfo;

  /**
   * The larger organization that this organization is a <a class="localLink" href="https://schema.org/subOrganization">subOrganization</a> of, if any.
   */
  public Organization parentOrganization;

  /**
   * The publishingPrinciples property indicates (typically via <a class="localLink" href="https://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="https://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="https://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="https://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="https://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="https://schema.org/CreativeWork">CreativeWork</a>.<br/><br/>
   *
   * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="https://schema.org/funder">funder</a>) can be expressed using schema.org terminology.
   */
  public CreativeWork publishingPrinciples;

  /**
   * A review of the item.
   */
  public Review review;

  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  public Demand seeks;

  /**
   * A slogan or motto associated with the item.
   */
  public String slogan;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  public Person sponsor;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  public Organization sponsorOrganization;

  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  public Organization subOrganization;

  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  public String taxID;

  /**
   * The telephone number.
   */
  public String telephone;

  /**
   * For an <a class="localLink" href="https://schema.org/Organization">Organization</a> (typically a <a class="localLink" href="https://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a statement about policy on use of unnamed sources and the decision process required.
   */
  public CreativeWork unnamedSourcesPolicy;

  /**
   * The Value-added Tax ID of the organization or person.
   */
  public String vatID;

  /**
   * The date that this organization was dissolved.
   */
  public ZonedDateTime dissolutionDate;

  /**
   * The date that this organization was founded.
   */
  public ZonedDateTime foundingDate;
}
