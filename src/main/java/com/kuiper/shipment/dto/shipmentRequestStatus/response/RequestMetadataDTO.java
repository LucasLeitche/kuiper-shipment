package com.kuiper.shipment.dto.shipmentRequestStatus.response;

public class RequestMetadataDTO {
    public SenderDTO sender;
    public String requestID;
    public String systemID;

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public void setSender(SenderDTO sender) {
        this.sender = sender;
    }
}
