//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import com.sovren.hr_xml._2006_02_28.PositionHistoryUserArea;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PositionHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgName" type="{http://ns.hr-xml.org/2006-02-28}PositionOrgNameType"/&gt;
 *         &lt;element name="OrgInfo" type="{http://ns.hr-xml.org/2006-02-28}PositionOrgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrgIndustry" type="{http://ns.hr-xml.org/2006-02-28}PositionOrgIndustryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrgSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType"/&gt;
 *         &lt;element name="EndDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
 *         &lt;element name="Compensation" type="{http://ns.hr-xml.org/2006-02-28}PositionCompensationType" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Verification" type="{http://ns.hr-xml.org/2006-02-28}VerificationType" minOccurs="0"/&gt;
 *         &lt;element name="JobLevelInfo" type="{http://ns.hr-xml.org/2006-02-28}JobLevelInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JobCategory" type="{http://ns.hr-xml.org/2006-02-28}OccupationalCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}Competency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{http://sovren.com/hr-xml/2006-02-28}PositionHistoryUserArea" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="positionType" type="{http://ns.hr-xml.org/2006-02-28}PositionTypexStringPatternExtensionType" /&gt;
 *       &lt;attribute name="currentEmployer" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionHistoryType", propOrder = {
    "title",
    "orgName",
    "orgInfo",
    "orgIndustry",
    "orgSize",
    "description",
    "startDate",
    "endDate",
    "compensation",
    "comments",
    "verification",
    "jobLevelInfo",
    "jobCategory",
    "competency",
    "userArea"
})
@XmlSeeAlso({
    com.ufj.parser.model.sovren.EmployerOrgDataType.PositionHistory.class
})
public class PositionHistoryType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "OrgName", required = true)
    protected PositionOrgNameType orgName;
    @XmlElement(name = "OrgInfo")
    protected List<PositionOrgInfoType> orgInfo;
    @XmlElement(name = "OrgIndustry")
    protected List<PositionOrgIndustryType> orgIndustry;
    @XmlElement(name = "OrgSize")
    protected String orgSize;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "StartDate", required = true)
    protected FlexibleDatesType startDate;
    @XmlElement(name = "EndDate")
    protected FlexibleDatesType endDate;
    @XmlElement(name = "Compensation")
    protected PositionCompensationType compensation;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "Verification")
    protected VerificationType verification;
    @XmlElement(name = "JobLevelInfo")
    protected List<JobLevelInfoType> jobLevelInfo;
    @XmlElement(name = "JobCategory")
    protected List<OccupationalCategoryType> jobCategory;
    @XmlElement(name = "Competency")
    protected List<CompetencyType> competency;
    @XmlElement(name = "UserArea")
    protected PositionHistoryType.UserArea userArea;
    @XmlAttribute(name = "positionType")
    protected String positionType;
    @XmlAttribute(name = "currentEmployer")
    protected Boolean currentEmployer;

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the orgName property.
     *
     * @return
     *     possible object is
     *     {@link PositionOrgNameType }
     *
     */
    public PositionOrgNameType getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     *
     * @param value
     *     allowed object is
     *     {@link PositionOrgNameType }
     *
     */
    public void setOrgName(PositionOrgNameType value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionOrgInfoType }
     *
     *
     */
    public List<PositionOrgInfoType> getOrgInfo() {
        if (orgInfo == null) {
            orgInfo = new ArrayList<PositionOrgInfoType>();
        }
        return this.orgInfo;
    }

    /**
     * Gets the value of the orgIndustry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgIndustry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgIndustry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionOrgIndustryType }
     *
     *
     */
    public List<PositionOrgIndustryType> getOrgIndustry() {
        if (orgIndustry == null) {
            orgIndustry = new ArrayList<PositionOrgIndustryType>();
        }
        return this.orgIndustry;
    }

    /**
     * Gets the value of the orgSize property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgSize() {
        return orgSize;
    }

    /**
     * Sets the value of the orgSize property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgSize(String value) {
        this.orgSize = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return
     *     possible object is
     *     {@link FlexibleDatesType }
     *
     */
    public FlexibleDatesType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link FlexibleDatesType }
     *
     */
    public void setStartDate(FlexibleDatesType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     *
     * @return
     *     possible object is
     *     {@link FlexibleDatesType }
     *
     */
    public FlexibleDatesType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     *
     * @param value
     *     allowed object is
     *     {@link FlexibleDatesType }
     *
     */
    public void setEndDate(FlexibleDatesType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the compensation property.
     *
     * @return
     *     possible object is
     *     {@link PositionCompensationType }
     *
     */
    public PositionCompensationType getCompensation() {
        return compensation;
    }

    /**
     * Sets the value of the compensation property.
     *
     * @param value
     *     allowed object is
     *     {@link PositionCompensationType }
     *
     */
    public void setCompensation(PositionCompensationType value) {
        this.compensation = value;
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
     * Gets the value of the verification property.
     *
     * @return
     *     possible object is
     *     {@link VerificationType }
     *
     */
    public VerificationType getVerification() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     *
     * @param value
     *     allowed object is
     *     {@link VerificationType }
     *
     */
    public void setVerification(VerificationType value) {
        this.verification = value;
    }

    /**
     * Gets the value of the jobLevelInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobLevelInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobLevelInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobLevelInfoType }
     *
     *
     */
    public List<JobLevelInfoType> getJobLevelInfo() {
        if (jobLevelInfo == null) {
            jobLevelInfo = new ArrayList<JobLevelInfoType>();
        }
        return this.jobLevelInfo;
    }

    /**
     * Gets the value of the jobCategory property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCategory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCategory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupationalCategoryType }
     *
     *
     */
    public List<OccupationalCategoryType> getJobCategory() {
        if (jobCategory == null) {
            jobCategory = new ArrayList<OccupationalCategoryType>();
        }
        return this.jobCategory;
    }

    /**
     * Gets the value of the competency property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competency property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetency().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencyType }
     *
     *
     */
    public List<CompetencyType> getCompetency() {
        if (competency == null) {
            competency = new ArrayList<CompetencyType>();
        }
        return this.competency;
    }

    /**
     * Gets the value of the userArea property.
     *
     * @return
     *     possible object is
     *     {@link PositionHistoryType.UserArea }
     *
     */
    public PositionHistoryType.UserArea getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     *
     * @param value
     *     allowed object is
     *     {@link PositionHistoryType.UserArea }
     *
     */
    public void setUserArea(PositionHistoryType.UserArea value) {
        this.userArea = value;
    }

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the currentEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentEmployer() {
        return currentEmployer;
    }

    /**
     * Sets the value of the currentEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentEmployer(Boolean value) {
        this.currentEmployer = value;
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
     *         &lt;element ref="{http://sovren.com/hr-xml/2006-02-28}PositionHistoryUserArea" minOccurs="0"/&gt;
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

        @XmlElement(name = "PositionHistoryUserArea", namespace = "http://sovren.com/hr-xml/2006-02-28")
        protected PositionHistoryUserArea positionHistoryUserArea;

        /**
         * Gets the value of the positionHistoryUserArea property.
         * 
         * @return
         *     possible object is
         *     {@link PositionHistoryUserArea }
         *     
         */
        public PositionHistoryUserArea getPositionHistoryUserArea() {
            return positionHistoryUserArea;
        }

        /**
         * Sets the value of the positionHistoryUserArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link PositionHistoryUserArea }
         *     
         */
        public void setPositionHistoryUserArea(PositionHistoryUserArea value) {
            this.positionHistoryUserArea = value;
        }

    }

}