//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:50:38 PM EDT 
//


package com.ufj.parser.model.sovren;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for schoolTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="schoolTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="highschool"/&gt;
 *     &lt;enumeration value="secondary"/&gt;
 *     &lt;enumeration value="trade"/&gt;
 *     &lt;enumeration value="community"/&gt;
 *     &lt;enumeration value="college"/&gt;
 *     &lt;enumeration value="university"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "schoolTypes")
@XmlEnum
public enum SchoolTypes {

    @XmlEnumValue("highschool")
    HIGHSCHOOL("highschool"),
    @XmlEnumValue("secondary")
    SECONDARY("secondary"),
    @XmlEnumValue("trade")
    TRADE("trade"),
    @XmlEnumValue("community")
    COMMUNITY("community"),
    @XmlEnumValue("college")
    COLLEGE("college"),
    @XmlEnumValue("university")
    UNIVERSITY("university");
    private final String value;

    SchoolTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchoolTypes fromValue(String v) {
        for (SchoolTypes c: SchoolTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}