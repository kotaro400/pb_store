package com.example.pb_store.domain;

import java.util.List;

public class Team {
    private int id;
    private String name;
    private List<Individual> individuals;

    public Team(int id, String name, List<Individual> individuals){
        this.id = id;
        this.name = name;
        this.individuals = individuals;
    }
}
