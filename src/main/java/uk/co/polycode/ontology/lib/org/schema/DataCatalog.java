package uk.co.polycode.ontology.lib.org.schema;

import java.lang.String;

/**
 * DataCatalog
 *
 * A collection of datasets.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class DataCatalog extends CreativeWork {
  /**
   * A dataset contained in this catalog.
   */
  public Dataset dataset;

  /**
   * A technique or technology used in a <a class="localLink" href="https://schema.org/Dataset">Dataset</a> (or <a class="localLink" href="https://schema.org/DataDownload">DataDownload</a>, <a class="localLink" href="https://schema.org/DataCatalog">DataCatalog</a>),
   * corresponding to the method used for measuring the corresponding variable(s) (described using <a class="localLink" href="https://schema.org/variableMeasured">variableMeasured</a>). This is oriented towards scientific and scholarly dataset publication but may have broader applicability; it is not intended as a full representation of measurement, but rather as a high level summary for dataset discovery.<br/><br/>
   *
   * For example, if <a class="localLink" href="https://schema.org/variableMeasured">variableMeasured</a> is: molecule concentration, <a class="localLink" href="https://schema.org/measurementTechnique">measurementTechnique</a> could be: "mass spectrometry" or "nmr spectroscopy" or "colorimetry" or "immunofluorescence".<br/><br/>
   *
   * If the <a class="localLink" href="https://schema.org/variableMeasured">variableMeasured</a> is "depression rating", the <a class="localLink" href="https://schema.org/measurementTechnique">measurementTechnique</a> could be "Zung Scale" or "HAM-D" or "Beck Depression Inventory".<br/><br/>
   *
   * If there are several <a class="localLink" href="https://schema.org/variableMeasured">variableMeasured</a> properties recorded for some given data object, use a <a class="localLink" href="https://schema.org/PropertyValue">PropertyValue</a> for each <a class="localLink" href="https://schema.org/variableMeasured">variableMeasured</a> and attach the corresponding <a class="localLink" href="https://schema.org/measurementTechnique">measurementTechnique</a>.
   */
  public String measurementTechnique;

  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/DataCatalog";
}

