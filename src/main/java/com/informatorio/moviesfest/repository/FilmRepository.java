package com.informatorio.moviesfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.moviesfest.domain.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
    
}
