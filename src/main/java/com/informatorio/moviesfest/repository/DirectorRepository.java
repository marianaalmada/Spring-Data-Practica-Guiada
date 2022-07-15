package com.informatorio.moviesfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.moviesfest.domain.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
    
}

