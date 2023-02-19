package com.example.pb_store.domain;

public class Individual {
    private int id;
    private int speciesId;
    private int teamId;

    public void setId(int id) {
        this.id = id;
    }

    public void setSpeciesId(int speciesId) {
        this.speciesId = speciesId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getId() {
        return id;
    }

    public int getSpeciesId() {
        return speciesId;
    }

    public int getTeamId() {
        return teamId;
    }
}
