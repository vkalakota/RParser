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
 * <p>Java class for CompetencyWeightType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompetencyWeightType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="levelOfInterest"/&gt;
 *     &lt;enumeration value="skillLevel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompetencyWeightType")
@XmlEnum
public enum CompetencyWeightType {

    @XmlEnumValue("levelOfInterest")
    LEVEL_OF_INTEREST("levelOfInterest"),
    @XmlEnumValue("skillLevel")
    SKILL_LEVEL("skillLevel");
    private final String value;

    CompetencyWeightType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompetencyWeightType fromValue(String v) {
        for (CompetencyWeightType c: CompetencyWeightType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
