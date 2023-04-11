package com.farzan.restserviceapi.DataModels;

import com.farzan.restserviceapi.Domain.Country;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Request
{
    private Integer id;
    private String name;
    private String family;
    private String passNumber;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Override
    public String toString()
    {
        return "Request {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", passNumber='" + passNumber + '\'' +
                ", country=" + country +
                '}';
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
