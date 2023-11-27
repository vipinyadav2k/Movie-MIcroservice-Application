package com.ncu.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ncu.theatre.entity.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {

    Theatre findByTheatreId(Long theatreId);

    Theatre findByTheatreNameAndTheatreCity(String theatreName, String theatreCity);

}



