package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID id;

    private String Title;

    private String Description;

    private boolean IsActive;

    private Timestamp CreatedAt;

    private Timestamp UpdatedAt;

    private boolean IsPaid;

    @OneToMany
    private List<Tag> Tags;

    @OneToMany
    private List<Technology> Technologies;
}
