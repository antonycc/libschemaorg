package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;
import java.math.BigDecimal;

/**
 * FinancialProduct
 *
 * A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class FinancialProduct extends Service {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/FinancialProduct";

  /**
   * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
   */
  public BigDecimal annualPercentageRate;

  /**
   * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
   */
  public QuantitativeValue annualPercentageRateQuantitativeValue;

  /**
   * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
   */
  public String feesAndCommissionsSpecification;

  /**
   * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
   */
  public BigDecimal interestRate;

  /**
   * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
   */
  public QuantitativeValue interestRateQuantitativeValue;
}
