package com.example.pb_store.service;

import com.example.pb_store.domain.Team;
import com.example.pb_store.repository.TeamRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;

    public TeamServiceImpl(TeamRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Team> get() {
        return this.repository.getList();
    }
}
