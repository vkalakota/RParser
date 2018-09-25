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
 * <p>Java class for degreeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="degreeTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="secondary"/&gt;
 *     &lt;enumeration value="high school or equivalent"/&gt;
 *     &lt;enumeration value="some high school or equivalent"/&gt;
 *     &lt;enumeration value="HND/HNC or equivalent"/&gt;
 *     &lt;enumeration value="vocational"/&gt;
 *     &lt;enumeration value="certification"/&gt;
 *     &lt;enumeration value="some college"/&gt;
 *     &lt;enumeration value="associates"/&gt;
 *     &lt;enumeration value="bachelors"/&gt;
 *     &lt;enumeration value="some post-graduate"/&gt;
 *     &lt;enumeration value="masters"/&gt;
 *     &lt;enumeration value="doctorate"/&gt;
 *     &lt;enumeration value="postdoctorate"/&gt;
 *     &lt;enumeration value="professional"/&gt;
 *     &lt;enumeration value="postprofessional"/&gt;
 *     &lt;enumeration value="intermediategraduate"/&gt;
 *     &lt;enumeration value="specialeducation"/&gt;
 *     &lt;enumeration value="ged"/&gt;
 *     &lt;enumeration value="international"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "degreeTypes")
@XmlEnum
public enum DegreeTypes {

    @XmlEnumValue("secondary")
    SECONDARY("secondary"),
    @XmlEnumValue("high school or equivalent")
    HIGH_SCHOOL_OR_EQUIVALENT("high school or equivalent"),
    @XmlEnumValue("some high school or equivalent")
    SOME_HIGH_SCHOOL_OR_EQUIVALENT("some high school or equivalent"),
    @XmlEnumValue("HND/HNC or equivalent")
    HND_HNC_OR_EQUIVALENT("HND/HNC or equivalent"),
    @XmlEnumValue("vocational")
    VOCATIONAL("vocational"),
    @XmlEnumValue("certification")
    CERTIFICATION("certification"),
    @XmlEnumValue("some college")
    SOME_COLLEGE("some college"),
    @XmlEnumValue("associates")
    ASSOCIATES("associates"),
    @XmlEnumValue("bachelors")
    BACHELORS("bachelors"),
    @XmlEnumValue("some post-graduate")
    SOME_POST_GRADUATE("some post-graduate"),
    @XmlEnumValue("masters")
    MASTERS("masters"),
    @XmlEnumValue("doctorate")
    DOCTORATE("doctorate"),
    @XmlEnumValue("postdoctorate")
    POSTDOCTORATE("postdoctorate"),
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),
    @XmlEnumValue("postprofessional")
    POSTPROFESSIONAL("postprofessional"),
    @XmlEnumValue("intermediategraduate")
    INTERMEDIATEGRADUATE("intermediategraduate"),
    @XmlEnumValue("specialeducation")
    SPECIALEDUCATION("specialeducation"),
    @XmlEnumValue("ged")
    GED("ged"),
    @XmlEnumValue("international")
    INTERNATIONAL("international");
    private final String value;

    DegreeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DegreeTypes fromValue(String v) {
        for (DegreeTypes c: DegreeTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
