package jh.javabean;

import javax.jws.WebService;


@WebService (targetNamespace="http://javabean.jh/", serviceName="RequestService", portName="RequestPort")
public class RequestDelegate{

    jh.javabean.Request _request = null;

    public String getHello () {
        return _request.getHello();
    }

    public void setHello (String h) {
        _request.setHello(h);
    }

    public RequestDelegate() {
        _request = new jh.javabean.Request(); }

}