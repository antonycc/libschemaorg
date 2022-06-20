package uk.co.polycode.ontology.lib.org.schema;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * MonetaryAmount
 *
 * A monetary value or range. This type can be used to describe an amount of money such as USD50 USD, or a range as in describing a bank account being suitable for a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It is recommended to use <a class="localLink" href="https://schema.org/PriceSpecification">PriceSpecification</a> Types to describe the price of an Offer, Invoice, etc.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MonetaryAmount extends StructuredValue {
  /**
   * The currency in which the monetary amount is expressed.<br/><br/>
   *
   * Use standard formats: <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency format</a> e.g. "USD"; <a href="https://en.wikipedia.org/wiki/List_of_cryptocurrencies">Ticker symbol</a> for cryptocurrencies e.g. "BTC"; well known names for <a href="https://en.wikipedia.org/wiki/Local_exchange_trading_system">Local Exchange Tradings Systems</a> (LETS) and other currency types e.g. "Ithaca HOUR".
   */
  public String currency;

  /**
   * The value of the quantitative value or property value node.<br/><br/>
   *
   * <ul>
   * <li>For <a class="localLink" href="https://schema.org/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="https://schema.org/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
   * <li>For <a class="localLink" href="https://schema.org/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * </ul>
   */
  public StructuredValue valueStructuredValue;

  /**
   * The value of the quantitative value or property value node.<br/><br/>
   *
   * <ul>
   * <li>For <a class="localLink" href="https://schema.org/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="https://schema.org/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
   * <li>For <a class="localLink" href="https://schema.org/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * </ul>
   */
  public Boolean valueBoolean;

  /**
   * The value of the quantitative value or property value node.<br/><br/>
   *
   * <ul>
   * <li>For <a class="localLink" href="https://schema.org/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="https://schema.org/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
   * <li>For <a class="localLink" href="https://schema.org/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * </ul>
   */
  public BigDecimal value;

  /**
   * The upper value of some characteristic or property.
   */
  public BigDecimal maxValue;

  /**
   * The lower value of some characteristic or property.
   */
  public BigDecimal minValue;

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
  public String isDefinedBy = "https://schema.org/MonetaryAmount";
}

