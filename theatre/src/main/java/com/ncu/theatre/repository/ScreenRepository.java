package com.ncu.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ncu.theatre.entity.Screen;

import java.util.List;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {

    Screen findByScreenId(long screenId);

    List<Screen> findByTheatreId(long theatreId);

}


