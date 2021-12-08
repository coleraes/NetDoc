package com.NetDoc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, surname, number, email;

    public Long getId() { return id;}

    public void setId(Long id) { this.id = id;}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public ProfileInfo() {}

    public ProfileInfo(String name, String surname, String number, String email) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
    }
}
