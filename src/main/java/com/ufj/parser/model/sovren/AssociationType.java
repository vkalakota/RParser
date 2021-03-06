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
 * <p>Java class for AssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Id" type="{http://ns.hr-xml.org/2006-02-28}EntityIdType" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://ns.hr-xml.org/2006-02-28}InternetWebAddressType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
 *         &lt;element name="Role" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="StartDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
 *                   &lt;element name="EndDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
 *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "AssociationType", propOrder = {
    "name",
    "id",
    "link",
    "startDate",
    "endDate",
    "role",
    "comments"
})
@XmlSeeAlso({
    Association.class
})
public class AssociationType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Id")
    protected EntityIdType id;
    @XmlElement(name = "Link")
    protected String link;
    @XmlElement(name = "StartDate")
    protected FlexibleDatesType startDate;
    @XmlElement(name = "EndDate")
    protected FlexibleDatesType endDate;
    @XmlElement(name = "Role")
    protected List<Role> role;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *
     */
    public EntityIdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *
     */
    public void setId(EntityIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the link property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLink(String value) {
        this.link = value;
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
     * Gets the value of the role property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationType.Role }
     *
     *
     */
    public List<Role> getRole() {
        if (role == null) {
            role = new ArrayList<Role>();
        }
        return this.role;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="StartDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
     *         &lt;element name="EndDate" type="{http://ns.hr-xml.org/2006-02-28}FlexibleDatesType" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "name",
        "deliverable",
        "startDate",
        "endDate",
        "comments"
    })
    public static class Role {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "Deliverable")
        protected List<String> deliverable;
        @XmlElement(name = "StartDate")
        protected FlexibleDatesType startDate;
        @XmlElement(name = "EndDate")
        protected FlexibleDatesType endDate;
        @XmlElement(name = "Comments")
        protected String comments;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the deliverable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliverable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliverable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDeliverable() {
            if (deliverable == null) {
                deliverable = new ArrayList<String>();
            }
            return this.deliverable;
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

}
