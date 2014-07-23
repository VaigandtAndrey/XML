
package com.epam.vaigandt.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for visualParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="visualParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transparency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edgeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visualParametersType", namespace = "http://www.example.com/gems", propOrder = {
    "color",
    "transparency",
    "edgeNumber"
})
public class VisualParametersType {

    @XmlElement(required = true)
    protected String color;
    protected int transparency;
    protected int edgeNumber;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the transparency property.
     * 
     */
    public int getTransparency() {
        return transparency;
    }

    /**
     * Sets the value of the transparency property.
     * 
     */
    public void setTransparency(int value) {
        this.transparency = value;
    }

    /**
     * Gets the value of the edgeNumber property.
     * 
     */
    public int getEdgeNumber() {
        return edgeNumber;
    }

    /**
     * Sets the value of the edgeNumber property.
     * 
     */
    public void setEdgeNumber(int value) {
        this.edgeNumber = value;
    }

}
