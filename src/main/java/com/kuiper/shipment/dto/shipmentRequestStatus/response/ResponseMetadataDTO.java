package com.kuiper.shipment.dto.shipmentRequestStatus.response;

public class ResponseMetadataDTO {
    public RequestMetadataDTO requestMetadata;
    public String returnCode;
    public String returnMessage;

    public void setRequestMetadata(RequestMetadataDTO requestMetadata) {
        this.requestMetadata = requestMetadata;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
