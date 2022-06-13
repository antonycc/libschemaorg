package uk.co.polycode.ontology.lib.org.schema;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigInteger;
import java.time.ZonedDateTime;

/**
 * Event
 *
 * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class="localLink" href="https://schema.org/offers">offers</a> property. Repeated events may be structured as separate Event objects.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Event extends Thing {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Event";

  /**
   * The subject matter of the content.
   */
  public Thing about;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
   */
  public Person actor;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating aggregateRating;

  /**
   * A person or organization attending the event.
   */
  public Person attendee;

  /**
   * A person or organization attending the event.
   */
  public Organization attendeeOrganization;

  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  public Audience audience;

  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   */
  public Person composer;

  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
   */
  public Organization composerOrganization;

  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  public Person contributor;

  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  public Organization contributorOrganization;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
   */
  public Person director;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
   */
  public Duration duration;

  /**
   * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
   */
  public EventAttendanceModeEnumeration eventAttendanceMode;

  /**
   * Associates an <a class="localLink" href="https://schema.org/Event">Event</a> with a <a class="localLink" href="https://schema.org/Schedule">Schedule</a>. There are circumstances where it is preferable to share a schedule for a series of
   *       repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
   *       gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An <a class="localLink" href="https://schema.org/Event">Event</a> that
   *       is associated with a <a class="localLink" href="https://schema.org/Schedule">Schedule</a> using this property should not have <a class="localLink" href="https://schema.org/startDate">startDate</a> or <a class="localLink" href="https://schema.org/endDate">endDate</a> properties. These are instead defined within the associated
   *       <a class="localLink" href="https://schema.org/Schedule">Schedule</a>, this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
   *       or seasons.
   */
  public Schedule eventSchedule;

  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   */
  public EventStatusType eventStatus;

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
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="https://schema.org/availableLanguage">availableLanguage</a>.
   */
  public Language inLanguage;

  /**
   * Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property.
   */
  public DefinedTerm keywords;

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
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a <a class="localLink" href="https://schema.org/Demand">Demand</a>. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Offer offers;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a <a class="localLink" href="https://schema.org/Demand">Demand</a>. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Demand offersDemand;

  /**
   * An organizer of an Event.
   */
  public Person organizer;

  /**
   * An organizer of an Event.
   */
  public Organization organizerOrganization;

  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  public Person performer;

  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  public Organization performerOrganization;

  /**
   * The CreativeWork that captured all or part of this Event.
   */
  public CreativeWork recordedIn;

  /**
   * A review of the item.
   */
  public Review review;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  public Person sponsor;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
   */
  public Organization sponsorOrganization;

  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   */
  public Event subEvent;

  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   */
  public Event superEvent;

  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  public Person translator;

  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  public Organization translatorOrganization;

  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  public String typicalAgeRange;

  /**
   * A work featured in some event, e.g. exhibited in an ExhibitionEvent.
   *        Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
   */
  public CreativeWork workFeatured;

  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   */
  public CreativeWork workPerformed;

  /**
   * The time admission will commence.
   */
  public ZonedDateTime doorTime;

  /**
   * The time admission will commence.
   */
  public ZonedDateTime doorTimeZonedDateTime;

  /**
   * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime endDate;

  /**
   * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime endDateZonedDateTime;

  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  public Boolean isAccessibleForFree;

  /**
   * The total number of individuals that may attend an event or venue.
   */
  public BigInteger maximumAttendeeCapacity;

  /**
   * The maximum physical attendee capacity of an <a class="localLink" href="https://schema.org/Event">Event</a> whose <a class="localLink" href="https://schema.org/eventAttendanceMode">eventAttendanceMode</a> is <a class="localLink" href="https://schema.org/OfflineEventAttendanceMode">OfflineEventAttendanceMode</a> (or the offline aspects, in the case of a <a class="localLink" href="https://schema.org/MixedEventAttendanceMode">MixedEventAttendanceMode</a>).
   */
  public BigInteger maximumPhysicalAttendeeCapacity;

  /**
   * The maximum physical attendee capacity of an <a class="localLink" href="https://schema.org/Event">Event</a> whose <a class="localLink" href="https://schema.org/eventAttendanceMode">eventAttendanceMode</a> is <a class="localLink" href="https://schema.org/OnlineEventAttendanceMode">OnlineEventAttendanceMode</a> (or the online aspects, in the case of a <a class="localLink" href="https://schema.org/MixedEventAttendanceMode">MixedEventAttendanceMode</a>).
   */
  public BigInteger maximumVirtualAttendeeCapacity;

  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   */
  public ZonedDateTime previousStartDate;

  /**
   * The number of attendee places for an event that remain unallocated.
   */
  public BigInteger remainingAttendeeCapacity;

  /**
   * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime startDate;

  /**
   * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
   */
  public ZonedDateTime startDateZonedDateTime;
}
