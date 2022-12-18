package com.wixia.endpoints;

import com.wixia.wsendpoints.schema.message_defs1.GetEcho;
import com.wixia.wsendpoints.schema.message_defs1.GetEchoResponse;
import com.wixia.wsendpoints.schema.message_defs2.GetTheMessage;
import com.wixia.wsendpoints.schema.message_defs2.GetTheMessageResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ServiceTwoEndpoint {

    public static final String NAMESPACE_URI = "http://www.wixia.com/wsendpoints/schema/message-defs2";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTheMessage")
    @ResponsePayload
    public GetTheMessageResponse getEcho(@RequestPayload GetTheMessage request) {
        GetTheMessageResponse response = new GetTheMessageResponse();
        response.setResponseMessage(request.getMessage());

        return response;
    }

}
