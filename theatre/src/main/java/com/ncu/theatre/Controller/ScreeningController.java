package com.ncu.theatre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.ncu.theatre.entity.Movie;
import com.ncu.theatre.entity.Screening;
import com.ncu.theatre.service.ScreeningService;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {

    private final ScreeningService screeningService;
    private final RestTemplate restTemplate;

    @Autowired
    public ScreeningController(ScreeningService screeningService, RestTemplate restTemplate) {
        this.screeningService = screeningService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/bydate")
    public ResponseEntity<List<Screening>> getScreeningsByDate(@RequestParam Date screeningDate) {
        List<Screening> screenings = screeningService.getScreeningsByDate(screeningDate);
        return ResponseEntity.ok(screenings);
    }

    @GetMapping("/bydetails")
    public ResponseEntity<ScreeningResponse> getScreeningByDetails(
            @RequestParam String movieName,
            @RequestParam long theatreId,
            @RequestParam Date screeningDate,
            @RequestParam Time screeningTime
    ) {
        
        String movieApiUrl = "http://localhost:1906/movies/name/" + movieName;

        Movie movie = restTemplate.getForObject(movieApiUrl, Movie.class);

        Screening screening = screeningService.getScreeningByDetails(movieName, theatreId, screeningDate, screeningTime);

        ScreeningResponse response = new ScreeningResponse(movie, screening);

        return ResponseEntity.ok(response);
    }
    
    public class ScreeningResponse {
        private Movie movie;
        private Screening screening;

        public ScreeningResponse(Movie movie, Screening screening) {
            this.movie = movie;
            this.screening = screening;
        }

		public Movie getMovie() {
			return movie;
		}

		public void setMovie(Movie movie) {
			this.movie = movie;
		}

		public Screening getScreening() {
			return screening;
		}

		public void setScreening(Screening screening) {
			this.screening = screening;
		}
    }

}
