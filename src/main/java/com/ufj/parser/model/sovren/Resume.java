//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import com.sovren.hr_xml._2006_02_28.ResumeUserArea;

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
 *       &lt;sequence&gt;
 *         &lt;element name="ResumeId" type="{http://ns.hr-xml.org/2006-02-28}EntityIdType" minOccurs="0"/&gt;
 *         &lt;element name="DistributionGuidelines" type="{http://ns.hr-xml.org/2006-02-28}DistributionGuidelinesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}StructuredXMLResume" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}NonXMLResume" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{http://sovren.com/hr-xml/2006-02-28}ResumeUserArea" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
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
@XmlType(name = "", propOrder = {
    "resumeId",
    "distributionGuidelines",
    "structuredXMLResume",
    "nonXMLResume",
    "userArea"
})
@XmlRootElement(name = "Resume")
public class Resume {

    @XmlElement(name = "ResumeId")
    protected EntityIdType resumeId;
    @XmlElement(name = "DistributionGuidelines")
    protected DistributionGuidelinesType distributionGuidelines;
    @XmlElement(name = "StructuredXMLResume")
    protected StructuredXMLResumeType structuredXMLResume;
    @XmlElement(name = "NonXMLResume")
    protected NonXMLResumeType nonXMLResume;
    @XmlElement(name = "UserArea")
    protected Resume.UserArea userArea;

    /**
     * Gets the value of the resumeId property.
     *
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *
     */
    public EntityIdType getResumeId() {
        return resumeId;
    }

    /**
     * Sets the value of the resumeId property.
     *
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *
     */
    public void setResumeId(EntityIdType value) {
        this.resumeId = value;
    }

    /**
     * Gets the value of the distributionGuidelines property.
     *
     * @return
     *     possible object is
     *     {@link DistributionGuidelinesType }
     *
     */
    public DistributionGuidelinesType getDistributionGuidelines() {
        return distributionGuidelines;
    }

    /**
     * Sets the value of the distributionGuidelines property.
     *
     * @param value
     *     allowed object is
     *     {@link DistributionGuidelinesType }
     *
     */
    public void setDistributionGuidelines(DistributionGuidelinesType value) {
        this.distributionGuidelines = value;
    }

    /**
     * Gets the value of the structuredXMLResume property.
     *
     * @return
     *     possible object is
     *     {@link StructuredXMLResumeType }
     *
     */
    public StructuredXMLResumeType getStructuredXMLResume() {
        return structuredXMLResume;
    }

    /**
     * Sets the value of the structuredXMLResume property.
     *
     * @param value
     *     allowed object is
     *     {@link StructuredXMLResumeType }
     *
     */
    public void setStructuredXMLResume(StructuredXMLResumeType value) {
        this.structuredXMLResume = value;
    }

    /**
     * Gets the value of the nonXMLResume property.
     *
     * @return
     *     possible object is
     *     {@link NonXMLResumeType }
     *
     */
    public NonXMLResumeType getNonXMLResume() {
        return nonXMLResume;
    }

    /**
     * Sets the value of the nonXMLResume property.
     *
     * @param value
     *     allowed object is
     *     {@link NonXMLResumeType }
     *
     */
    public void setNonXMLResume(NonXMLResumeType value) {
        this.nonXMLResume = value;
    }

    /**
     * Gets the value of the userArea property.
     *
     * @return
     *     possible object is
     *     {@link Resume.UserArea }
     *
     */
    public Resume.UserArea getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     *
     * @param value
     *     allowed object is
     *     {@link Resume.UserArea }
     *
     */
    public void setUserArea(Resume.UserArea value) {
        this.userArea = value;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resumeId=" + resumeId +
                ", distributionGuidelines=" + distributionGuidelines +
                ", structuredXMLResume=" + structuredXMLResume +
                ", nonXMLResume=" + nonXMLResume +
                ", userArea=" + userArea +
                '}';
    }


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
     *         &lt;element ref="{http://sovren.com/hr-xml/2006-02-28}ResumeUserArea" minOccurs="0"/&gt;
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
    public static class UserArea {

        @XmlElement(name = "ResumeUserArea", namespace = "http://sovren.com/hr-xml/2006-02-28")
        protected ResumeUserArea resumeUserArea;

        /**
         * Gets the value of the resumeUserArea property.
         * 
         * @return
         *     possible object is
         *     {@link ResumeUserArea }
         *     
         */
        public ResumeUserArea getResumeUserArea() {
            return resumeUserArea;
        }

        /**
         * Sets the value of the resumeUserArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResumeUserArea }
         *     
         */
        public void setResumeUserArea(ResumeUserArea value) {
            this.resumeUserArea = value;
        }

    }

}
