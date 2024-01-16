package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tags")
@Data
public class Tag
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    @Column(name = "name")
    private String Name;
}
