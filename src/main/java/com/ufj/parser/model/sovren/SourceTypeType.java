//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SourceTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="StandardValue" type="{http://ns.hr-xml.org/2006-02-28}SourceEnumType"/&gt;
 *         &lt;element name="NonStandardValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceTypeType", propOrder = {
    "standardValue",
    "nonStandardValue"
})
public class SourceTypeType {

    @XmlElement(name = "StandardValue")
    @XmlSchemaType(name = "string")
    protected SourceEnumType standardValue;
    @XmlElement(name = "NonStandardValue")
    protected String nonStandardValue;

    /**
     * Gets the value of the standardValue property.
     * 
     * @return
     *     possible object is
     *     {@link SourceEnumType }
     *     
     */
    public SourceEnumType getStandardValue() {
        return standardValue;
    }

    /**
     * Sets the value of the standardValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEnumType }
     *     
     */
    public void setStandardValue(SourceEnumType value) {
        this.standardValue = value;
    }

    /**
     * Gets the value of the nonStandardValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStandardValue() {
        return nonStandardValue;
    }

    /**
     * Sets the value of the nonStandardValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStandardValue(String value) {
        this.nonStandardValue = value;
    }

}
