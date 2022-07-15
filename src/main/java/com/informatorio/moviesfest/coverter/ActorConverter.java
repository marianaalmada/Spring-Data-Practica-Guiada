package com.informatorio.moviesfest.coverter;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.informatorio.moviesfest.domain.Actor;
import com.informatorio.moviesfest.dto.ActorDTO;

@Component
public class ActorConverter {
    
    public Set<ActorDTO> toDTO(Set<Actor> actors) {
        return actors.stream()
            .map(actor -> toDTO(actor))
            .collect(Collectors.toSet());           
    }

    public ActorDTO toDTO(Actor actor) {
        return new ActorDTO(actor.getId(),
                actor.getName(),
                actor.getLastName());
    }
}