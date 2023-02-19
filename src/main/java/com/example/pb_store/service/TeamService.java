package com.example.pb_store.service;

import com.example.pb_store.domain.Team;
import java.util.List;

public interface TeamService {
    List<Team> getList();
    Team get(int id);
    Team add(Team team);
}
