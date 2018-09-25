//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PositionCompensationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionCompensationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartingCompensation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" /&gt;
 *                 &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" /&gt;
 *                 &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
 *                 &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EndingCompensation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" /&gt;
 *                 &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" /&gt;
 *                 &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
 *                 &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherCompensation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
 *                 &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionCompensationType", propOrder = {
    "startingCompensation",
    "endingCompensation",
    "comments",
    "otherCompensation"
})
public class PositionCompensationType {

    @XmlElement(name = "StartingCompensation")
    protected PositionCompensationType.StartingCompensation startingCompensation;
    @XmlElement(name = "EndingCompensation")
    protected PositionCompensationType.EndingCompensation endingCompensation;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "OtherCompensation")
    protected List<OtherCompensation> otherCompensation;

    /**
     * Gets the value of the startingCompensation property.
     *
     * @return
     *     possible object is
     *     {@link PositionCompensationType.StartingCompensation }
     *
     */
    public PositionCompensationType.StartingCompensation getStartingCompensation() {
        return startingCompensation;
    }

    /**
     * Sets the value of the startingCompensation property.
     *
     * @param value
     *     allowed object is
     *     {@link PositionCompensationType.StartingCompensation }
     *
     */
    public void setStartingCompensation(PositionCompensationType.StartingCompensation value) {
        this.startingCompensation = value;
    }

    /**
     * Gets the value of the endingCompensation property.
     *
     * @return
     *     possible object is
     *     {@link PositionCompensationType.EndingCompensation }
     *
     */
    public PositionCompensationType.EndingCompensation getEndingCompensation() {
        return endingCompensation;
    }

    /**
     * Sets the value of the endingCompensation property.
     *
     * @param value
     *     allowed object is
     *     {@link PositionCompensationType.EndingCompensation }
     *
     */
    public void setEndingCompensation(PositionCompensationType.EndingCompensation value) {
        this.endingCompensation = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the otherCompensation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCompensation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCompensation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionCompensationType.OtherCompensation }
     *
     *
     */
    public List<OtherCompensation> getOtherCompensation() {
        if (otherCompensation == null) {
            otherCompensation = new ArrayList<OtherCompensation>();
        }
        return this.otherCompensation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" /&gt;
     *       &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" /&gt;
     *       &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
     *       &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
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
    public static class EndingCompensation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "currency", required = true)
        protected String currency;
        @XmlAttribute(name = "intervalType")
        protected String intervalType;
        @XmlAttribute(name = "validFrom")
        protected String validFrom;
        @XmlAttribute(name = "validTo")
        protected String validTo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the intervalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntervalType() {
            return intervalType;
        }

        /**
         * Sets the value of the intervalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntervalType(String value) {
            this.intervalType = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidFrom(String value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidTo(String value) {
            this.validTo = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
     *       &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
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
    public static class OtherCompensation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "validFrom")
        protected String validFrom;
        @XmlAttribute(name = "validTo")
        protected String validTo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidFrom(String value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidTo(String value) {
            this.validTo = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="currency" use="required" type="{http://ns.hr-xml.org/2006-02-28}CurrencyCodeType" /&gt;
     *       &lt;attribute name="intervalType" type="{http://ns.hr-xml.org/2006-02-28}IntervalTypeStringExtensionType" /&gt;
     *       &lt;attribute name="validFrom" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
     *       &lt;attribute name="validTo" type="{http://ns.hr-xml.org/2006-02-28}AnyDateTimeNaType" /&gt;
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
    public static class StartingCompensation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "currency", required = true)
        protected String currency;
        @XmlAttribute(name = "intervalType")
        protected String intervalType;
        @XmlAttribute(name = "validFrom")
        protected String validFrom;
        @XmlAttribute(name = "validTo")
        protected String validTo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the intervalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntervalType() {
            return intervalType;
        }

        /**
         * Sets the value of the intervalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntervalType(String value) {
            this.intervalType = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidFrom(String value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidTo(String value) {
            this.validTo = value;
        }

    }

}
