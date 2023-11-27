package com.ncu.theatre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ncu.theatre.entity.Screen;
import com.ncu.theatre.service.ScreenService;

import java.util.List;

@RestController
@RequestMapping("/screens")
public class ScreenController {

    private final ScreenService screenService;

    @Autowired
    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }

    @GetMapping("/{screenId}")
    public ResponseEntity<Screen> getScreenById(@PathVariable long screenId) {
        Screen screen = screenService.getScreenById(screenId);
        return ResponseEntity.ok(screen);
    }

    @GetMapping("/bytheatre/{theatreId}")
    public ResponseEntity<List<Screen>> getScreensByTheatreId(@PathVariable long theatreId) {
        List<Screen> screens = screenService.getScreensByTheatreId(theatreId);
        return ResponseEntity.ok(screens);
    }

    // Additional endpoints related to screens can be added here
}

