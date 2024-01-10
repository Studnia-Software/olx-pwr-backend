package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "job_offers")
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID id;

    @Column(name = "title")
    private String Title;

    @Column(name = "description")
    private String Description;

    @Column(name = "is_active")
    private boolean IsActive;

    @Column(name = "created_at")
    private Timestamp CreatedAt;

    @Column(name = "updated_at")
    private Timestamp UpdatedAt;

    @Column(name = "is_paid")
    private boolean IsPaid;

    @Column(name = "payment")
    private double payment;

    @OneToMany
    @JoinColumn(name = "job_offer_id")
    private Set<Tag> Tags = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "job_offer_id")
    private Set<Technology> Technologies = new HashSet<>();
}
