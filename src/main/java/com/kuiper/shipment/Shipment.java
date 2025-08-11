package com.kuiper.shipment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shipment {
    @Id
    String id;
}
