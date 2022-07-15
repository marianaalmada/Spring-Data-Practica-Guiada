package com.informatorio.moviesfest.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.moviesfest.domain.Actor;
import com.informatorio.moviesfest.domain.Film;
import com.informatorio.moviesfest.repository.ActorRepository;
import com.informatorio.moviesfest.repository.FilmRepository;

@RestController
public class FilmController {

    private final FilmRepository filmRepository;
    private final ActorRepository actorRepository;
    
    @Autowired
    public FilmController(FilmRepository filmRepository, ActorRepository actorRepository) {
        this.filmRepository = filmRepository;
        this.actorRepository = actorRepository;
    }

    @PostMapping("/film")
    public Film createFilm(@RequestBody Film film) {
        return filmRepository.save(film);
    }

    @PostMapping("/film/{filmId}/actor")
    public Film addActorToMovie(@PathVariable Long filmId, @RequestBody List<Long> ActorsId) {
        Film film = filmRepository.findById(filmId).orElse(null);
        List<Actor> actors = ActorsId.stream()
                .map(id -> actorRepository.findById(id))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList()); 
        actors.forEach(actor -> film.addActor(actor));
        filmRepository.save(film);
        return film;
    }
}
