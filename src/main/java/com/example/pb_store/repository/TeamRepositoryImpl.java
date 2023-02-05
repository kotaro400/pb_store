package com.example.pb_store.repository;

import com.example.pb_store.domain.Team;
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
        return this.sqlSessionTemplate.getMapper(TeamMapper.class).get();
    }
}
