package com.informatorio.moviesfest.coverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.informatorio.moviesfest.domain.Film;
import com.informatorio.moviesfest.dto.FilmDTO;

@Component
public class FilmConverter {

    private ActorConverter actorConverter;
    
    @Autowired
    public FilmConverter(ActorConverter actorConverter) {
        this.actorConverter = actorConverter;
    }

    public FilmDTO toDTO(Film film) {
        return new FilmDTO(
            film.getId(),
            film.getTitle(),
            film.getDescription(),
            actorConverter.toDTO(film.getActors())
        );
    }
}