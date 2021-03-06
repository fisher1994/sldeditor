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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Configuration for a single enumeration used in XMLFieldConfigEnum field
 *             
 * 
 * <p>Java class for XMLFieldConfigEnumValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLFieldConfigEnumValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{}XMLFieldConfigEnumValueItem" maxOccurs="unbounded"/>
 *         &lt;element name="FieldList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Field" type="{}XMLFieldConfigEnumValueField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Group" type="{}XMLFieldConfigEnumValueGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="separateGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLFieldConfigEnumValue", propOrder = {
    "item",
    "fieldList"
})
public class XMLFieldConfigEnumValue {

    @XmlElement(name = "Item", required = true)
    protected List<XMLFieldConfigEnumValueItem> item;
    @XmlElement(name = "FieldList")
    protected XMLFieldConfigEnumValue.FieldList fieldList;
    @XmlAttribute
    protected String groupName;
    @XmlAttribute
    protected Boolean separateGroup;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLFieldConfigEnumValueItem }
     * 
     * 
     */
    public List<XMLFieldConfigEnumValueItem> getItem() {
        if (item == null) {
            item = new ArrayList<XMLFieldConfigEnumValueItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the fieldList property.
     * 
     * @return
     *     possible object is
     *     {@link XMLFieldConfigEnumValue.FieldList }
     *     
     */
    public XMLFieldConfigEnumValue.FieldList getFieldList() {
        return fieldList;
    }

    /**
     * Sets the value of the fieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLFieldConfigEnumValue.FieldList }
     *     
     */
    public void setFieldList(XMLFieldConfigEnumValue.FieldList value) {
        this.fieldList = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the separateGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getSeparateGroup() {
        if (separateGroup == null) {
            return false;
        } else {
            return separateGroup;
        }
    }

    /**
     * Sets the value of the separateGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeparateGroup(Boolean value) {
        this.separateGroup = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Field" type="{}XMLFieldConfigEnumValueField" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Group" type="{}XMLFieldConfigEnumValueGroup" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "field",
        "group"
    })
    public static class FieldList {

        @XmlElement(name = "Field")
        protected List<XMLFieldConfigEnumValueField> field;
        @XmlElement(name = "Group")
        protected List<XMLFieldConfigEnumValueGroup> group;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLFieldConfigEnumValueField }
         * 
         * 
         */
        public List<XMLFieldConfigEnumValueField> getField() {
            if (field == null) {
                field = new ArrayList<XMLFieldConfigEnumValueField>();
            }
            return this.field;
        }

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLFieldConfigEnumValueGroup }
         * 
         * 
         */
        public List<XMLFieldConfigEnumValueGroup> getGroup() {
            if (group == null) {
                group = new ArrayList<XMLFieldConfigEnumValueGroup>();
            }
            return this.group;
        }

    }

}
