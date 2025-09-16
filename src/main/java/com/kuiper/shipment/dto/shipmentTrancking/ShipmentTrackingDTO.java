package com.kuiper.shipment.dto.shipmentTrancking;

public class ShipmentTrackingDTO {
    ShipmentTracking shipmentTracking;

    public static class ShipmentTracking {
        int requestID;
        int customerId;
        int shipmentNumber;
        int trackingId;
        int shold;
    }

    public ShipmentTracking getShipmentTracking() {
        return shipmentTracking;
    }
}
