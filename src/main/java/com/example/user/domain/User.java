package com.example.user.domain;

import javax.persistence.*;

/**
 * Created by momcilodavidovic on 10/16/16.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private Provider provider;
    private String providerId;

    public User() {
    }

    public User(String firstName, String lastName, Provider provider, String providerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.provider = provider;
        this.providerId = providerId;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Provider getProvider() {
        return provider;
    }

    public String getProviderId() {
        return providerId;
    }
}
