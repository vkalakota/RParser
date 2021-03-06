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
 * <p>Java class for GraduatingDegreeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GraduatingDegreeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="graduating"/&gt;
 *     &lt;enumeration value="qualifying"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GraduatingDegreeType")
@XmlEnum
public enum GraduatingDegreeType {

    @XmlEnumValue("graduating")
    GRADUATING("graduating"),
    @XmlEnumValue("qualifying")
    QUALIFYING("qualifying");
    private final String value;

    GraduatingDegreeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GraduatingDegreeType fromValue(String v) {
        for (GraduatingDegreeType c: GraduatingDegreeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
