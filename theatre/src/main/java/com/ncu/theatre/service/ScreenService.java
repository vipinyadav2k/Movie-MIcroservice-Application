package com.ncu.theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.theatre.entity.Screen;
import com.ncu.theatre.repository.ScreenRepository;

import java.util.List;

@Service
public class ScreenService {

    private final ScreenRepository screenRepository;

    @Autowired
    public ScreenService(ScreenRepository screenRepository) {
        this.screenRepository = screenRepository;
    }

    public Screen getScreenById(long screenId) {
        return screenRepository.findByScreenId(screenId);
    }

    public List<Screen> getScreensByTheatreId(long theatreId) {
        return screenRepository.findByTheatreId(theatreId);
    }

}

