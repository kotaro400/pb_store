package com.example.pb_store.repository.mybatis;

import com.example.pb_store.domain.Species;
import java.util.List;

public interface SpeciesMapper {
    List<Species> find(String name);
}
