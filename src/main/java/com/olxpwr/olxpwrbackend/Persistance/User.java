package com.olxpwr.olxpwrbackend.Persistance;

import com.olxpwr.olxpwrbackend.Enums.UserStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String Name;

    @Column(name = "email")
    private String Email;

    @Column(name = "password")
    private String Password;

    @Column(name = "contact_number")
    private String ContactNumber;

    @Column(name = "github_link")
    private String GithubLink;

    @Column(name = "linkedin_link")
    private String LinkedInLink;

    @Column(name = "is_active")
    private Boolean IsActive;

    @Enumerated(EnumType.STRING)
    private UserStatus StudentStatus;

    @Column(name = "Profile_picture")
    private byte[] ProfilePicture;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user")
    private Set<JobOffer> JobOffers = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user")
    private Role Role;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user")
    private Set<Technology> Technologies = new HashSet<>();
}
