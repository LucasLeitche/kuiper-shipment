
package com.kuiper.shipment.service;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuiper.shipment.dto.shipmentRequestStatus.response.ShipmentRequestStatusResponseDTO;
import com.kuiper.shipment.dto.shipmentTrancking.ShipmentTrackingDTO;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShipmentService {
    public ShipmentRequestStatusResponseDTO findShipmentRequestStatus(Long externalId) {
        String responseJson = getMockResponse(externalId);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(responseJson, ShipmentRequestStatusResponseDTO.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse JSON", e);
        }
    }

    public ShipmentTrackingDTO findTracking(Long customerId){
        try{
            String responseJson = getMockResponse(customerId);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(responseJson, ShipmentTrackingDTO.class);
        } catch(Exception e){
            throw new RuntimeException("Failed to parse JSON", e);
        }
    }

    private String getMockResponse(Long externalId) {
        return "{\n" +
            "  \"shipmentRequestStatusResponse\": {\n" +
            "    \"ResponseMetadata\": {\n" +
            "      \"requestMetadata\": {\n" +
            "        \"sender\": {\n" +
            "          \"country\": \"CO\"\n" +
            "        },\n" +
            "        \"requestID\": \"" + externalId + "\",\n" +
            "        \"systemID\": \"CORIER\"\n" +
            "      },\n" +
            "      \"returnCode\": \"0\",\n" +
            "      \"returnMessage\": \"string\"\n" +
            "    }\n" +
            "  }\n" +
            "}";
    }  
}

// Rodar script no banco de dev

// Ver qual schema kestradev ou overscore