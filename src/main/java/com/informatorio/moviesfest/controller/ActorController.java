package com.informatorio.moviesfest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.moviesfest.domain.Actor;
import com.informatorio.moviesfest.repository.ActorRepository;

@RestController
public class ActorController {

    private final ActorRepository actorRepository;

    @Autowired
    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @PostMapping("/actor")
    public Actor createActor(@RequestBody Actor actor) {
        return actorRepository.save(actor);
    }
}
