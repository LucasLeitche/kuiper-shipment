package com.kuiper.shipment.dto.shipmentRequestStatus;

import java.util.List;

import com.kuiper.shipment.dto.shipmentTrancking.TrackingDTO;

public class ShipmentRequestStatusDTO {
    Long customerId;

    List<Request> requests;

    public static class Request {
        int externalId;
        String courierCode;
        String courierName;
        String requestDate;
        String requestStatus; 

        // requestStatusMessge
        String requestStatusMessage;

        List<TrackingDTO> tracking;


        public String getCourierCode() {
            return courierCode;
        }   

        public String getCourierName() {
            return courierName;
        }

        public int getExternalId() {
            return externalId;
        }

        public String getRequestDate() {
            return requestDate;
        }
        public String getRequestStatus() {
            return requestStatus;
        }
        public String getRequestStatusMessage() {
            return requestStatusMessage;
        }
        public List<TrackingDTO> getTracking() {
            return tracking;
        }
    }
}