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
 * This is used in the context of a resume or CV to list articles, books, or other publications authored or co-authored by an individual. 
 * 
 * <p>Java class for PublicationHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicationHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedPublicationDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type" type="{http://ns.hr-xml.org/2006-02-28}PublicationTypes" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Article" type="{http://ns.hr-xml.org/2006-02-28}ArticleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Book" type="{http://ns.hr-xml.org/2006-02-28}BookType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConferencePaper" type="{http://ns.hr-xml.org/2006-02-28}ConferencePaperType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherPublication" type="{http://ns.hr-xml.org/2006-02-28}OtherPublicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationHistoryType", propOrder = {
    "formattedPublicationDescription",
    "article",
    "book",
    "conferencePaper",
    "otherPublication"
})
public class PublicationHistoryType {

    @XmlElement(name = "FormattedPublicationDescription")
    protected List<FormattedPublicationDescription> formattedPublicationDescription;
    @XmlElement(name = "Article")
    protected List<ArticleType> article;
    @XmlElement(name = "Book")
    protected List<BookType> book;
    @XmlElement(name = "ConferencePaper")
    protected List<ConferencePaperType> conferencePaper;
    @XmlElement(name = "OtherPublication")
    protected List<OtherPublicationType> otherPublication;

    /**
     * Gets the value of the formattedPublicationDescription property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formattedPublicationDescription property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormattedPublicationDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationHistoryType.FormattedPublicationDescription }
     *
     *
     */
    public List<FormattedPublicationDescription> getFormattedPublicationDescription() {
        if (formattedPublicationDescription == null) {
            formattedPublicationDescription = new ArrayList<FormattedPublicationDescription>();
        }
        return this.formattedPublicationDescription;
    }

    /**
     * Gets the value of the article property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the article property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleType }
     * 
     * 
     */
    public List<ArticleType> getArticle() {
        if (article == null) {
            article = new ArrayList<ArticleType>();
        }
        return this.article;
    }

    /**
     * Gets the value of the book property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the book property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookType }
     * 
     * 
     */
    public List<BookType> getBook() {
        if (book == null) {
            book = new ArrayList<BookType>();
        }
        return this.book;
    }

    /**
     * Gets the value of the conferencePaper property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conferencePaper property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConferencePaper().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConferencePaperType }
     * 
     * 
     */
    public List<ConferencePaperType> getConferencePaper() {
        if (conferencePaper == null) {
            conferencePaper = new ArrayList<ConferencePaperType>();
        }
        return this.conferencePaper;
    }

    /**
     * Gets the value of the otherPublication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPublication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPublicationType }
     * 
     * 
     */
    public List<OtherPublicationType> getOtherPublication() {
        if (otherPublication == null) {
            otherPublication = new ArrayList<OtherPublicationType>();
        }
        return this.otherPublication;
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
     *       &lt;attribute name="type" type="{http://ns.hr-xml.org/2006-02-28}PublicationTypes" /&gt;
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
    public static class FormattedPublicationDescription {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type")
        protected String type;

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

    }

}