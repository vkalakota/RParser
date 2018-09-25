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
 * <p>Java class for contactMethodUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contactMethodUseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="business"/&gt;
 *     &lt;enumeration value="businessDirect"/&gt;
 *     &lt;enumeration value="personal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "contactMethodUseType")
@XmlEnum
public enum ContactMethodUseType {

    @XmlEnumValue("business")
    BUSINESS("business"),
    @XmlEnumValue("businessDirect")
    BUSINESS_DIRECT("businessDirect"),
    @XmlEnumValue("personal")
    PERSONAL("personal");
    private final String value;

    ContactMethodUseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactMethodUseType fromValue(String v) {
        for (ContactMethodUseType c: ContactMethodUseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
