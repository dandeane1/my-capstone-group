package com.example.codeupspringcapstone.models;

import jakarta.persistence.*;

@Entity
@Table(name = "breweries")

public class Brewery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Brewery(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brewery() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}