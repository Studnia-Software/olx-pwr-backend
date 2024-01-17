package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String Name;

    @Column(name = "description")
    private String Description;

    @OneToOne
    @JoinColumn(name = "project_id")
    private Coordinator coordinator;

    @OneToMany
    @JoinColumn(name = "project_id")
    private Set<JobOffer> JobOffers = new HashSet<>();
}
