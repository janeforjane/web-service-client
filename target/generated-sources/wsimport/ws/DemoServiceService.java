
package ws;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DemoServiceService", targetNamespace = "http://ws/", wsdlLocation = "file:/home/jane/source/wsSoapClient/wsdl/ws.wsdl")
public class DemoServiceService
    extends Service
{

    private final static URL DEMOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException DEMOSERVICESERVICE_EXCEPTION;
    private final static QName DEMOSERVICESERVICE_QNAME = new QName("http://ws/", "DemoServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/jane/source/wsSoapClient/wsdl/ws.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEMOSERVICESERVICE_WSDL_LOCATION = url;
        DEMOSERVICESERVICE_EXCEPTION = e;
    }

    public DemoServiceService() {
        super(__getWsdlLocation(), DEMOSERVICESERVICE_QNAME);
    }

    public DemoServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEMOSERVICESERVICE_QNAME, features);
    }

    public DemoServiceService(URL wsdlLocation) {
        super(wsdlLocation, DEMOSERVICESERVICE_QNAME);
    }

    public DemoServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEMOSERVICESERVICE_QNAME, features);
    }

    public DemoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DemoServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DemoService
     */
    @WebEndpoint(name = "DemoServicePort")
    public DemoService getDemoServicePort() {
        return super.getPort(new QName("http://ws/", "DemoServicePort"), DemoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DemoService
     */
    @WebEndpoint(name = "DemoServicePort")
    public DemoService getDemoServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "DemoServicePort"), DemoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEMOSERVICESERVICE_EXCEPTION!= null) {
            throw DEMOSERVICESERVICE_EXCEPTION;
        }
        return DEMOSERVICESERVICE_WSDL_LOCATION;
    }

}
