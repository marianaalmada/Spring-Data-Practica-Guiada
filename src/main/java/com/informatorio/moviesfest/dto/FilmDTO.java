package com.informatorio.moviesfest.dto;

import java.util.HashSet;
import java.util.Set;

public class FilmDTO {
    
    private Long id;
    private String title;
    private String description;

    private Set<ActorDTO> actors = new HashSet<>();

    public FilmDTO(Long id, String title, String description, Set<ActorDTO> actors) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.actors = actors;
    }

    public FilmDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDTO> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "FilmDTO [actors=" + actors + 
            ", description=" + description + 
            ", id=" + id + 
            ", title=" + title 
            + "]";
    }
}
