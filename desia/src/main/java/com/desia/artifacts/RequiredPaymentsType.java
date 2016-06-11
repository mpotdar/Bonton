
package com.desia.artifacts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredPaymentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredPaymentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteePayment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}AcceptedPaymentsType" minOccurs="0"/>
 *                   &lt;element name="AmountPercent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Deadline" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *                           &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AgencyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CompanyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GuaranteeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InterbankNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RetributionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredPaymentsType", propOrder = {
    "guaranteePayment"
})
@XmlSeeAlso({
    com.desia.artifacts.PoliciesType.Policy.GuaranteePaymentPolicy.class
})
public class RequiredPaymentsType {

    @XmlElement(name = "GuaranteePayment", required = true)
    protected List<RequiredPaymentsType.GuaranteePayment> guaranteePayment;

    /**
     * Gets the value of the guaranteePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredPaymentsType.GuaranteePayment }
     * 
     * 
     */
    public List<RequiredPaymentsType.GuaranteePayment> getGuaranteePayment() {
        if (guaranteePayment == null) {
            guaranteePayment = new ArrayList<RequiredPaymentsType.GuaranteePayment>();
        }
        return this.guaranteePayment;
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
     *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}AcceptedPaymentsType" minOccurs="0"/>
     *         &lt;element name="AmountPercent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Deadline" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
     *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AgencyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CompanyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuaranteeType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InterbankNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RetributionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acceptedPayments",
        "amountPercent",
        "deadline",
        "description",
        "address",
        "tpaExtensions"
    })
    public static class GuaranteePayment {

        @XmlElement(name = "AcceptedPayments")
        protected AcceptedPaymentsType acceptedPayments;
        @XmlElement(name = "AmountPercent")
        protected RequiredPaymentsType.GuaranteePayment.AmountPercent amountPercent;
        @XmlElement(name = "Deadline")
        protected List<RequiredPaymentsType.GuaranteePayment.Deadline> deadline;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlElement(name = "Address")
        protected List<RequiredPaymentsType.GuaranteePayment.Address> address;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "AddressInd")
        protected Boolean addressInd;
        @XmlAttribute(name = "AgencyNameAddrReqInd")
        protected Boolean agencyNameAddrReqInd;
        @XmlAttribute(name = "CompanyNameAddrReqInd")
        protected Boolean companyNameAddrReqInd;
        @XmlAttribute(name = "GuaranteeCode")
        protected String guaranteeCode;
        @XmlAttribute(name = "GuaranteeType")
        protected String guaranteeType;
        @XmlAttribute(name = "HoldTime")
        @XmlSchemaType(name = "anySimpleType")
        protected String holdTime;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "InterbankNbrInd")
        protected Boolean interbankNbrInd;
        @XmlAttribute(name = "NameInd")
        protected Boolean nameInd;
        @XmlAttribute(name = "NoCardHolderInfoReqInd")
        protected Boolean noCardHolderInfoReqInd;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "PaymentCode")
        protected String paymentCode;
        @XmlAttribute(name = "PhoneInd")
        protected Boolean phoneInd;
        @XmlAttribute(name = "PolicyCode")
        protected String policyCode;
        @XmlAttribute(name = "RetributionType")
        protected String retributionType;
        @XmlAttribute(name = "RoomTypeCode")
        protected String roomTypeCode;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;

        /**
         * Gets the value of the acceptedPayments property.
         * 
         * @return
         *     possible object is
         *     {@link AcceptedPaymentsType }
         *     
         */
        public AcceptedPaymentsType getAcceptedPayments() {
            return acceptedPayments;
        }

        /**
         * Sets the value of the acceptedPayments property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptedPaymentsType }
         *     
         */
        public void setAcceptedPayments(AcceptedPaymentsType value) {
            this.acceptedPayments = value;
        }

        /**
         * Gets the value of the amountPercent property.
         * 
         * @return
         *     possible object is
         *     {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *     
         */
        public RequiredPaymentsType.GuaranteePayment.AmountPercent getAmountPercent() {
            return amountPercent;
        }

        /**
         * Sets the value of the amountPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *     
         */
        public void setAmountPercent(RequiredPaymentsType.GuaranteePayment.AmountPercent value) {
            this.amountPercent = value;
        }

        /**
         * Gets the value of the deadline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deadline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeadline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredPaymentsType.GuaranteePayment.Deadline }
         * 
         * 
         */
        public List<RequiredPaymentsType.GuaranteePayment.Deadline> getDeadline() {
            if (deadline == null) {
                deadline = new ArrayList<RequiredPaymentsType.GuaranteePayment.Deadline>();
            }
            return this.deadline;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredPaymentsType.GuaranteePayment.Address }
         * 
         * 
         */
        public List<RequiredPaymentsType.GuaranteePayment.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<RequiredPaymentsType.GuaranteePayment.Address>();
            }
            return this.address;
        }

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the addressInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressInd() {
            return addressInd;
        }

        /**
         * Sets the value of the addressInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressInd(Boolean value) {
            this.addressInd = value;
        }

        /**
         * Gets the value of the agencyNameAddrReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAgencyNameAddrReqInd() {
            return agencyNameAddrReqInd;
        }

        /**
         * Sets the value of the agencyNameAddrReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAgencyNameAddrReqInd(Boolean value) {
            this.agencyNameAddrReqInd = value;
        }

        /**
         * Gets the value of the companyNameAddrReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCompanyNameAddrReqInd() {
            return companyNameAddrReqInd;
        }

        /**
         * Sets the value of the companyNameAddrReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCompanyNameAddrReqInd(Boolean value) {
            this.companyNameAddrReqInd = value;
        }

        /**
         * Gets the value of the guaranteeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeCode() {
            return guaranteeCode;
        }

        /**
         * Sets the value of the guaranteeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeCode(String value) {
            this.guaranteeCode = value;
        }

        /**
         * Gets the value of the guaranteeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeType() {
            return guaranteeType;
        }

        /**
         * Sets the value of the guaranteeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeType(String value) {
            this.guaranteeType = value;
        }

        /**
         * Gets the value of the holdTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoldTime() {
            return holdTime;
        }

        /**
         * Sets the value of the holdTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoldTime(String value) {
            this.holdTime = value;
        }

        /**
         * Gets the value of the infoSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * Sets the value of the infoSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * Gets the value of the interbankNbrInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbankNbrInd() {
            return interbankNbrInd;
        }

        /**
         * Sets the value of the interbankNbrInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbankNbrInd(Boolean value) {
            this.interbankNbrInd = value;
        }

        /**
         * Gets the value of the nameInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNameInd() {
            return nameInd;
        }

        /**
         * Sets the value of the nameInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNameInd(Boolean value) {
            this.nameInd = value;
        }

        /**
         * Gets the value of the noCardHolderInfoReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * Sets the value of the noCardHolderInfoReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * Gets the value of the nonRefundableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * Sets the value of the nonRefundableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * Gets the value of the paymentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentCode() {
            return paymentCode;
        }

        /**
         * Sets the value of the paymentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentCode(String value) {
            this.paymentCode = value;
        }

        /**
         * Gets the value of the phoneInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPhoneInd() {
            return phoneInd;
        }

        /**
         * Sets the value of the phoneInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPhoneInd(Boolean value) {
            this.phoneInd = value;
        }

        /**
         * Gets the value of the policyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyCode() {
            return policyCode;
        }

        /**
         * Sets the value of the policyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyCode(String value) {
            this.policyCode = value;
        }

        /**
         * Gets the value of the retributionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRetributionType() {
            return retributionType;
        }

        /**
         * Sets the value of the retributionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRetributionType(String value) {
            this.retributionType = value;
        }

        /**
         * Gets the value of the roomTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomTypeCode() {
            return roomTypeCode;
        }

        /**
         * Sets the value of the roomTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomTypeCode(String value) {
            this.roomTypeCode = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the fri property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Sets the value of the fri property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Gets the value of the mon property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Sets the value of the mon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * Gets the value of the sun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Sets the value of the sun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

        /**
         * Gets the value of the thur property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * Sets the value of the thur property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * Gets the value of the tue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Sets the value of the tue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Gets the value of the weds property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * Sets the value of the weds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Address
            extends AddressInfoType
        {

            @XmlAttribute(name = "AddresseeName")
            protected String addresseeName;

            /**
             * Gets the value of the addresseeName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddresseeName() {
                return addresseeName;
            }

            /**
             * Sets the value of the addresseeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddresseeName(String value) {
                this.addresseeName = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmountPercent
            extends AmountPercentType
        {

            @XmlAttribute(name = "OverriddenAmountIndicator")
            protected Boolean overriddenAmountIndicator;

            /**
             * Gets the value of the overriddenAmountIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverriddenAmountIndicator() {
                return overriddenAmountIndicator;
            }

            /**
             * Sets the value of the overriddenAmountIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverriddenAmountIndicator(Boolean value) {
                this.overriddenAmountIndicator = value;
            }

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
         *       &lt;/sequence>
         *       &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
         *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Deadline {

            @XmlAttribute(name = "OverrideIndicator")
            protected Boolean overrideIndicator;
            @XmlAttribute(name = "AbsoluteDeadline")
            protected String absoluteDeadline;
            @XmlAttribute(name = "OffsetDropTime")
            protected String offsetDropTime;
            @XmlAttribute(name = "OffsetTimeUnit")
            protected TimeUnitType offsetTimeUnit;
            @XmlAttribute(name = "OffsetUnitMultiplier")
            protected Integer offsetUnitMultiplier;

            /**
             * Gets the value of the overrideIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverrideIndicator() {
                return overrideIndicator;
            }

            /**
             * Sets the value of the overrideIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverrideIndicator(Boolean value) {
                this.overrideIndicator = value;
            }

            /**
             * Gets the value of the absoluteDeadline property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbsoluteDeadline() {
                return absoluteDeadline;
            }

            /**
             * Sets the value of the absoluteDeadline property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbsoluteDeadline(String value) {
                this.absoluteDeadline = value;
            }

            /**
             * Gets the value of the offsetDropTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffsetDropTime() {
                return offsetDropTime;
            }

            /**
             * Sets the value of the offsetDropTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffsetDropTime(String value) {
                this.offsetDropTime = value;
            }

            /**
             * Gets the value of the offsetTimeUnit property.
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getOffsetTimeUnit() {
                return offsetTimeUnit;
            }

            /**
             * Sets the value of the offsetTimeUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setOffsetTimeUnit(TimeUnitType value) {
                this.offsetTimeUnit = value;
            }

            /**
             * Gets the value of the offsetUnitMultiplier property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOffsetUnitMultiplier() {
                return offsetUnitMultiplier;
            }

            /**
             * Sets the value of the offsetUnitMultiplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOffsetUnitMultiplier(Integer value) {
                this.offsetUnitMultiplier = value;
            }

        }

    }

}
