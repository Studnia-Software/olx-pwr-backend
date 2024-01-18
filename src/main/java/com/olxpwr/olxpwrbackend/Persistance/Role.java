package com.olxpwr.olxpwrbackend.Persistance;

import com.olxpwr.olxpwrbackend.Enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "roles")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private UserRole RoleName;
}
