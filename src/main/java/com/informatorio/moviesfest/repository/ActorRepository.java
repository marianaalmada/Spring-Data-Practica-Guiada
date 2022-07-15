package com.informatorio.moviesfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.moviesfest.domain.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    
}