package com.example.pb_store.domain;

import com.example.pb_store.validation.UniqueSpecies;
import java.util.List;
import org.hibernate.validator.constraints.Length;

public class Team {
    private Integer id;
    @Length(max = 50)
    private String name;
    @UniqueSpecies
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
