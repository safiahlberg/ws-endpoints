package com.wixia.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ServiceOneEndpoint {

    private static final String NAMESPACE_URI = "http://www.wixia.com/wsendpoints/serviceone";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEchoRequest")
    @ResponsePayload
    public String getEcho(@RequestPayload String request) {
        return request;
    }

}
