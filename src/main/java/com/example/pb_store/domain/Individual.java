package com.example.pb_store.domain;

public class Individual {
    private int id;
    private int species_id;
    private int team_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getId() {
        return id;
    }

    public int getSpecies_id() {
        return species_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public Individual(int id, int species_id, int team_id){
        this.id = id;
        this.species_id = species_id;
        this.team_id = team_id;
    }
}
