
package com.desia.artifacts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType")
public class DescriptionType
    extends ParagraphType
{

    @XmlAttribute(name = "Location")
    protected Boolean location;
    @XmlAttribute(name = "RefDirectionTo")
    protected Boolean refDirectionTo;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocation(Boolean value) {
        this.location = value;
    }

    /**
     * Gets the value of the refDirectionTo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefDirectionTo() {
        return refDirectionTo;
    }

    /**
     * Sets the value of the refDirectionTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefDirectionTo(Boolean value) {
        this.refDirectionTo = value;
    }

}
