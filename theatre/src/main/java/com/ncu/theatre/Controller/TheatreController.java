package com.ncu.theatre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.ncu.theatre.entity.Theatre;
import com.ncu.theatre.service.TheatreService;

@RestController
@RequestMapping("/theatres")
public class TheatreController {

    private final TheatreService theatreService;
    private final RestTemplate restTemplate;

    @Autowired
    public TheatreController(TheatreService theatreService, RestTemplate restTemplate) {
        this.theatreService = theatreService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{theatreId}")
    public ResponseEntity<Theatre> getTheatreById(@PathVariable Long theatreId) {
        Theatre theatre = theatreService.getTheatreById(theatreId);
        return ResponseEntity.ok(theatre);
    }

    @GetMapping("/bynameandcity")
    public ResponseEntity<Theatre> getTheatreByNameAndCity(
            @RequestParam String theatreName,
            @RequestParam String theatreCity
    ) {
        Theatre theatre = theatreService.getTheatreByNameAndCity(theatreName, theatreCity);
        return ResponseEntity.ok(theatre);
    }

    @GetMapping("/{theatreId}/movies")
    public ResponseEntity<String> getMoviesByTheatreId(@PathVariable Long theatreId) {
       
        String movieApiUrl = "http://localhost:1906/movies/" +theatreId;

        String movies = restTemplate.getForObject(movieApiUrl, String.class);

        return ResponseEntity.ok(movies);
    }

}
