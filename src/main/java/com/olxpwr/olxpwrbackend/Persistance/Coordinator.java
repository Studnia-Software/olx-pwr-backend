package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "coordinators")
public class Coordinator {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    @OneToOne
    @JoinColumn(name = "fk_coordinator")
    private User User;
}
