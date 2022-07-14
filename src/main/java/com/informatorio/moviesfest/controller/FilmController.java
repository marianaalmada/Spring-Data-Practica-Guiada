package com.informatorio.moviesfest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.moviesfest.domain.Film;
import com.informatorio.moviesfest.repository.FilmRepository;

@RestController
public class FilmController {

    private final FilmRepository filmRepository;
    
    @Autowired
    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @PostMapping("/film")
    public Film createFilm(@RequestBody Film film) {
        return filmRepository.save(film);
    }
}
