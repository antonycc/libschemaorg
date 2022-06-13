package uk.co.polycode.schemaorg.org.schema;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * PriceSpecification
 *
 * A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use <a class="localLink" href="https://schema.org/MonetaryAmount">MonetaryAmount</a> to describe independent amounts of money such as a salary, credit card limits, etc.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class PriceSpecification extends StructuredValue {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/PriceSpecification";

  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  public QuantitativeValue eligibleQuantity;

  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  public PriceSpecification eligibleTransactionVolume;

  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.<br/><br/>
   *
   * Usage guidelines:<br/><br/>
   *
   * <ul>
   * <li>Use the <a class="localLink" href="https://schema.org/priceCurrency">priceCurrency</a> property (with standard formats: <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency format</a> e.g. "USD"; <a href="https://en.wikipedia.org/wiki/List_of_cryptocurrencies">Ticker symbol</a> for cryptocurrencies e.g. "BTC"; well known names for <a href="https://en.wikipedia.org/wiki/Local_exchange_trading_system">Local Exchange Tradings Systems</a> (LETS) and other currency types e.g. "Ithaca HOUR") instead of including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as 'DOLLAR' in the value.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * <li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * </ul>
   */
  public BigDecimal price;

  /**
   * The currency of the price, or a price component when attached to <a class="localLink" href="https://schema.org/PriceSpecification">PriceSpecification</a> and its subtypes.<br/><br/>
   *
   * Use standard formats: <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency format</a> e.g. "USD"; <a href="https://en.wikipedia.org/wiki/List_of_cryptocurrencies">Ticker symbol</a> for cryptocurrencies e.g. "BTC"; well known names for <a href="https://en.wikipedia.org/wiki/Local_exchange_trading_system">Local Exchange Tradings Systems</a> (LETS) and other currency types e.g. "Ithaca HOUR".
   */
  public String priceCurrency;

  /**
   * The highest price if the price is a range.
   */
  public BigDecimal maxPrice;

  /**
   * The lowest price if the price is a range.
   */
  public BigDecimal minPrice;

  /**
   * The date when the item becomes valid.
   */
  public ZonedDateTime validFrom;

  /**
   * The date when the item becomes valid.
   */
  public ZonedDateTime validFromZonedDateTime;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  public ZonedDateTime validThrough;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  public ZonedDateTime validThroughZonedDateTime;

  /**
   * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
   */
  public Boolean valueAddedTaxIncluded;
}
