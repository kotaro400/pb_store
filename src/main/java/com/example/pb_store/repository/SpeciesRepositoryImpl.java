package com.example.pb_store.repository;

import com.example.pb_store.domain.Species;
import com.example.pb_store.repository.mybatis.SpeciesMapper;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpeciesRepositoryImpl implements SpeciesRepository{
    private final SqlSessionTemplate sqlSessionTemplate;

    public SpeciesRepositoryImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Species> find(String name) {
        return this.sqlSessionTemplate.getMapper(SpeciesMapper.class).find(name);
    }
}
