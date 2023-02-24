package com.example.pb_store.domain;

public class Individual {
    private Integer id;
    private Integer speciesId;
    private Integer teamId;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSpeciesId(Integer speciesId) {
        this.speciesId = speciesId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public Integer getTeamId() {
        return teamId;
    }
}
