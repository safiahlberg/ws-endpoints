package com.wixia.endpoints;

import com.wixia.wsendpoints.schema.message_defs1.GetEchoRequest;
import com.wixia.wsendpoints.schema.message_defs1.GetEchoResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ServiceOneEndpoint {

    public static final String NAMESPACE_URI = "http://www.wixia.com/wsendpoints/schema/message-defs1";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetEchoRequest")
    @ResponsePayload
    public GetEchoResponse getEcho(@RequestPayload GetEchoRequest request) {
        GetEchoResponse getEchoResponse = new GetEchoResponse();
        getEchoResponse.setResponseMessage(request.getMessage());

        return getEchoResponse;
    }

}
