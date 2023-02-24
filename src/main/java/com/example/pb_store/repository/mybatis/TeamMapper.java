package com.example.pb_store.repository.mybatis;

import com.example.pb_store.domain.Team;
import java.util.List;

public interface TeamMapper {
    List<Team> getAll();
    Team get(Integer id);
    Integer insert(Team team);
    Team lock(Integer id);
    Integer update(Team team);
    Integer delete(Integer id);
}
