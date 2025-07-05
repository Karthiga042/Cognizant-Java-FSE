package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code") // Change to match table
    private String code;

    @Column(name = "co_name") // Change to match table
    private String name;

    // Getters, Setters, toString()

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
