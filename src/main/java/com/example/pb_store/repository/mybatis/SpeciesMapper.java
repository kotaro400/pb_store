package com.example.pb_store.repository.mybatis;

import com.example.pb_store.domain.Species;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpeciesMapper {
    List<Species> find(String name);
}
