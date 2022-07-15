package com.informatorio.moviesfest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.moviesfest.domain.Director;
import com.informatorio.moviesfest.repository.DirectorRepository;

@RestController
public class DirectorController {

    private DirectorRepository directorRepository;

    @Autowired
    public DirectorController(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @PostMapping("/director")
    public Director createFilm(@RequestBody Director director) {
        return directorRepository.save(director);
    }
}
