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
 * <p>Java class for RelationshipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agent"/&gt;
 *     &lt;enumeration value="broker"/&gt;
 *     &lt;enumeration value="self"/&gt;
 *     &lt;enumeration value="referrer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationshipType")
@XmlEnum
public enum RelationshipType {

    @XmlEnumValue("agent")
    AGENT("agent"),
    @XmlEnumValue("broker")
    BROKER("broker"),
    @XmlEnumValue("self")
    SELF("self"),
    @XmlEnumValue("referrer")
    REFERRER("referrer");
    private final String value;

    RelationshipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipType fromValue(String v) {
        for (RelationshipType c: RelationshipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
