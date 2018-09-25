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
 * <p>Java class for PatentStatusTypeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PatentStatusTypeTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PatentIssued"/&gt;
 *     &lt;enumeration value="PatentPending"/&gt;
 *     &lt;enumeration value="PatentFiled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PatentStatusTypeTypes")
@XmlEnum
public enum PatentStatusTypeTypes {

    @XmlEnumValue("PatentIssued")
    PATENT_ISSUED("PatentIssued"),
    @XmlEnumValue("PatentPending")
    PATENT_PENDING("PatentPending"),
    @XmlEnumValue("PatentFiled")
    PATENT_FILED("PatentFiled");
    private final String value;

    PatentStatusTypeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentStatusTypeTypes fromValue(String v) {
        for (PatentStatusTypeTypes c: PatentStatusTypeTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}