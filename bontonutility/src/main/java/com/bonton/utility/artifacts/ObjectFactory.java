//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.12 at 02:04:31 PM IST 
//


package com.bonton.utility.artifacts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bonton.utility.artifacts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomRoomDescription_QNAME = new QName("", "RoomDescription");
    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomSupplier_QNAME = new QName("", "Supplier");
    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomFinalPrice_QNAME = new QName("", "FinalPrice");
    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomRateKey_QNAME = new QName("", "RateKey");
    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomPackaging_QNAME = new QName("", "packaging");
    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomCancellationPolicies_QNAME = new QName("", "CancellationPolicies");
    private final static QName _BTNSearchResponseHotelOptionsHotelRoomOptionsRoomRemarks_QNAME = new QName("", "Remarks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bonton.utility.artifacts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BTNSearchRequest }
     * 
     */
    public BTNSearchRequest createBTNSearchRequest() {
        return new BTNSearchRequest();
    }

    /**
     * Create an instance of {@link BTNSearchResponse }
     * 
     */
    public BTNSearchResponse createBTNSearchResponse() {
        return new BTNSearchResponse();
    }

    /**
     * Create an instance of {@link BTNRepriceRequest }
     * 
     */
    public BTNRepriceRequest createBTNRepriceRequest() {
        return new BTNRepriceRequest();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse }
     * 
     */
    public BTNRepriceResponse createBTNRepriceResponse() {
        return new BTNRepriceResponse();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest }
     * 
     */
    public BTNConfirmRequest createBTNConfirmRequest() {
        return new BTNConfirmRequest();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse }
     * 
     */
    public BTNConfirmResponse createBTNConfirmResponse() {
        return new BTNConfirmResponse();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking }
     * 
     */
    public BTNConfirmResponse.Booking createBTNConfirmResponseBooking() {
        return new BTNConfirmResponse.Booking();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel createBTNConfirmResponseBookingHotel() {
        return new BTNConfirmResponse.Booking.Hotel();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms createBTNConfirmResponseBookingHotelRooms() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room createBTNConfirmResponseBookingHotelRoomsRoom() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates createBTNConfirmResponseBookingHotelRoomsRoomRates() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate createBTNConfirmResponseBookingHotelRoomsRoomRatesRate() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies createBTNConfirmResponseBookingHotelRoomsRoomRatesRateCancellationPolicies() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room.Paxes }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room.Paxes createBTNConfirmResponseBookingHotelRoomsRoomPaxes() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room.Paxes();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest.Rooms }
     * 
     */
    public BTNConfirmRequest.Rooms createBTNConfirmRequestRooms() {
        return new BTNConfirmRequest.Rooms();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest.Rooms.Room }
     * 
     */
    public BTNConfirmRequest.Rooms.Room createBTNConfirmRequestRoomsRoom() {
        return new BTNConfirmRequest.Rooms.Room();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest.Rooms.Room.Paxes }
     * 
     */
    public BTNConfirmRequest.Rooms.Room.Paxes createBTNConfirmRequestRoomsRoomPaxes() {
        return new BTNConfirmRequest.Rooms.Room.Paxes();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel }
     * 
     */
    public BTNRepriceResponse.Hotel createBTNRepriceResponseHotel() {
        return new BTNRepriceResponse.Hotel();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.CreditCards }
     * 
     */
    public BTNRepriceResponse.Hotel.CreditCards createBTNRepriceResponseHotelCreditCards() {
        return new BTNRepriceResponse.Hotel.CreditCards();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.Rooms }
     * 
     */
    public BTNRepriceResponse.Hotel.Rooms createBTNRepriceResponseHotelRooms() {
        return new BTNRepriceResponse.Hotel.Rooms();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.Rooms.Room }
     * 
     */
    public BTNRepriceResponse.Hotel.Rooms.Room createBTNRepriceResponseHotelRoomsRoom() {
        return new BTNRepriceResponse.Hotel.Rooms.Room();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.Rooms.Room.Rates }
     * 
     */
    public BTNRepriceResponse.Hotel.Rooms.Room.Rates createBTNRepriceResponseHotelRoomsRoomRates() {
        return new BTNRepriceResponse.Hotel.Rooms.Room.Rates();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate }
     * 
     */
    public BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate createBTNRepriceResponseHotelRoomsRoomRatesRate() {
        return new BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies }
     * 
     */
    public BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies createBTNRepriceResponseHotelRoomsRoomRatesRateCancellationPolicies() {
        return new BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies();
    }

    /**
     * Create an instance of {@link BTNRepriceRequest.Rooms }
     * 
     */
    public BTNRepriceRequest.Rooms createBTNRepriceRequestRooms() {
        return new BTNRepriceRequest.Rooms();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions }
     * 
     */
    public BTNSearchResponse.HotelOptions createBTNSearchResponseHotelOptions() {
        return new BTNSearchResponse.HotelOptions();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions.Hotel }
     * 
     */
    public BTNSearchResponse.HotelOptions.Hotel createBTNSearchResponseHotelOptionsHotel() {
        return new BTNSearchResponse.HotelOptions.Hotel();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions.Hotel.RoomOptions }
     * 
     */
    public BTNSearchResponse.HotelOptions.Hotel.RoomOptions createBTNSearchResponseHotelOptionsHotelRoomOptions() {
        return new BTNSearchResponse.HotelOptions.Hotel.RoomOptions();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room }
     * 
     */
    public BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room createBTNSearchResponseHotelOptionsHotelRoomOptionsRoom() {
        return new BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.RequestDetails }
     * 
     */
    public BTNSearchRequest.RequestDetails createBTNSearchRequestRequestDetails() {
        return new BTNSearchRequest.RequestDetails();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.RequestDetails.SearchHotelPriceRequest }
     * 
     */
    public BTNSearchRequest.RequestDetails.SearchHotelPriceRequest createBTNSearchRequestRequestDetailsSearchHotelPriceRequest() {
        return new BTNSearchRequest.RequestDetails.SearchHotelPriceRequest();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.Rooms }
     * 
     */
    public BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.Rooms createBTNSearchRequestRequestDetailsSearchHotelPriceRequestRooms() {
        return new BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.Rooms();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.Source }
     * 
     */
    public BTNSearchRequest.Source createBTNSearchRequestSource() {
        return new BTNSearchRequest.Source();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.City }
     * 
     */
    public BTNSearchResponse.City createBTNSearchResponseCity() {
        return new BTNSearchResponse.City();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest.PrinciplePax }
     * 
     */
    public BTNConfirmRequest.PrinciplePax createBTNConfirmRequestPrinciplePax() {
        return new BTNConfirmRequest.PrinciplePax();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest.ContactData }
     * 
     */
    public BTNConfirmRequest.ContactData createBTNConfirmRequestContactData() {
        return new BTNConfirmRequest.ContactData();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.ModificationPolicies }
     * 
     */
    public BTNConfirmResponse.Booking.ModificationPolicies createBTNConfirmResponseBookingModificationPolicies() {
        return new BTNConfirmResponse.Booking.ModificationPolicies();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.PrinciplePax }
     * 
     */
    public BTNConfirmResponse.Booking.PrinciplePax createBTNConfirmResponseBookingPrinciplePax() {
        return new BTNConfirmResponse.Booking.PrinciplePax();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Supplierdetails }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Supplierdetails createBTNConfirmResponseBookingHotelSupplierdetails() {
        return new BTNConfirmResponse.Booking.Hotel.Supplierdetails();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies.CancellationPolicy }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies.CancellationPolicy createBTNConfirmResponseBookingHotelRoomsRoomRatesRateCancellationPoliciesCancellationPolicy() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies.CancellationPolicy();
    }

    /**
     * Create an instance of {@link BTNConfirmResponse.Booking.Hotel.Rooms.Room.Paxes.Pax }
     * 
     */
    public BTNConfirmResponse.Booking.Hotel.Rooms.Room.Paxes.Pax createBTNConfirmResponseBookingHotelRoomsRoomPaxesPax() {
        return new BTNConfirmResponse.Booking.Hotel.Rooms.Room.Paxes.Pax();
    }

    /**
     * Create an instance of {@link BTNConfirmRequest.Rooms.Room.Paxes.Pax }
     * 
     */
    public BTNConfirmRequest.Rooms.Room.Paxes.Pax createBTNConfirmRequestRoomsRoomPaxesPax() {
        return new BTNConfirmRequest.Rooms.Room.Paxes.Pax();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.CreditCards.CreditCard }
     * 
     */
    public BTNRepriceResponse.Hotel.CreditCards.CreditCard createBTNRepriceResponseHotelCreditCardsCreditCard() {
        return new BTNRepriceResponse.Hotel.CreditCards.CreditCard();
    }

    /**
     * Create an instance of {@link BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies.CancellationPolicy }
     * 
     */
    public BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies.CancellationPolicy createBTNRepriceResponseHotelRoomsRoomRatesRateCancellationPoliciesCancellationPolicy() {
        return new BTNRepriceResponse.Hotel.Rooms.Room.Rates.Rate.CancellationPolicies.CancellationPolicy();
    }

    /**
     * Create an instance of {@link BTNRepriceRequest.Rooms.Room }
     * 
     */
    public BTNRepriceRequest.Rooms.Room createBTNRepriceRequestRoomsRoom() {
        return new BTNRepriceRequest.Rooms.Room();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions.Hotel.Amenities }
     * 
     */
    public BTNSearchResponse.HotelOptions.Hotel.Amenities createBTNSearchResponseHotelOptionsHotelAmenities() {
        return new BTNSearchResponse.HotelOptions.Hotel.Amenities();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice }
     * 
     */
    public BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomFinalPrice() {
        return new BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice();
    }

    /**
     * Create an instance of {@link BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies }
     * 
     */
    public BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomCancellationPolicies() {
        return new BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.ItemDestination }
     * 
     */
    public BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.ItemDestination createBTNSearchRequestRequestDetailsSearchHotelPriceRequestItemDestination() {
        return new BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.ItemDestination();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.PeriodOfStay }
     * 
     */
    public BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.PeriodOfStay createBTNSearchRequestRequestDetailsSearchHotelPriceRequestPeriodOfStay() {
        return new BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.PeriodOfStay();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.Rooms.Room }
     * 
     */
    public BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.Rooms.Room createBTNSearchRequestRequestDetailsSearchHotelPriceRequestRoomsRoom() {
        return new BTNSearchRequest.RequestDetails.SearchHotelPriceRequest.Rooms.Room();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.Source.RequestorId }
     * 
     */
    public BTNSearchRequest.Source.RequestorId createBTNSearchRequestSourceRequestorId() {
        return new BTNSearchRequest.Source.RequestorId();
    }

    /**
     * Create an instance of {@link BTNSearchRequest.Source.RequestorPreferences }
     * 
     */
    public BTNSearchRequest.Source.RequestorPreferences createBTNSearchRequestSourceRequestorPreferences() {
        return new BTNSearchRequest.Source.RequestorPreferences();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RoomDescription", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<String> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomRoomDescription(String value) {
        return new JAXBElement<String>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomRoomDescription_QNAME, String.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Supplier", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<String> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomSupplier(String value) {
        return new JAXBElement<String>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomSupplier_QNAME, String.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FinalPrice", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomFinalPrice(BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice value) {
        return new JAXBElement<BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomFinalPrice_QNAME, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.FinalPrice.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RateKey", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<String> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomRateKey(String value) {
        return new JAXBElement<String>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomRateKey_QNAME, String.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "packaging", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<String> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomPackaging(String value) {
        return new JAXBElement<String>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomPackaging_QNAME, String.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CancellationPolicies", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomCancellationPolicies(BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies value) {
        return new JAXBElement<BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomCancellationPolicies_QNAME, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.CancellationPolicies.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Remarks", scope = BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class)
    public JAXBElement<String> createBTNSearchResponseHotelOptionsHotelRoomOptionsRoomRemarks(String value) {
        return new JAXBElement<String>(_BTNSearchResponseHotelOptionsHotelRoomOptionsRoomRemarks_QNAME, String.class, BTNSearchResponse.HotelOptions.Hotel.RoomOptions.Room.class, value);
    }

}
