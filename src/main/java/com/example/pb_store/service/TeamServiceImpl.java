package com.example.pb_store.service;

import com.example.pb_store.domain.Team;
import com.example.pb_store.repository.TeamRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;

    public TeamServiceImpl(TeamRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Team> getList() {
        return this.repository.getList();
    }

    @Override
    public Team get(int id) {
        return this.repository.get(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Team add(Team team) {
        return this.repository.insert(team);
    }
}
