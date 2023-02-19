package com.example.pb_store.controller;

import com.example.pb_store.domain.Team;
import com.example.pb_store.service.TeamService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/team")
public class TeamRestController {
    private final TeamService service;

    public TeamRestController(TeamService service) {
        this.service = service;
    }

    @GetMapping(path = "", produces = "application/json")
    public List<Team> getList() {
        return this.service.getList();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Team get(@PathVariable int id){
        return this.service.get(id);
    }

    @PostMapping(path = "", produces = "application/json")
    public Team add(@RequestBody Team team){
        return this.service.add(team);
    }
}
