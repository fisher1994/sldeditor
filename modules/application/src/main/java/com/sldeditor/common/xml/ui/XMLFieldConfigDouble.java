//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package com.sldeditor.common.xml.ui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Configuration for a double/float field
 *             
 * 
 * <p>Java class for XMLFieldConfigDouble complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLFieldConfigDouble">
 *   &lt;complexContent>
 *     &lt;extension base="{}XMLFieldConfigData">
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" />
 *       &lt;attribute name="minValue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="stepSize" type="{http://www.w3.org/2001/XMLSchema}double" default="1.0" />
 *       &lt;attribute name="noOfDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" default="3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLFieldConfigDouble")
public class XMLFieldConfigDouble
    extends XMLFieldConfigData
{

    @XmlAttribute
    protected Double defaultValue;
    @XmlAttribute
    protected Double minValue;
    @XmlAttribute
    protected Double maxValue;
    @XmlAttribute
    protected Double stepSize;
    @XmlAttribute
    protected Integer noOfDecimalPlaces;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDefaultValue() {
        if (defaultValue == null) {
            return  0.0D;
        } else {
            return defaultValue;
        }
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultValue(Double value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the stepSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getStepSize() {
        if (stepSize == null) {
            return  1.0D;
        } else {
            return stepSize;
        }
    }

    /**
     * Sets the value of the stepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStepSize(Double value) {
        this.stepSize = value;
    }

    /**
     * Gets the value of the noOfDecimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNoOfDecimalPlaces() {
        if (noOfDecimalPlaces == null) {
            return  3;
        } else {
            return noOfDecimalPlaces;
        }
    }

    /**
     * Sets the value of the noOfDecimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfDecimalPlaces(Integer value) {
        this.noOfDecimalPlaces = value;
    }

}
