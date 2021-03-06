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
 * <p>Java class for ResumeItemTypeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResumeItemTypeTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Activities"/&gt;
 *     &lt;enumeration value="Interests"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Community"/&gt;
 *     &lt;enumeration value="Hobbies"/&gt;
 *     &lt;enumeration value="Volunteer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResumeItemTypeTypes")
@XmlEnum
public enum ResumeItemTypeTypes {

    @XmlEnumValue("Activities")
    ACTIVITIES("Activities"),
    @XmlEnumValue("Interests")
    INTERESTS("Interests"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Community")
    COMMUNITY("Community"),
    @XmlEnumValue("Hobbies")
    HOBBIES("Hobbies"),
    @XmlEnumValue("Volunteer")
    VOLUNTEER("Volunteer");
    private final String value;

    ResumeItemTypeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResumeItemTypeTypes fromValue(String v) {
        for (ResumeItemTypeTypes c: ResumeItemTypeTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
