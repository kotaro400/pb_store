package com.example.pb_store.repository.mybatis;

import com.example.pb_store.domain.Team;
import java.util.List;

public interface TeamMapper {
    List<Team> getAll();
    int insert(Team team);
}
