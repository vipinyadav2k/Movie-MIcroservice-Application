package com.ncu.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.theatre.entity.Screening;
import com.ncu.theatre.repository.ScreeningRepository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    @Autowired
    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public List<Screening> getScreeningsByDate(Date screeningDate) {
        return screeningRepository.findByScreeningDate(screeningDate);
    }

    public Screening getScreeningByDetails(String movieName, long theatreId, Date screeningDate, Time screeningTime) {
        return screeningRepository.findByMovieNameAndTheatreIdAndScreeningDateAndScreeningTime(
                movieName, theatreId, screeningDate, screeningTime
        );
    }

}


