package com.devguina.dscommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {

    @Serial
    private static final long serialVersionIUD = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @OneToOne
    @MapsId
    private Order order;

    public Payment() {
    }

    public Payment(UUID id, Instant moment, Order order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }
}
