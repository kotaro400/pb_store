package com.example.pb_store.repository;

import com.example.pb_store.domain.Team;
import java.util.List;

public interface TeamRepository {
    List<Team> getList();
    Team get(Integer id);
    Team insert(Team team);
    Team lock(Integer id);
    Team update(Team team);
    void delete(Integer id);
}