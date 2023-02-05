package com.example.pb_store.controller;

import com.example.pb_store.domain.Team;
import com.example.pb_store.service.TeamService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Team> get() {
        return this.service.get();
    }
}
