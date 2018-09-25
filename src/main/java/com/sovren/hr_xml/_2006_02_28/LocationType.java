//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.sovren.hr_xml._2006_02_28;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Latitude" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://sovren.com/hr-xml/2006-02-28&gt;LatitudeType"&gt;
 *                 &lt;attGroup ref="{http://sovren.com/hr-xml/2006-02-28}Inferred"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Longitude" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://sovren.com/hr-xml/2006-02-28&gt;LongitudeType"&gt;
 *                 &lt;attGroup ref="{http://sovren.com/hr-xml/2006-02-28}Inferred"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RawGeoCodeResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NormalizedCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {

})
public class LocationType {

    @XmlElement(name = "Latitude")
    protected LocationType.Latitude latitude;
    @XmlElement(name = "Longitude")
    protected LocationType.Longitude longitude;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "RawGeoCodeResponse")
    protected String rawGeoCodeResponse;
    @XmlElement(name = "NormalizedStreetAddress")
    protected String normalizedStreetAddress;
    @XmlElement(name = "NormalizedMunicipality")
    protected String normalizedMunicipality;
    @XmlElement(name = "NormalizedRegion")
    protected String normalizedRegion;
    @XmlElement(name = "NormalizedPostalCode")
    protected String normalizedPostalCode;
    @XmlElement(name = "NormalizedCountryCode")
    protected String normalizedCountryCode;

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link LocationType.Latitude }
     *
     */
    public LocationType.Latitude getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link LocationType.Latitude }
     *
     */
    public void setLatitude(LocationType.Latitude value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link LocationType.Longitude }
     *
     */
    public LocationType.Longitude getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link LocationType.Longitude }
     *
     */
    public void setLongitude(LocationType.Longitude value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the rawGeoCodeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawGeoCodeResponse() {
        return rawGeoCodeResponse;
    }

    /**
     * Sets the value of the rawGeoCodeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawGeoCodeResponse(String value) {
        this.rawGeoCodeResponse = value;
    }

    /**
     * Gets the value of the normalizedStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedStreetAddress() {
        return normalizedStreetAddress;
    }

    /**
     * Sets the value of the normalizedStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedStreetAddress(String value) {
        this.normalizedStreetAddress = value;
    }

    /**
     * Gets the value of the normalizedMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedMunicipality() {
        return normalizedMunicipality;
    }

    /**
     * Sets the value of the normalizedMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedMunicipality(String value) {
        this.normalizedMunicipality = value;
    }

    /**
     * Gets the value of the normalizedRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedRegion() {
        return normalizedRegion;
    }

    /**
     * Sets the value of the normalizedRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedRegion(String value) {
        this.normalizedRegion = value;
    }

    /**
     * Gets the value of the normalizedPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedPostalCode() {
        return normalizedPostalCode;
    }

    /**
     * Sets the value of the normalizedPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedPostalCode(String value) {
        this.normalizedPostalCode = value;
    }

    /**
     * Gets the value of the normalizedCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedCountryCode() {
        return normalizedCountryCode;
    }

    /**
     * Sets the value of the normalizedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedCountryCode(String value) {
        this.normalizedCountryCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://sovren.com/hr-xml/2006-02-28&gt;LatitudeType"&gt;
     *       &lt;attGroup ref="{http://sovren.com/hr-xml/2006-02-28}Inferred"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Latitude {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "inferred")
        protected Boolean inferred;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://sovren.com/hr-xml/2006-02-28&gt;LongitudeType"&gt;
     *       &lt;attGroup ref="{http://sovren.com/hr-xml/2006-02-28}Inferred"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Longitude {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "inferred")
        protected Boolean inferred;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
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

}
