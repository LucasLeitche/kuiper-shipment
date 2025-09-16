package com.kuiper.shipment.dto.shipmentTrancking.response;

import java.util.List;

import com.kuiper.shipment.dto.shipmentTrancking.TrackingDTO;

class ShipmentTrackingResponseDTO {
    int customerId;
    List<Request> requests;

    static class Request{
        int externalId;
        String courierCode;
        String courierName;
        String requestDate;
        String requestStatus;
        String requestStatusMessage;
        TrackingDTO tracking;
    }
};