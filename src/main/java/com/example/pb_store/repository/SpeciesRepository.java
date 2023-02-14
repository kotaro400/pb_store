package com.example.pb_store.repository;

import com.example.pb_store.domain.Species;
import java.util.List;

public interface SpeciesRepository {
    List<Species> find(String name);
}
