//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.sovren.hr_xml._2006_02_28;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="NormalizedEmployerOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedIndustries" type="{http://sovren.com/hr-xml/2006-02-28}IndustryType" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedLocation" type="{http://sovren.com/hr-xml/2006-02-28}LocationType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "EmployerOrgUserArea")
public class EmployerOrgUserArea {

    @XmlElement(name = "NormalizedEmployerOrgName")
    protected String normalizedEmployerOrgName;
    @XmlElement(name = "NormalizedIndustries")
    protected IndustryType normalizedIndustries;
    @XmlElement(name = "NormalizedLocation")
    protected LocationType normalizedLocation;

    /**
     * Gets the value of the normalizedEmployerOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedEmployerOrgName() {
        return normalizedEmployerOrgName;
    }

    /**
     * Sets the value of the normalizedEmployerOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedEmployerOrgName(String value) {
        this.normalizedEmployerOrgName = value;
    }

    /**
     * Gets the value of the normalizedIndustries property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryType }
     *     
     */
    public IndustryType getNormalizedIndustries() {
        return normalizedIndustries;
    }

    /**
     * Sets the value of the normalizedIndustries property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryType }
     *     
     */
    public void setNormalizedIndustries(IndustryType value) {
        this.normalizedIndustries = value;
    }

    /**
     * Gets the value of the normalizedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getNormalizedLocation() {
        return normalizedLocation;
    }

    /**
     * Sets the value of the normalizedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setNormalizedLocation(LocationType value) {
        this.normalizedLocation = value;
    }

}