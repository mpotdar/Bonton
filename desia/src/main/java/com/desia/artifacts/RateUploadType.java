
package com.desia.artifacts;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateUploadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateUploadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseByGuestAmts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *                           &lt;sequence>
 *                             &lt;element name="NumberOfGuestsDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NumberOfGuests" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalGuestAmounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *                             &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}amountDeterminationType" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}FeesType" minOccurs="0"/>
 *         &lt;element name="GuaranteePolicies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuaranteePolicy" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CancelPolicies" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="PaymentPolicies" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType" minOccurs="0"/>
 *         &lt;element name="RateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="MealsIncluded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MealPlanCodes">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalCharges" type="{http://www.opentravel.org/OTA/2003/05}HotelAdditionalChargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RateTier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}dayOfWeekType" />
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateUploadType", propOrder = {
    "baseByGuestAmts",
    "additionalGuestAmounts",
    "fees",
    "guaranteePolicies",
    "cancelPolicies",
    "paymentPolicies",
    "rateDescription",
    "uniqueID",
    "mealsIncluded",
    "additionalCharges"
})
@XmlSeeAlso({
    com.desia.artifacts.InvBlockRoomType.RatePlans.RatePlan.class,
    com.desia.artifacts.RateAmountMessageType.Rates.Rate.class
})
public class RateUploadType {

    @XmlElement(name = "BaseByGuestAmts")
    protected RateUploadType.BaseByGuestAmts baseByGuestAmts;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected RateUploadType.AdditionalGuestAmounts additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "GuaranteePolicies")
    protected RateUploadType.GuaranteePolicies guaranteePolicies;
    @XmlElement(name = "CancelPolicies")
    protected CancelPenaltiesType cancelPolicies;
    @XmlElement(name = "PaymentPolicies")
    protected RequiredPaymentsType paymentPolicies;
    @XmlElement(name = "RateDescription")
    protected ParagraphType rateDescription;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "MealsIncluded")
    protected RateUploadType.MealsIncluded mealsIncluded;
    @XmlElement(name = "AdditionalCharges")
    protected HotelAdditionalChargesType additionalCharges;
    @XmlAttribute(name = "MaxGuestApplicable")
    protected Integer maxGuestApplicable;
    @XmlAttribute(name = "MaxLOS")
    protected String maxLOS;
    @XmlAttribute(name = "MinGuestApplicable")
    protected Integer minGuestApplicable;
    @XmlAttribute(name = "MinLOS")
    protected String minLOS;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlAttribute(name = "RateTier")
    protected String rateTier;
    @XmlAttribute(name = "RateTimeUnit")
    protected TimeUnitType rateTimeUnit;
    @XmlAttribute(name = "StayOverDate")
    protected DayOfWeekType stayOverDate;
    @XmlAttribute(name = "UnitMultiplier")
    protected Integer unitMultiplier;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "AgeBucket")
    protected String ageBucket;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "AgeTimeUnit")
    protected TimeUnitType ageTimeUnit;
    @XmlAttribute(name = "MaxAge")
    protected Integer maxAge;
    @XmlAttribute(name = "MinAge")
    protected Integer minAge;
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
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "Start")
    protected String start;

    /**
     * Gets the value of the baseByGuestAmts property.
     * 
     * @return
     *     possible object is
     *     {@link RateUploadType.BaseByGuestAmts }
     *     
     */
    public RateUploadType.BaseByGuestAmts getBaseByGuestAmts() {
        return baseByGuestAmts;
    }

    /**
     * Sets the value of the baseByGuestAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateUploadType.BaseByGuestAmts }
     *     
     */
    public void setBaseByGuestAmts(RateUploadType.BaseByGuestAmts value) {
        this.baseByGuestAmts = value;
    }

    /**
     * Gets the value of the additionalGuestAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link RateUploadType.AdditionalGuestAmounts }
     *     
     */
    public RateUploadType.AdditionalGuestAmounts getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * Sets the value of the additionalGuestAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateUploadType.AdditionalGuestAmounts }
     *     
     */
    public void setAdditionalGuestAmounts(RateUploadType.AdditionalGuestAmounts value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the guaranteePolicies property.
     * 
     * @return
     *     possible object is
     *     {@link RateUploadType.GuaranteePolicies }
     *     
     */
    public RateUploadType.GuaranteePolicies getGuaranteePolicies() {
        return guaranteePolicies;
    }

    /**
     * Sets the value of the guaranteePolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateUploadType.GuaranteePolicies }
     *     
     */
    public void setGuaranteePolicies(RateUploadType.GuaranteePolicies value) {
        this.guaranteePolicies = value;
    }

    /**
     * Gets the value of the cancelPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPolicies() {
        return cancelPolicies;
    }

    /**
     * Sets the value of the cancelPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPolicies(CancelPenaltiesType value) {
        this.cancelPolicies = value;
    }

    /**
     * Gets the value of the paymentPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredPaymentsType }
     *     
     */
    public RequiredPaymentsType getPaymentPolicies() {
        return paymentPolicies;
    }

    /**
     * Sets the value of the paymentPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentsType }
     *     
     */
    public void setPaymentPolicies(RequiredPaymentsType value) {
        this.paymentPolicies = value;
    }

    /**
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRateDescription(ParagraphType value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the mealsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link RateUploadType.MealsIncluded }
     *     
     */
    public RateUploadType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * Sets the value of the mealsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateUploadType.MealsIncluded }
     *     
     */
    public void setMealsIncluded(RateUploadType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * Gets the value of the additionalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAdditionalChargesType }
     *     
     */
    public HotelAdditionalChargesType getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * Sets the value of the additionalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAdditionalChargesType }
     *     
     */
    public void setAdditionalCharges(HotelAdditionalChargesType value) {
        this.additionalCharges = value;
    }

    /**
     * Gets the value of the maxGuestApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    /**
     * Sets the value of the maxGuestApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGuestApplicable(Integer value) {
        this.maxGuestApplicable = value;
    }

    /**
     * Gets the value of the maxLOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLOS() {
        return maxLOS;
    }

    /**
     * Sets the value of the maxLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLOS(String value) {
        this.maxLOS = value;
    }

    /**
     * Gets the value of the minGuestApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGuestApplicable() {
        return minGuestApplicable;
    }

    /**
     * Sets the value of the minGuestApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGuestApplicable(Integer value) {
        this.minGuestApplicable = value;
    }

    /**
     * Gets the value of the minLOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLOS() {
        return minLOS;
    }

    /**
     * Sets the value of the minLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLOS(String value) {
        this.minLOS = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the rateTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTier() {
        return rateTier;
    }

    /**
     * Sets the value of the rateTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTier(String value) {
        this.rateTier = value;
    }

    /**
     * Gets the value of the rateTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * Sets the value of the rateTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setRateTimeUnit(TimeUnitType value) {
        this.rateTimeUnit = value;
    }

    /**
     * Gets the value of the stayOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getStayOverDate() {
        return stayOverDate;
    }

    /**
     * Sets the value of the stayOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setStayOverDate(DayOfWeekType value) {
        this.stayOverDate = value;
    }

    /**
     * Gets the value of the unitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * Sets the value of the unitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitMultiplier(Integer value) {
        this.unitMultiplier = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the ageBucket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeBucket() {
        return ageBucket;
    }

    /**
     * Sets the value of the ageBucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeBucket(String value) {
        this.ageBucket = value;
    }

    /**
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the ageTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getAgeTimeUnit() {
        return ageTimeUnit;
    }

    /**
     * Sets the value of the ageTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setAgeTimeUnit(TimeUnitType value) {
        this.ageTimeUnit = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAge(Integer value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAge(Integer value) {
        this.minAge = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
     *                   &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}amountDeterminationType" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    @XmlType(name = "", propOrder = {
        "additionalGuestAmount"
    })
    public static class AdditionalGuestAmounts {

        @XmlElement(name = "AdditionalGuestAmount", required = true)
        protected List<RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount> additionalGuestAmount;

        /**
         * Gets the value of the additionalGuestAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalGuestAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount }
         * 
         * 
         */
        public List<RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount> getAdditionalGuestAmount() {
            if (additionalGuestAmount == null) {
                additionalGuestAmount = new ArrayList<RateUploadType.AdditionalGuestAmounts.AdditionalGuestAmount>();
            }
            return this.additionalGuestAmount;
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
         *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
         *         &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}amountDeterminationType" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "taxes",
            "addlGuestAmtDescription"
        })
        public static class AdditionalGuestAmount {

            @XmlElement(name = "Taxes")
            protected TaxesType taxes;
            @XmlElement(name = "AddlGuestAmtDescription")
            protected List<ParagraphType> addlGuestAmtDescription;
            @XmlAttribute(name = "MaxAdditionalGuests")
            protected Integer maxAdditionalGuests;
            @XmlAttribute(name = "TaxInclusive")
            protected Boolean taxInclusive;
            @XmlAttribute(name = "AgeBucket")
            protected String ageBucket;
            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "AgeTimeUnit")
            protected TimeUnitType ageTimeUnit;
            @XmlAttribute(name = "MaxAge")
            protected Integer maxAge;
            @XmlAttribute(name = "MinAge")
            protected Integer minAge;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;
            @XmlAttribute(name = "Type")
            protected AmountDeterminationType type;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the taxes property.
             * 
             * @return
             *     possible object is
             *     {@link TaxesType }
             *     
             */
            public TaxesType getTaxes() {
                return taxes;
            }

            /**
             * Sets the value of the taxes property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxesType }
             *     
             */
            public void setTaxes(TaxesType value) {
                this.taxes = value;
            }

            /**
             * Gets the value of the addlGuestAmtDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addlGuestAmtDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddlGuestAmtDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParagraphType }
             * 
             * 
             */
            public List<ParagraphType> getAddlGuestAmtDescription() {
                if (addlGuestAmtDescription == null) {
                    addlGuestAmtDescription = new ArrayList<ParagraphType>();
                }
                return this.addlGuestAmtDescription;
            }

            /**
             * Gets the value of the maxAdditionalGuests property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxAdditionalGuests() {
                return maxAdditionalGuests;
            }

            /**
             * Sets the value of the maxAdditionalGuests property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxAdditionalGuests(Integer value) {
                this.maxAdditionalGuests = value;
            }

            /**
             * Gets the value of the taxInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTaxInclusive() {
                return taxInclusive;
            }

            /**
             * Sets the value of the taxInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTaxInclusive(Boolean value) {
                this.taxInclusive = value;
            }

            /**
             * Gets the value of the ageBucket property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeBucket() {
                return ageBucket;
            }

            /**
             * Sets the value of the ageBucket property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeBucket(String value) {
                this.ageBucket = value;
            }

            /**
             * Gets the value of the ageQualifyingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * Sets the value of the ageQualifyingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * Gets the value of the ageTimeUnit property.
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * Sets the value of the ageTimeUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setAgeTimeUnit(TimeUnitType value) {
                this.ageTimeUnit = value;
            }

            /**
             * Gets the value of the maxAge property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxAge() {
                return maxAge;
            }

            /**
             * Sets the value of the maxAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxAge(Integer value) {
                this.maxAge = value;
            }

            /**
             * Gets the value of the minAge property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMinAge() {
                return minAge;
            }

            /**
             * Sets the value of the minAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMinAge(Integer value) {
                this.minAge = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link AmountDeterminationType }
             *     
             */
            public AmountDeterminationType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountDeterminationType }
             *     
             */
            public void setType(AmountDeterminationType value) {
                this.type = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

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
     *         &lt;element name="BaseByGuestAmt" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
     *                 &lt;sequence>
     *                   &lt;element name="NumberOfGuestsDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NumberOfGuests" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
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
    @XmlType(name = "", propOrder = {
        "baseByGuestAmt"
    })
    public static class BaseByGuestAmts {

        @XmlElement(name = "BaseByGuestAmt", required = true)
        protected List<RateUploadType.BaseByGuestAmts.BaseByGuestAmt> baseByGuestAmt;

        /**
         * Gets the value of the baseByGuestAmt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baseByGuestAmt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaseByGuestAmt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateUploadType.BaseByGuestAmts.BaseByGuestAmt }
         * 
         * 
         */
        public List<RateUploadType.BaseByGuestAmts.BaseByGuestAmt> getBaseByGuestAmt() {
            if (baseByGuestAmt == null) {
                baseByGuestAmt = new ArrayList<RateUploadType.BaseByGuestAmts.BaseByGuestAmt>();
            }
            return this.baseByGuestAmt;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
         *       &lt;sequence>
         *         &lt;element name="NumberOfGuestsDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NumberOfGuests" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numberOfGuestsDescription"
        })
        public static class BaseByGuestAmt
            extends TotalType
        {

            @XmlElement(name = "NumberOfGuestsDescription")
            protected List<ParagraphType> numberOfGuestsDescription;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "NumberOfGuests")
            protected Integer numberOfGuests;
            @XmlAttribute(name = "AgeBucket")
            protected String ageBucket;
            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "AgeTimeUnit")
            protected TimeUnitType ageTimeUnit;
            @XmlAttribute(name = "MaxAge")
            protected Integer maxAge;
            @XmlAttribute(name = "MinAge")
            protected Integer minAge;

            /**
             * Gets the value of the numberOfGuestsDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numberOfGuestsDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNumberOfGuestsDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParagraphType }
             * 
             * 
             */
            public List<ParagraphType> getNumberOfGuestsDescription() {
                if (numberOfGuestsDescription == null) {
                    numberOfGuestsDescription = new ArrayList<ParagraphType>();
                }
                return this.numberOfGuestsDescription;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the numberOfGuests property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumberOfGuests() {
                return numberOfGuests;
            }

            /**
             * Sets the value of the numberOfGuests property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumberOfGuests(Integer value) {
                this.numberOfGuests = value;
            }

            /**
             * Gets the value of the ageBucket property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeBucket() {
                return ageBucket;
            }

            /**
             * Sets the value of the ageBucket property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeBucket(String value) {
                this.ageBucket = value;
            }

            /**
             * Gets the value of the ageQualifyingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * Sets the value of the ageQualifyingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * Gets the value of the ageTimeUnit property.
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * Sets the value of the ageTimeUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setAgeTimeUnit(TimeUnitType value) {
                this.ageTimeUnit = value;
            }

            /**
             * Gets the value of the maxAge property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxAge() {
                return maxAge;
            }

            /**
             * Sets the value of the maxAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxAge(Integer value) {
                this.maxAge = value;
            }

            /**
             * Gets the value of the minAge property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMinAge() {
                return minAge;
            }

            /**
             * Sets the value of the minAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMinAge(Integer value) {
                this.minAge = value;
            }

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
     *         &lt;element name="GuaranteePolicy" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guaranteePolicy"
    })
    public static class GuaranteePolicies {

        @XmlElement(name = "GuaranteePolicy", required = true)
        protected List<GuaranteeType> guaranteePolicy;

        /**
         * Gets the value of the guaranteePolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guaranteePolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuaranteePolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuaranteeType }
         * 
         * 
         */
        public List<GuaranteeType> getGuaranteePolicy() {
            if (guaranteePolicy == null) {
                guaranteePolicy = new ArrayList<GuaranteeType>();
            }
            return this.guaranteePolicy;
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
     *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MealPlanCodes">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "Dinner")
        protected Boolean dinner;
        @XmlAttribute(name = "Lunch")
        protected Boolean lunch;
        @XmlAttribute(name = "MealPlanCodes")
        protected List<String> mealPlanCodes;
        @XmlAttribute(name = "MealPlanIndicator")
        protected Boolean mealPlanIndicator;

        /**
         * Gets the value of the breakfast property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * Sets the value of the breakfast property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * Gets the value of the dinner property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * Sets the value of the dinner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

        /**
         * Gets the value of the lunch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * Sets the value of the lunch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * Gets the value of the mealPlanCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlanCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMealPlanCodes() {
            if (mealPlanCodes == null) {
                mealPlanCodes = new ArrayList<String>();
            }
            return this.mealPlanCodes;
        }

        /**
         * Gets the value of the mealPlanIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMealPlanIndicator() {
            return mealPlanIndicator;
        }

        /**
         * Sets the value of the mealPlanIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMealPlanIndicator(Boolean value) {
            this.mealPlanIndicator = value;
        }

    }

}
