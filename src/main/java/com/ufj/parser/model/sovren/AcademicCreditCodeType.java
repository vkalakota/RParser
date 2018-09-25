//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcademicCreditCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcademicCreditCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcademicCreditCodeType")
@XmlEnum
public enum AcademicCreditCodeType {


    /**
     * Adult Credits
     * 
     */
    A,

    /**
     * Continuing Education Unit
     * 
     */
    C,

    /**
     * Carnegie Units
     * 
     */
    G,

    /**
     * No Credit
     * 
     */
    N,

    /**
     * Quarter Hour Credit
     * 
     */
    Q,

    /**
     * Semester Hour Credit
     * 
     */
    S,

    /**
     * Units
     * 
     */
    U,

    /**
     * Vocational Credits
     * 
     */
    V,

    /**
     * Other Type of Credit
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static AcademicCreditCodeType fromValue(String v) {
        return valueOf(v);
    }

}
