package com.ncu.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ncu.theatre.entity.Screening;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

    List<Screening> findByScreeningDate(Date screeningDate);

    Screening findByMovieNameAndTheatreIdAndScreeningDateAndScreeningTime(
            String movieName, long theatreId, Date screeningDate, Time screeningTime
    );

}



