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
 * <p>Java class for JobLevelInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobLevelInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobLevelInfoType", propOrder = {
    "jobPlan",
    "jobGrade",
    "jobStep",
    "comments"
})
public class JobLevelInfoType {

    @XmlElement(name = "JobPlan")
    protected String jobPlan;
    @XmlElement(name = "JobGrade")
    protected String jobGrade;
    @XmlElement(name = "JobStep")
    protected String jobStep;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the jobPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPlan() {
        return jobPlan;
    }

    /**
     * Sets the value of the jobPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPlan(String value) {
        this.jobPlan = value;
    }

    /**
     * Gets the value of the jobGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobGrade() {
        return jobGrade;
    }

    /**
     * Sets the value of the jobGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobGrade(String value) {
        this.jobGrade = value;
    }

    /**
     * Gets the value of the jobStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStep() {
        return jobStep;
    }

    /**
     * Sets the value of the jobStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStep(String value) {
        this.jobStep = value;
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

}
