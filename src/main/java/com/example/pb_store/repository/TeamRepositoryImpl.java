package com.example.pb_store.repository;

import com.example.pb_store.domain.Individual;
import com.example.pb_store.domain.Team;
import com.example.pb_store.repository.mybatis.IndividualMapper;
import com.example.pb_store.repository.mybatis.TeamMapper;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.mybatis.spring.SqlSessionTemplate;

@Repository
public class TeamRepositoryImpl implements TeamRepository {
    private final SqlSessionTemplate sqlSessionTemplate;

    public TeamRepositoryImpl(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Team> getList(){
        return this.sqlSessionTemplate.getMapper(TeamMapper.class).getAll();
    }

    @Override
    public Team get(Integer id) {
        Team team = this.sqlSessionTemplate.getMapper(TeamMapper.class).get(id);
        if (team == null) {
            throw new RuntimeException("not found");
        }
        return team;
    }

    @Override
    public Team insert(Team team) {
        this.sqlSessionTemplate.getMapper(TeamMapper.class).insert(team);
        team.getIndividuals().stream().forEach(individual -> individual.setTeamId(team.getId()));
        this.sqlSessionTemplate.getMapper(IndividualMapper.class).bulkInsert(team.getIndividuals());
        return team;
    }

    @Override
    public Team lock(Integer id) {
        Team team = this.sqlSessionTemplate.getMapper(TeamMapper.class).lock(id);
        if (team == null) {
            throw new RuntimeException("not found");
        }
        return team;
    }

    @Override
    public Team update(Team team) {
        this.sqlSessionTemplate.getMapper(TeamMapper.class).update(team);
        for (Individual individual: team.getIndividuals()) {
            this.sqlSessionTemplate.getMapper(IndividualMapper.class).update(individual);
        }
        return team;
    }

    @Override
    public void delete(Integer id) {
        this.sqlSessionTemplate.getMapper(TeamMapper.class).delete(id);
    }
}
