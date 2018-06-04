//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package com.sldeditor.common.xml.ui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines how a group is configured
 *             
 * 
 * <p>Java class for XMLGroupConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLGroupConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{}XMLGroupConfigData">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="FieldConfigSymbolType" type="{}XMLFieldConfigSymbolType"/>
 *         &lt;element name="FieldConfigDouble" type="{}XMLFieldConfigDouble"/>
 *         &lt;element name="FieldConfigEnum" type="{}XMLFieldConfigEnum"/>
 *         &lt;element name="FieldConfigString" type="{}XMLFieldConfigString"/>
 *         &lt;element name="FieldConfigSlider" type="{}XMLFieldConfigSlider"/>
 *         &lt;element name="FieldConfigColour" type="{}XMLFieldConfigColour"/>
 *         &lt;element name="FieldConfigFont" type="{}XMLFieldConfigFont"/>
 *         &lt;element name="FieldConfigFontPreview" type="{}XMLFieldConfigFontPreview"/>
 *         &lt;element name="FieldConfigBoolean" type="{}XMLFieldConfigBoolean"/>
 *         &lt;element name="FieldConfigGeometry" type="{}XMLFieldConfigGeometry"/>
 *         &lt;element name="FieldConfigGeometryField" type="{}XMLFieldConfigGeometryField"/>
 *         &lt;element name="FieldConfigColourMap" type="{}XMLFieldConfigColourMap"/>
 *         &lt;element name="FieldConfigTransformation" type="{}XMLFieldConfigTransformation"/>
 *         &lt;element name="FieldConfigInteger" type="{}XMLFieldConfigInteger"/>
 *         &lt;element name="FieldConfigInlineFeature" type="{}XMLFieldConfigInlineFeature"/>
 *         &lt;element name="FieldConfigFeatureTypeConstraint" type="{}XMLFieldConfigFeatureTypeConstraint"/>
 *         &lt;element name="FieldConfigMapUnit" type="{}XMLFieldConfigMapUnit"/>
 *         &lt;element name="FieldConfigVendorOption" type="{}XMLFieldConfigVendorOption"/>
 *         &lt;element name="FieldConfigSortBy" type="{}XMLFieldConfigSortBy"/>
 *         &lt;element name="FieldConfigDSProperties" type="{}XMLFieldConfigDSProperties"/>
 *         &lt;element name="Group" type="{}XMLGroupConfig"/>
 *         &lt;element name="MultiOptionGroup" type="{}XMLMultiOptionGroup"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLGroupConfig", propOrder = {
    "fieldList"
})
public class XMLGroupConfig
    extends XMLGroupConfigData
{

    @XmlElements({
        @XmlElement(name = "FieldConfigFontPreview", type = XMLFieldConfigFontPreview.class),
        @XmlElement(name = "FieldConfigDouble", type = XMLFieldConfigDouble.class),
        @XmlElement(name = "FieldConfigTransformation", type = XMLFieldConfigTransformation.class),
        @XmlElement(name = "FieldConfigInteger", type = XMLFieldConfigInteger.class),
        @XmlElement(name = "FieldConfigSymbolType", type = XMLFieldConfigSymbolType.class),
        @XmlElement(name = "FieldConfigVendorOption", type = XMLFieldConfigVendorOption.class),
        @XmlElement(name = "Group", type = XMLGroupConfig.class),
        @XmlElement(name = "MultiOptionGroup", type = XMLMultiOptionGroup.class),
        @XmlElement(name = "FieldConfigColourMap", type = XMLFieldConfigColourMap.class),
        @XmlElement(name = "FieldConfigSortBy", type = XMLFieldConfigSortBy.class),
        @XmlElement(name = "FieldConfigMapUnit", type = XMLFieldConfigMapUnit.class),
        @XmlElement(name = "FieldConfigFont", type = XMLFieldConfigFont.class),
        @XmlElement(name = "FieldConfigBoolean", type = XMLFieldConfigBoolean.class),
        @XmlElement(name = "FieldConfigString", type = XMLFieldConfigString.class),
        @XmlElement(name = "FieldConfigGeometry", type = XMLFieldConfigGeometry.class),
        @XmlElement(name = "FieldConfigFeatureTypeConstraint", type = XMLFieldConfigFeatureTypeConstraint.class),
        @XmlElement(name = "FieldConfigGeometryField", type = XMLFieldConfigGeometryField.class),
        @XmlElement(name = "FieldConfigInlineFeature", type = XMLFieldConfigInlineFeature.class),
        @XmlElement(name = "FieldConfigEnum", type = XMLFieldConfigEnum.class),
        @XmlElement(name = "FieldConfigSlider", type = XMLFieldConfigSlider.class),
        @XmlElement(name = "FieldConfigColour", type = XMLFieldConfigColour.class),
        @XmlElement(name = "FieldConfigDSProperties", type = XMLFieldConfigDSProperties.class)
    })
    protected List<Object> fieldList;

    /**
     * Gets the value of the fieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLFieldConfigFontPreview }
     * {@link XMLFieldConfigDouble }
     * {@link XMLFieldConfigTransformation }
     * {@link XMLFieldConfigInteger }
     * {@link XMLFieldConfigSymbolType }
     * {@link XMLFieldConfigVendorOption }
     * {@link XMLGroupConfig }
     * {@link XMLMultiOptionGroup }
     * {@link XMLFieldConfigColourMap }
     * {@link XMLFieldConfigSortBy }
     * {@link XMLFieldConfigMapUnit }
     * {@link XMLFieldConfigFont }
     * {@link XMLFieldConfigBoolean }
     * {@link XMLFieldConfigString }
     * {@link XMLFieldConfigGeometry }
     * {@link XMLFieldConfigFeatureTypeConstraint }
     * {@link XMLFieldConfigGeometryField }
     * {@link XMLFieldConfigInlineFeature }
     * {@link XMLFieldConfigEnum }
     * {@link XMLFieldConfigSlider }
     * {@link XMLFieldConfigColour }
     * {@link XMLFieldConfigDSProperties }
     * 
     * 
     */
    public List<Object> getFieldList() {
        if (fieldList == null) {
            fieldList = new ArrayList<Object>();
        }
        return this.fieldList;
    }

}
