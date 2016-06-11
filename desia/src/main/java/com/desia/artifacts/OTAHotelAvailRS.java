
package com.desia.artifacts;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type" minOccurs="0"/>
 *         &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *         &lt;element name="HotelStays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelStay" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Status" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/>
 *                             &lt;element name="Price" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RoomStayRPH">
 *                             &lt;simpleType>
 *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomStays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomStay" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                           &lt;sequence>
 *                             &lt;element name="Reference" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}rateIndicatorType" />
 *                           &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ServicesType" minOccurs="0"/>
 *         &lt;element name="Areas" type="{http://www.opentravel.org/OTA/2003/05}AreasType" minOccurs="0"/>
 *         &lt;element name="Criteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Criterion" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrencyConversions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrencyConversion" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="RateConversion" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RebatePrograms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SearchCacheLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "success",
    "warnings",
    "hotelStays",
    "roomStays",
    "services",
    "areas",
    "criteria",
    "currencyConversions",
    "rebatePrograms",
    "tpaExtensions",
    "errors"
})
@XmlRootElement(name = "OTA_HotelAvailRS")
public class OTAHotelAvailRS {

    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "HotelStays")
    protected OTAHotelAvailRS.HotelStays hotelStays;
    @XmlElement(name = "RoomStays")
    protected OTAHotelAvailRS.RoomStays roomStays;
    @XmlElement(name = "Services")
    protected ServicesType services;
    @XmlElement(name = "Areas")
    protected AreasType areas;
    @XmlElement(name = "Criteria")
    protected OTAHotelAvailRS.Criteria criteria;
    @XmlElement(name = "CurrencyConversions")
    protected OTAHotelAvailRS.CurrencyConversions currencyConversions;
    @XmlElement(name = "RebatePrograms")
    protected OTAHotelAvailRS.RebatePrograms rebatePrograms;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlAttribute(name = "SearchCacheLevel")
    protected String searchCacheLevel;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "SequenceNmbr")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "TargetName")
    protected String targetName;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "TransactionStatusCode")
    protected String transactionStatusCode;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the hotelStays property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.HotelStays }
     *     
     */
    public OTAHotelAvailRS.HotelStays getHotelStays() {
        return hotelStays;
    }

    /**
     * Sets the value of the hotelStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.HotelStays }
     *     
     */
    public void setHotelStays(OTAHotelAvailRS.HotelStays value) {
        this.hotelStays = value;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.RoomStays }
     *     
     */
    public OTAHotelAvailRS.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.RoomStays }
     *     
     */
    public void setRoomStays(OTAHotelAvailRS.RoomStays value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    public ServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    public void setServices(ServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link AreasType }
     *     
     */
    public AreasType getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreasType }
     *     
     */
    public void setAreas(AreasType value) {
        this.areas = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.Criteria }
     *     
     */
    public OTAHotelAvailRS.Criteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.Criteria }
     *     
     */
    public void setCriteria(OTAHotelAvailRS.Criteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the currencyConversions property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.CurrencyConversions }
     *     
     */
    public OTAHotelAvailRS.CurrencyConversions getCurrencyConversions() {
        return currencyConversions;
    }

    /**
     * Sets the value of the currencyConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.CurrencyConversions }
     *     
     */
    public void setCurrencyConversions(OTAHotelAvailRS.CurrencyConversions value) {
        this.currencyConversions = value;
    }

    /**
     * Gets the value of the rebatePrograms property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS.RebatePrograms }
     *     
     */
    public OTAHotelAvailRS.RebatePrograms getRebatePrograms() {
        return rebatePrograms;
    }

    /**
     * Sets the value of the rebatePrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS.RebatePrograms }
     *     
     */
    public void setRebatePrograms(OTAHotelAvailRS.RebatePrograms value) {
        this.rebatePrograms = value;
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
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the searchCacheLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCacheLevel() {
        return searchCacheLevel;
    }

    /**
     * Sets the value of the searchCacheLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCacheLevel(String value) {
        this.searchCacheLevel = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the targetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * Sets the value of the targetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
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
     *         &lt;element name="Criterion" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType" maxOccurs="unbounded"/>
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
        "criterion"
    })
    public static class Criteria {

        @XmlElement(name = "Criterion", required = true)
        protected List<HotelSearchCriterionType> criterion;

        /**
         * Gets the value of the criterion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criterion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriterion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelSearchCriterionType }
         * 
         * 
         */
        public List<HotelSearchCriterionType> getCriterion() {
            if (criterion == null) {
                criterion = new ArrayList<HotelSearchCriterionType>();
            }
            return this.criterion;
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
     *         &lt;element name="CurrencyConversion" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="RateConversion" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "currencyConversion"
    })
    public static class CurrencyConversions {

        @XmlElement(name = "CurrencyConversion", required = true)
        protected List<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion> currencyConversion;

        /**
         * Gets the value of the currencyConversion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currencyConversion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrencyConversion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.CurrencyConversions.CurrencyConversion }
         * 
         * 
         */
        public List<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion> getCurrencyConversion() {
            if (currencyConversion == null) {
                currencyConversion = new ArrayList<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion>();
            }
            return this.currencyConversion;
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
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="RateConversion" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CurrencyConversion {

            @XmlAttribute(name = "DecimalPlaces")
            protected BigInteger decimalPlaces;
            @XmlAttribute(name = "RateConversion")
            protected BigDecimal rateConversion;
            @XmlAttribute(name = "RequestedCurrencyCode")
            protected String requestedCurrencyCode;
            @XmlAttribute(name = "Source")
            protected String source;
            @XmlAttribute(name = "SourceCurrencyCode")
            protected String sourceCurrencyCode;

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
             * Gets the value of the rateConversion property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRateConversion() {
                return rateConversion;
            }

            /**
             * Sets the value of the rateConversion property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRateConversion(BigDecimal value) {
                this.rateConversion = value;
            }

            /**
             * Gets the value of the requestedCurrencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestedCurrencyCode() {
                return requestedCurrencyCode;
            }

            /**
             * Sets the value of the requestedCurrencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestedCurrencyCode(String value) {
                this.requestedCurrencyCode = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Gets the value of the sourceCurrencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceCurrencyCode() {
                return sourceCurrencyCode;
            }

            /**
             * Sets the value of the sourceCurrencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceCurrencyCode(String value) {
                this.sourceCurrencyCode = value;
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
     *         &lt;element name="HotelStay" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Status" use="required">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/>
     *                   &lt;element name="Price" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RoomStayRPH">
     *                   &lt;simpleType>
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "hotelStay"
    })
    public static class HotelStays {

        @XmlElement(name = "HotelStay", required = true)
        protected List<OTAHotelAvailRS.HotelStays.HotelStay> hotelStay;

        /**
         * Gets the value of the hotelStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.HotelStays.HotelStay }
         * 
         * 
         */
        public List<OTAHotelAvailRS.HotelStays.HotelStay> getHotelStay() {
            if (hotelStay == null) {
                hotelStay = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay>();
            }
            return this.hotelStay;
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
         *         &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                           &lt;/sequence>
         *                           &lt;attribute name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Status" use="required">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/>
         *         &lt;element name="Price" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RoomStayRPH">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "availability",
            "basicPropertyInfo",
            "price",
            "tpaExtensions"
        })
        public static class HotelStay {

            @XmlElement(name = "Availability")
            protected List<OTAHotelAvailRS.HotelStays.HotelStay.Availability> availability;
            @XmlElement(name = "BasicPropertyInfo")
            protected BasicPropertyInfoType basicPropertyInfo;
            @XmlElement(name = "Price")
            protected List<OTAHotelAvailRS.HotelStays.HotelStay.Price> price;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "RoomStayRPH")
            protected List<String> roomStayRPH;

            /**
             * Gets the value of the availability property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the availability property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAvailability().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelAvailRS.HotelStays.HotelStay.Availability }
             * 
             * 
             */
            public List<OTAHotelAvailRS.HotelStays.HotelStay.Availability> getAvailability() {
                if (availability == null) {
                    availability = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Availability>();
                }
                return this.availability;
            }

            /**
             * Gets the value of the basicPropertyInfo property.
             * 
             * @return
             *     possible object is
             *     {@link BasicPropertyInfoType }
             *     
             */
            public BasicPropertyInfoType getBasicPropertyInfo() {
                return basicPropertyInfo;
            }

            /**
             * Sets the value of the basicPropertyInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link BasicPropertyInfoType }
             *     
             */
            public void setBasicPropertyInfo(BasicPropertyInfoType value) {
                this.basicPropertyInfo = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the price property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelAvailRS.HotelStays.HotelStay.Price }
             * 
             * 
             */
            public List<OTAHotelAvailRS.HotelStays.HotelStay.Price> getPrice() {
                if (price == null) {
                    price = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Price>();
                }
                return this.price;
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
             * Gets the value of the roomStayRPH property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomStayRPH property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomStayRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRoomStayRPH() {
                if (roomStayRPH == null) {
                    roomStayRPH = new ArrayList<String>();
                }
                return this.roomStayRPH;
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
             *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                 &lt;/sequence>
             *                 &lt;attribute name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Status" use="required">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
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
            @XmlType(name = "", propOrder = {
                "restriction"
            })
            public static class Availability {

                @XmlElement(name = "Restriction")
                protected List<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction> restriction;
                @XmlAttribute(name = "Status", required = true)
                protected List<String> status;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "Start")
                protected String start;

                /**
                 * Gets the value of the restriction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the restriction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRestriction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction> getRestriction() {
                    if (restriction == null) {
                        restriction = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction>();
                    }
                    return this.restriction;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the status property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStatus().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getStatus() {
                    if (status == null) {
                        status = new ArrayList<String>();
                    }
                    return this.status;
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
                 *       &lt;/sequence>
                 *       &lt;attribute name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Restriction {

                    @XmlAttribute(name = "RestrictionType")
                    protected String restrictionType;
                    @XmlAttribute(name = "Time")
                    protected BigInteger time;
                    @XmlAttribute(name = "TimeUnit")
                    protected TimeUnitType timeUnit;

                    /**
                     * Gets the value of the restrictionType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRestrictionType() {
                        return restrictionType;
                    }

                    /**
                     * Sets the value of the restrictionType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRestrictionType(String value) {
                        this.restrictionType = value;
                    }

                    /**
                     * Gets the value of the time property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTime() {
                        return time;
                    }

                    /**
                     * Sets the value of the time property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTime(BigInteger value) {
                        this.time = value;
                    }

                    /**
                     * Gets the value of the timeUnit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeUnitType }
                     *     
                     */
                    public TimeUnitType getTimeUnit() {
                        return timeUnit;
                    }

                    /**
                     * Sets the value of the timeUnit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeUnitType }
                     *     
                     */
                    public void setTimeUnit(TimeUnitType value) {
                        this.timeUnit = value;
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
             *       &lt;/sequence>
             *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            @XmlType(name = "")
            public static class Price {

                @XmlAttribute(name = "AmountAfterTax")
                protected BigDecimal amountAfterTax;
                @XmlAttribute(name = "AmountBeforeTax")
                protected BigDecimal amountBeforeTax;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Decimal")
                protected BigInteger decimal;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "Start")
                protected String start;

                /**
                 * Gets the value of the amountAfterTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountAfterTax() {
                    return amountAfterTax;
                }

                /**
                 * Sets the value of the amountAfterTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmountAfterTax(BigDecimal value) {
                    this.amountAfterTax = value;
                }

                /**
                 * Gets the value of the amountBeforeTax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountBeforeTax() {
                    return amountBeforeTax;
                }

                /**
                 * Sets the value of the amountBeforeTax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmountBeforeTax(BigDecimal value) {
                    this.amountBeforeTax = value;
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
                 * Gets the value of the decimal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimal() {
                    return decimal;
                }

                /**
                 * Sets the value of the decimal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimal(BigInteger value) {
                    this.decimal = value;
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
     *         &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded"/>
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
        "rebateProgram"
    })
    public static class RebatePrograms {

        @XmlElement(name = "RebateProgram", required = true)
        protected List<RebateType> rebateProgram;

        /**
         * Gets the value of the rebateProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rebateProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRebateProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RebateType }
         * 
         * 
         */
        public List<RebateType> getRebateProgram() {
            if (rebateProgram == null) {
                rebateProgram = new ArrayList<RebateType>();
            }
            return this.rebateProgram;
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
     *         &lt;element name="RoomStay" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *                 &lt;sequence>
     *                   &lt;element name="Reference" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}rateIndicatorType" />
     *                 &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay", required = true)
        protected List<OTAHotelAvailRS.RoomStays.RoomStay> roomStay;
        @XmlAttribute(name = "MoreIndicator")
        protected String moreIndicator;
        @XmlAttribute(name = "SortOrder")
        protected BigInteger sortOrder;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.RoomStays.RoomStay }
         * 
         * 
         */
        public List<OTAHotelAvailRS.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<OTAHotelAvailRS.RoomStays.RoomStay>();
            }
            return this.roomStay;
        }

        /**
         * Gets the value of the moreIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreIndicator() {
            return moreIndicator;
        }

        /**
         * Sets the value of the moreIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreIndicator(String value) {
            this.moreIndicator = value;
        }

        /**
         * Gets the value of the sortOrder property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSortOrder() {
            return sortOrder;
        }

        /**
         * Sets the value of the sortOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSortOrder(BigInteger value) {
            this.sortOrder = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
         *       &lt;sequence>
         *         &lt;element name="Reference" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}rateIndicatorType" />
         *       &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reference",
            "serviceRPHs"
        })
        public static class RoomStay
            extends RoomStayType
        {

            @XmlElement(name = "Reference")
            protected OTAHotelAvailRS.RoomStays.RoomStay.Reference reference;
            @XmlElement(name = "ServiceRPHs")
            protected ServiceRPHsType serviceRPHs;
            @XmlAttribute(name = "AvailabilityStatus")
            protected RateIndicatorType availabilityStatus;
            @XmlAttribute(name = "AvailableIndicator")
            protected Boolean availableIndicator;
            @XmlAttribute(name = "InfoSource")
            protected String infoSource;
            @XmlAttribute(name = "IsAlternate")
            protected Boolean isAlternate;
            @XmlAttribute(name = "MoreDataEchoToken")
            protected String moreDataEchoToken;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "RoomStayCandidateRPH")
            protected String roomStayCandidateRPH;
            @XmlAttribute(name = "ResponseType")
            protected String responseType;

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.Reference }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.Reference getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.Reference }
             *     
             */
            public void setReference(OTAHotelAvailRS.RoomStays.RoomStay.Reference value) {
                this.reference = value;
            }

            /**
             * Gets the value of the serviceRPHs property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceRPHsType }
             *     
             */
            public ServiceRPHsType getServiceRPHs() {
                return serviceRPHs;
            }

            /**
             * Sets the value of the serviceRPHs property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceRPHsType }
             *     
             */
            public void setServiceRPHs(ServiceRPHsType value) {
                this.serviceRPHs = value;
            }

            /**
             * Gets the value of the availabilityStatus property.
             * 
             * @return
             *     possible object is
             *     {@link RateIndicatorType }
             *     
             */
            public RateIndicatorType getAvailabilityStatus() {
                return availabilityStatus;
            }

            /**
             * Sets the value of the availabilityStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link RateIndicatorType }
             *     
             */
            public void setAvailabilityStatus(RateIndicatorType value) {
                this.availabilityStatus = value;
            }

            /**
             * Gets the value of the availableIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailableIndicator() {
                return availableIndicator;
            }

            /**
             * Sets the value of the availableIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailableIndicator(Boolean value) {
                this.availableIndicator = value;
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
             * Gets the value of the isAlternate property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsAlternate() {
                return isAlternate;
            }

            /**
             * Sets the value of the isAlternate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsAlternate(Boolean value) {
                this.isAlternate = value;
            }

            /**
             * Gets the value of the moreDataEchoToken property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoreDataEchoToken() {
                return moreDataEchoToken;
            }

            /**
             * Sets the value of the moreDataEchoToken property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoreDataEchoToken(String value) {
                this.moreDataEchoToken = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the roomStayCandidateRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomStayCandidateRPH() {
                return roomStayCandidateRPH;
            }

            /**
             * Sets the value of the roomStayCandidateRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomStayCandidateRPH(String value) {
                this.roomStayCandidateRPH = value;
            }

            /**
             * Gets the value of the responseType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponseType() {
                return responseType;
            }

            /**
             * Sets the value of the responseType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponseType(String value) {
                this.responseType = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Reference
                extends UniqueIDType
            {

                @XmlAttribute(name = "DateTime")
                @XmlSchemaType(name = "anySimpleType")
                protected String dateTime;

                /**
                 * Gets the value of the dateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateTime() {
                    return dateTime;
                }

                /**
                 * Sets the value of the dateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateTime(String value) {
                    this.dateTime = value;
                }

            }

        }

    }

}
