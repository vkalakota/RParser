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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for VerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ns.hr-xml.org/2006-02-28}PersonName"/&gt;
 *                   &lt;element name="ContactMethod" type="{http://ns.hr-xml.org/2006-02-28}ContactMethodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonForLeaving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PermissionToContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerifyEmployment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EligibleForRehire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AttendanceRating" type="{http://ns.hr-xml.org/2006-02-28}RatingType" minOccurs="0"/&gt;
 *         &lt;element name="OverallPerformanceRating" type="{http://ns.hr-xml.org/2006-02-28}RatingType" minOccurs="0"/&gt;
 *         &lt;element name="QuestionAnswerPair" type="{http://ns.hr-xml.org/2006-02-28}EmploymentQuestionAnswerPairType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationType", propOrder = {
    "contactInfo",
    "reasonForLeaving",
    "permissionToContact",
    "verifyEmployment",
    "eligibleForRehire",
    "attendanceRating",
    "overallPerformanceRating",
    "questionAnswerPair"
})
public class VerificationType {

    @XmlElement(name = "ContactInfo", required = true)
    protected VerificationType.ContactInfo contactInfo;
    @XmlElement(name = "ReasonForLeaving")
    protected String reasonForLeaving;
    @XmlElement(name = "PermissionToContact")
    protected Boolean permissionToContact;
    @XmlElement(name = "VerifyEmployment")
    protected Boolean verifyEmployment;
    @XmlElement(name = "EligibleForRehire")
    protected Boolean eligibleForRehire;
    @XmlElement(name = "AttendanceRating")
    protected RatingType attendanceRating;
    @XmlElement(name = "OverallPerformanceRating")
    protected RatingType overallPerformanceRating;
    @XmlElement(name = "QuestionAnswerPair")
    protected List<EmploymentQuestionAnswerPairType> questionAnswerPair;

    /**
     * Gets the value of the contactInfo property.
     *
     * @return
     *     possible object is
     *     {@link VerificationType.ContactInfo }
     *
     */
    public VerificationType.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link VerificationType.ContactInfo }
     *
     */
    public void setContactInfo(VerificationType.ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the reasonForLeaving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForLeaving() {
        return reasonForLeaving;
    }

    /**
     * Sets the value of the reasonForLeaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForLeaving(String value) {
        this.reasonForLeaving = value;
    }

    /**
     * Gets the value of the permissionToContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionToContact() {
        return permissionToContact;
    }

    /**
     * Sets the value of the permissionToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionToContact(Boolean value) {
        this.permissionToContact = value;
    }

    /**
     * Gets the value of the verifyEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyEmployment() {
        return verifyEmployment;
    }

    /**
     * Sets the value of the verifyEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyEmployment(Boolean value) {
        this.verifyEmployment = value;
    }

    /**
     * Gets the value of the eligibleForRehire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForRehire() {
        return eligibleForRehire;
    }

    /**
     * Sets the value of the eligibleForRehire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForRehire(Boolean value) {
        this.eligibleForRehire = value;
    }

    /**
     * Gets the value of the attendanceRating property.
     * 
     * @return
     *     possible object is
     *     {@link RatingType }
     *     
     */
    public RatingType getAttendanceRating() {
        return attendanceRating;
    }

    /**
     * Sets the value of the attendanceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingType }
     *     
     */
    public void setAttendanceRating(RatingType value) {
        this.attendanceRating = value;
    }

    /**
     * Gets the value of the overallPerformanceRating property.
     * 
     * @return
     *     possible object is
     *     {@link RatingType }
     *     
     */
    public RatingType getOverallPerformanceRating() {
        return overallPerformanceRating;
    }

    /**
     * Sets the value of the overallPerformanceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingType }
     *     
     */
    public void setOverallPerformanceRating(RatingType value) {
        this.overallPerformanceRating = value;
    }

    /**
     * Gets the value of the questionAnswerPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswerPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswerPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentQuestionAnswerPairType }
     * 
     * 
     */
    public List<EmploymentQuestionAnswerPairType> getQuestionAnswerPair() {
        if (questionAnswerPair == null) {
            questionAnswerPair = new ArrayList<EmploymentQuestionAnswerPairType>();
        }
        return this.questionAnswerPair;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://ns.hr-xml.org/2006-02-28}PersonName"/&gt;
     *         &lt;element name="ContactMethod" type="{http://ns.hr-xml.org/2006-02-28}ContactMethodType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "personName",
        "contactMethod"
    })
    public static class ContactInfo {

        @XmlElement(name = "PersonName", required = true)
        protected PersonNameType personName;
        @XmlElement(name = "ContactMethod")
        protected List<ContactMethodType> contactMethod;

        /**
         * Gets the value of the personName property.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameType }
         *     
         */
        public PersonNameType getPersonName() {
            return personName;
        }

        /**
         * Sets the value of the personName property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameType }
         *     
         */
        public void setPersonName(PersonNameType value) {
            this.personName = value;
        }

        /**
         * Gets the value of the contactMethod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactMethod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMethodType }
         * 
         * 
         */
        public List<ContactMethodType> getContactMethod() {
            if (contactMethod == null) {
                contactMethod = new ArrayList<ContactMethodType>();
            }
            return this.contactMethod;
        }

    }

}
