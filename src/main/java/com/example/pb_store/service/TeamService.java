package com.example.pb_store.service;

import com.example.pb_store.domain.Team;
import java.util.List;

public interface TeamService {
    List<Team> getList();
    Team get(Integer id);
    Team add(Team team);
    Team update(Team team);
    void delete(Integer id);
}
