//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.sovren.hr_xml._2006_02_28;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenderType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sovren.com/hr-xml/2006-02-28&gt;GenderEnum"&gt;
 *       &lt;attGroup ref="{http://sovren.com/hr-xml/2006-02-28}Inferred"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenderType", propOrder = {
    "value"
})
public class GenderType {

    @XmlValue
    protected GenderEnum value;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link GenderEnum }
     *     
     */
    public GenderEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderEnum }
     *     
     */
    public void setValue(GenderEnum value) {
        this.value = value;
    }

    /**
     * Gets the value of the inferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInferred() {
        return inferred;
    }

    /**
     * Sets the value of the inferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInferred(Boolean value) {
        this.inferred = value;
    }

}