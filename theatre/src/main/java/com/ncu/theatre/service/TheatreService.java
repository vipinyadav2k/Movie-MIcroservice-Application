package com.ncu.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.theatre.entity.Theatre;
import com.ncu.theatre.repository.TheatreRepository;

import java.util.List;

@Service
public class TheatreService {

    private final TheatreRepository theatreRepository;

    @Autowired
    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public Theatre getTheatreById(Long theatreId) {
        return theatreRepository.findByTheatreId(theatreId);
    }

    public Theatre getTheatreByNameAndCity(String theatreName, String theatreCity) {
        return theatreRepository.findByTheatreNameAndTheatreCity(theatreName, theatreCity);
    }

}

