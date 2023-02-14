package com.example.pb_store.controller;

import com.example.pb_store.domain.Species;
import com.example.pb_store.service.SpeciesService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/species")
public class SpeciesRestController {
    private final SpeciesService  service;

    public SpeciesRestController(SpeciesService service) {
        this.service = service;
    }

    @GetMapping(path = "", produces = "application/json")
    public List<Species> find(@RequestParam(name = "name") String name){
        return this.service.find(name);
    }
}
