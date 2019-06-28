package jh.javabean;

import javax.jws.WebService;
import javax.jws.WebParam;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


@WebService (targetNamespace="http://javabean.jh/", serviceName="RequestServiceTwo", portName="RequestPort", wsdlLocation="WEB-INF/wsdl/RequestService.wsdl")
@BindingType (value=SOAPBinding.SOAP11HTTP_MTOM_BINDING)
public class RequestDelegateTwo{

    jh.javabean.Request _request = null;

    public String getHello () {
        return _request.getHello();
    }

    public void setHello (@WebParam(name="h") String h) {
        _request.setHello(h);
    }

    public RequestDelegateTwo() {
        _request = new jh.javabean.Request(); }

}