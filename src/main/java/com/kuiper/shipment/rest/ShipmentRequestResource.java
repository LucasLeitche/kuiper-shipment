package com.kuiper.shipment.rest;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import com.kuiper.shipment.dto.shipmentRequestStatus.ShipmentRequestStatusDTO;
import com.kuiper.shipment.dto.shipmentRequestStatus.response.RequestMetadataDTO;

import com.kuiper.shipment.dto.shipmentRequestStatus.response.ResponseMetadataDTO;
import com.kuiper.shipment.dto.shipmentRequestStatus.response.SenderDTO;
import com.kuiper.shipment.dto.shipmentRequestStatus.response.ShipmentRequestStatusResponseDTO;
import com.kuiper.shipment.service.ShipmentService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/api/shipment")
public class ShipmentRequestResource {
    @Inject
    ShipmentService shipmentService;

    @POST
    @Path("/request-status")
    @Consumes(jakarta.ws.rs.core.MediaType.APPLICATION_JSON)
    @Produces(jakarta.ws.rs.core.MediaType.APPLICATION_JSON)
    @APIResponses({ @APIResponse(responseCode = "200", description = "Dado inserido com sucesso"),
			@APIResponse(responseCode = "400", description = "Requisição inválida"),
			@APIResponse(responseCode = "500", description = "Erro interno ao inserir dados") })
    public Response shipmentRequestStatus (ShipmentRequestStatusDTO request) {

        try {
           // var shipmentMock = shipmentService.getMockResponse(request.getExternalId()); 
            ShipmentRequestStatusResponseDTO shipmentRequestStatusResponseDTO = new ShipmentRequestStatusResponseDTO();
            ResponseMetadataDTO responseMetadataDTO = new ResponseMetadataDTO();
            RequestMetadataDTO requestMetadataDTO = new RequestMetadataDTO();
            
            SenderDTO sender = new SenderDTO();
            
            requestMetadataDTO.setSender(sender);
            requestMetadataDTO.setSystemID("CORIER");
            requestMetadataDTO.setRequestID("123");

            responseMetadataDTO.setRequestMetadata(requestMetadataDTO);
            responseMetadataDTO.setReturnCode("0");
            responseMetadataDTO.setReturnMessage("Err code");

            sender.country = "CO";

            shipmentRequestStatusResponseDTO.setResponseMetadata(responseMetadataDTO);
        
            return Response.ok(shipmentRequestStatusResponseDTO).build();
        } catch (Exception e) {
           
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
            .entity("Erro: " + e.getMessage())
            .build();
        }

        
    }

}
