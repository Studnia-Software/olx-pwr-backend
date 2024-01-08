package com.olxpwr.olxpwrbackend.Persistance;

import com.olxpwr.olxpwrbackend.Enums.UserStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String Name;

    private String Email;

    private String Password;

    private String ContactNumber;

    private String GithubLink;

    private String LinkedInLink;

    private Boolean IsActive;

    private UserStatus StudentStatus;

    @OneToMany(cascade = CascadeType.ALL)
    private List<JobOffer> JobOffers;

    @OneToOne
    private Role Role;
}
