
package com.epam.vaigandt.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preciousnessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="preciousnessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Precious"/>
 *     &lt;enumeration value="Semi-precious"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "preciousnessType", namespace = "http://www.example.com/gems")
@XmlEnum
public enum PreciousnessType {

    @XmlEnumValue("Precious")
    PRECIOUS("Precious"),
    @XmlEnumValue("Semi-precious")
    SEMI_PRECIOUS("Semi-precious");
    private final String value;

    PreciousnessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreciousnessType fromValue(String v) {
        for (PreciousnessType c: PreciousnessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
