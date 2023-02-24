package com.example.pb_store.domain;

import java.util.List;

public class Team {
    private Integer id;
    private String name;
    private List<Individual> individuals;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndividuals(List<Individual> individuals) {
        this.individuals = individuals;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }
}
