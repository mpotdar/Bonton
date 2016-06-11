
package com.desia.artifacts;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingRoomCapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Occupancy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MeetingRoomFormatCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomCapacityType", propOrder = {
    "occupancy"
})
public class MeetingRoomCapacityType {

    @XmlElement(name = "Occupancy")
    protected MeetingRoomCapacityType.Occupancy occupancy;
    @XmlAttribute(name = "MeetingRoomFormatCode")
    protected String meetingRoomFormatCode;

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingRoomCapacityType.Occupancy }
     *     
     */
    public MeetingRoomCapacityType.Occupancy getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingRoomCapacityType.Occupancy }
     *     
     */
    public void setOccupancy(MeetingRoomCapacityType.Occupancy value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the meetingRoomFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingRoomFormatCode() {
        return meetingRoomFormatCode;
    }

    /**
     * Sets the value of the meetingRoomFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingRoomFormatCode(String value) {
        this.meetingRoomFormatCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "minRoomCharge"
    })
    public static class Occupancy {

        @XmlElement(name = "MinRoomCharge")
        protected FeeType minRoomCharge;
        @XmlAttribute(name = "MaxOccupancy")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "MinOccupancy")
        protected BigInteger minOccupancy;
        @XmlAttribute(name = "StandardOccupancy")
        protected BigInteger standardOccupancy;

        /**
         * Gets the value of the minRoomCharge property.
         * 
         * @return
         *     possible object is
         *     {@link FeeType }
         *     
         */
        public FeeType getMinRoomCharge() {
            return minRoomCharge;
        }

        /**
         * Sets the value of the minRoomCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeType }
         *     
         */
        public void setMinRoomCharge(FeeType value) {
            this.minRoomCharge = value;
        }

        /**
         * Gets the value of the maxOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * Sets the value of the maxOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * Gets the value of the minOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * Sets the value of the minOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        /**
         * Gets the value of the standardOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardOccupancy() {
            return standardOccupancy;
        }

        /**
         * Sets the value of the standardOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardOccupancy(BigInteger value) {
            this.standardOccupancy = value;
        }

    }

}
