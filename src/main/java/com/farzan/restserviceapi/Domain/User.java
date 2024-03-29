package com.farzan.restserviceapi.Domain;

import javax.persistence.*;

@Entity
public class User
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id=1;
    private String name;
    private String family;
    @Id
    private String passNumber;

    @Enumerated(EnumType.STRING)
    private Country country;

    public User()
    {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", passNumber='" + passNumber + '\'' +
                ", country=" + country +
                '}';
    }

    public User(String passNumber)
    {
        this.passNumber = passNumber;
    }

    public User(Integer id, String name, String family, String passNumber, Country country) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.passNumber = passNumber;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
