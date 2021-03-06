//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * Bibliographic information for other publication type, such as a Thesis, Whitepaper, Report, Technical Documentation, etc.
 * 
 * <p>Java class for OtherPublicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPublicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ns.hr-xml.org/2006-02-28}BasicBibliographicRecordType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISSN" type="{http://ns.hr-xml.org/2006-02-28}issnType" minOccurs="0"/&gt;
 *         &lt;element name="ISBN" type="{http://ns.hr-xml.org/2006-02-28}isbnType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="PublisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublisherLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://ns.hr-xml.org/2006-02-28}PublicationOtherTypes" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPublicationType", propOrder = {
    "issn",
    "isbn",
    "numberOfPages",
    "publisherName",
    "publisherLocation"
})
public class OtherPublicationType
    extends BasicBibliographicRecordType
{

    @XmlElement(name = "ISSN")
    protected String issn;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "NumberOfPages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPages;
    @XmlElement(name = "PublisherName")
    protected String publisherName;
    @XmlElement(name = "PublisherLocation")
    protected String publisherLocation;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSN() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSN(String value) {
        this.issn = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPages(BigInteger value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the publisherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }

    /**
     * Sets the value of the publisherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherLocation(String value) {
        this.publisherLocation = value;
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

}
