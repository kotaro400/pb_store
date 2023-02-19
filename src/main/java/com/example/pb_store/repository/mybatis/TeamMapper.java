package com.example.pb_store.repository.mybatis;

import com.example.pb_store.domain.Team;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    List<Team> getAll();
    Team get(int id);
    int insert(Team team);
}
