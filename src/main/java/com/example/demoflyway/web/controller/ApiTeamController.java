package com.example.demoflyway.web.controller;

import com.example.demoflyway.web.domain.Book;
import com.example.demoflyway.web.domain.BookRepository;
import com.example.demoflyway.web.domain.Team;
import com.example.demoflyway.web.domain.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by Bloo
 * @Date: 2021/08/04
 */

@Slf4j
@RequiredArgsConstructor
@RestController
public class ApiTeamController {

    private final TeamRepository teamRepository;

    @PostMapping("/api/teams")
    public Team save() {
        Team team = Team.builder()
            .name("Team Name")
            .code(123048)
            .build();
        return teamRepository.save(team);
    }


}
