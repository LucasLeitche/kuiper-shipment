package com.kuiper.shipment.dto.shipmentRequestStatus;

import java.util.List;

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

        List<Tracking> tracking;

        public static class Tracking {
            String supplyShipmentNumber;
            Long trackingId;
            Integer estimatedDeliveryDay;
            String destinationBranch;
            String finalKeepDate;

            List<Item> item;
            List<Status> status;

            public static class Item {
                Long id;
                String description;
                
                // Quantity
                int quantity;
                String supplyItem;
            }

            public static class Status {
                String statusDate;
                StatusDetail status;
                StatusDetail subStatus;
                StatusDetail reason;
                boolean cancellable;

                public static class StatusDetail {
                    String code;
                    String description;
                }
            }
        }

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
        public List<Tracking> getTracking() {
            return tracking;
        }
    }
}