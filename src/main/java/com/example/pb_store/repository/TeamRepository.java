package com.example.pb_store.repository;

import com.example.pb_store.domain.Team;
import java.util.List;

public interface TeamRepository {
    List<Team> getList();
}