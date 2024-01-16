package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "technologies")
@Data
public class Technology
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    @Column(name = "name")
    private String Name;
}
