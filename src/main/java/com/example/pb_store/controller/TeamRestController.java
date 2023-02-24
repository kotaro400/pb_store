package com.example.pb_store.controller;

import com.example.pb_store.domain.Team;
import com.example.pb_store.service.TeamService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
    public Team get(@PathVariable Integer id){
        return this.service.get(id);
    }

    @PostMapping(path = "", produces = "application/json")
    public Team add(@RequestBody Team team){
        return this.service.add(team);
    }

    @PatchMapping(path = "/{id}", produces = "application/json")
    public Team update(@PathVariable Integer id, @RequestBody Team team){
        team.setId(id);
        return this.service.update(team);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public void delete(@PathVariable Integer id){
        this.service.delete(id);
    }
}
