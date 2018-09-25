//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionOrgInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionOrgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PositionLocation" type="{http://ns.hr-xml.org/2006-02-28}PostalAddressType" minOccurs="0"/&gt;
 *         &lt;element name="WebSite" type="{http://ns.hr-xml.org/2006-02-28}InternetWebAddressType" minOccurs="0"/&gt;
 *         &lt;element name="LocationSummary" type="{http://ns.hr-xml.org/2006-02-28}EmploymentLocationSummaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionOrgInfoType", propOrder = {
    "positionLocation",
    "webSite",
    "locationSummary"
})
public class PositionOrgInfoType {

    @XmlElement(name = "PositionLocation")
    protected PostalAddressType positionLocation;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "LocationSummary")
    protected EmploymentLocationSummaryType locationSummary;

    /**
     * Gets the value of the positionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getPositionLocation() {
        return positionLocation;
    }

    /**
     * Sets the value of the positionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setPositionLocation(PostalAddressType value) {
        this.positionLocation = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the locationSummary property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentLocationSummaryType }
     *     
     */
    public EmploymentLocationSummaryType getLocationSummary() {
        return locationSummary;
    }

    /**
     * Sets the value of the locationSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentLocationSummaryType }
     *     
     */
    public void setLocationSummary(EmploymentLocationSummaryType value) {
        this.locationSummary = value;
    }

}
