package com.kuiper.shipment.dto.shipmentTrancking;

import java.util.List;

public class TrackingDTO {
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