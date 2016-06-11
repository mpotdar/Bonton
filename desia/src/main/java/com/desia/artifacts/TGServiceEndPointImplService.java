
package com.desia.artifacts;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TGServiceEndPointImplService", targetNamespace = "http://endpoints.services.travelguru.com/", wsdlLocation = "http://stage-api.travelguru.com/services-2.0/tg-services/TGServiceEndPoint?wsdl")
public class TGServiceEndPointImplService
    extends Service
{

    private final static URL TGSERVICEENDPOINTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TGSERVICEENDPOINTIMPLSERVICE_EXCEPTION;
    private final static QName TGSERVICEENDPOINTIMPLSERVICE_QNAME = new QName("http://endpoints.services.travelguru.com/", "TGServiceEndPointImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://stage-api.travelguru.com/services-2.0/tg-services/TGServiceEndPoint?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TGSERVICEENDPOINTIMPLSERVICE_WSDL_LOCATION = url;
        TGSERVICEENDPOINTIMPLSERVICE_EXCEPTION = e;
    }

    public TGServiceEndPointImplService() {
        super(__getWsdlLocation(), TGSERVICEENDPOINTIMPLSERVICE_QNAME);
    }

    public TGServiceEndPointImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TGSERVICEENDPOINTIMPLSERVICE_QNAME, features);
    }

    public TGServiceEndPointImplService(URL wsdlLocation) {
        super(wsdlLocation, TGSERVICEENDPOINTIMPLSERVICE_QNAME);
    }

    public TGServiceEndPointImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TGSERVICEENDPOINTIMPLSERVICE_QNAME, features);
    }

    public TGServiceEndPointImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TGServiceEndPointImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TGServiceEndPoint
     */
    @WebEndpoint(name = "TGServiceEndPointImplPort")
    public TGServiceEndPoint getTGServiceEndPointImplPort() {
        return super.getPort(new QName("http://endpoints.services.travelguru.com/", "TGServiceEndPointImplPort"), TGServiceEndPoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TGServiceEndPoint
     */
    @WebEndpoint(name = "TGServiceEndPointImplPort")
    public TGServiceEndPoint getTGServiceEndPointImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoints.services.travelguru.com/", "TGServiceEndPointImplPort"), TGServiceEndPoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TGSERVICEENDPOINTIMPLSERVICE_EXCEPTION!= null) {
            throw TGSERVICEENDPOINTIMPLSERVICE_EXCEPTION;
        }
        return TGSERVICEENDPOINTIMPLSERVICE_WSDL_LOCATION;
    }

}
