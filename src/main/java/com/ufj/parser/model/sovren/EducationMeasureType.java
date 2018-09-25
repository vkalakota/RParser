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
 * <p>Java class for EducationMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationMeasureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasureSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasureValue" type="{http://ns.hr-xml.org/2006-02-28}MeasureValueType" minOccurs="0"/&gt;
 *         &lt;element name="LowestPossibleValue" type="{http://ns.hr-xml.org/2006-02-28}MeasureValueType" minOccurs="0"/&gt;
 *         &lt;element name="HighestPossibleValue" type="{http://ns.hr-xml.org/2006-02-28}MeasureValueType" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveValueIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GoodStudentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationMeasureType", propOrder = {
    "measureSystem",
    "measureValue",
    "lowestPossibleValue",
    "highestPossibleValue",
    "excessiveValueIndicator",
    "goodStudentIndicator"
})
public class EducationMeasureType {

    @XmlElement(name = "MeasureSystem")
    protected String measureSystem;
    @XmlElement(name = "MeasureValue")
    protected MeasureValueType measureValue;
    @XmlElement(name = "LowestPossibleValue")
    protected MeasureValueType lowestPossibleValue;
    @XmlElement(name = "HighestPossibleValue")
    protected MeasureValueType highestPossibleValue;
    @XmlElement(name = "ExcessiveValueIndicator")
    protected Boolean excessiveValueIndicator;
    @XmlElement(name = "GoodStudentIndicator")
    protected Boolean goodStudentIndicator;

    /**
     * Gets the value of the measureSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureSystem() {
        return measureSystem;
    }

    /**
     * Sets the value of the measureSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureSystem(String value) {
        this.measureSystem = value;
    }

    /**
     * Gets the value of the measureValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureValueType }
     *     
     */
    public MeasureValueType getMeasureValue() {
        return measureValue;
    }

    /**
     * Sets the value of the measureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureValueType }
     *     
     */
    public void setMeasureValue(MeasureValueType value) {
        this.measureValue = value;
    }

    /**
     * Gets the value of the lowestPossibleValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureValueType }
     *     
     */
    public MeasureValueType getLowestPossibleValue() {
        return lowestPossibleValue;
    }

    /**
     * Sets the value of the lowestPossibleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureValueType }
     *     
     */
    public void setLowestPossibleValue(MeasureValueType value) {
        this.lowestPossibleValue = value;
    }

    /**
     * Gets the value of the highestPossibleValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureValueType }
     *     
     */
    public MeasureValueType getHighestPossibleValue() {
        return highestPossibleValue;
    }

    /**
     * Sets the value of the highestPossibleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureValueType }
     *     
     */
    public void setHighestPossibleValue(MeasureValueType value) {
        this.highestPossibleValue = value;
    }

    /**
     * Gets the value of the excessiveValueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessiveValueIndicator() {
        return excessiveValueIndicator;
    }

    /**
     * Sets the value of the excessiveValueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessiveValueIndicator(Boolean value) {
        this.excessiveValueIndicator = value;
    }

    /**
     * Gets the value of the goodStudentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodStudentIndicator() {
        return goodStudentIndicator;
    }

    /**
     * Sets the value of the goodStudentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodStudentIndicator(Boolean value) {
        this.goodStudentIndicator = value;
    }

}