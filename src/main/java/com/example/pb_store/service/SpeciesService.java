package com.example.pb_store.service;

import com.example.pb_store.domain.Species;
import java.util.List;

public interface SpeciesService {
    List<Species> find(String name);
}
