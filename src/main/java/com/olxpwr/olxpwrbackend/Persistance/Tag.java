package com.olxpwr.olxpwrbackend.Persistance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Data
public class Tag
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String Name;
}
