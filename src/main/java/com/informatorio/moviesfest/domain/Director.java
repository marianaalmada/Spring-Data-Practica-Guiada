package com.informatorio.moviesfest.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Director {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;

    @CreationTimestamp
    private LocalDate creationDate;

    @OneToOne(mappedBy = "director")
    private Film film;

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Director() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Director [creationDate=" + creationDate + 
            ", film=" + film + 
            ", id=" + id + 
            ", lastName=" + lastName + 
            ", name=" + name + 
            "]";
    }  
}
