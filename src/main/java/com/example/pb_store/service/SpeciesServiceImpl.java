package com.example.pb_store.service;

import com.example.pb_store.domain.Species;
import com.example.pb_store.repository.SpeciesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeciesServiceImpl implements SpeciesService{
    @Autowired
    private final SpeciesRepository repository;

    public SpeciesServiceImpl(SpeciesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Species> find(String name) {
        return this.repository.find(name);
    }
}
