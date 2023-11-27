package com.ncu.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.movie.entity.Movie;
import com.ncu.movie.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie findByMovieName(String movieName) {
        return movieRepository.findByMovieName(movieName);
    }

    public Movie findByMovieId(long movieId) {
        Optional<Movie> optionalMovie = movieRepository.findById(movieId);
        return optionalMovie.orElse(null);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long movieId, Movie updatedMovie) {
        Optional<Movie> optionalMovie = movieRepository.findById(movieId);
        if (optionalMovie.isPresent()) {
            Movie existingMovie = optionalMovie.get();

            if (updatedMovie.getMovieName() != null) {
                existingMovie.setMovieName(updatedMovie.getMovieName());
            }
            if (updatedMovie.getMovieReleaseDate() != null) {
                existingMovie.setMovieReleaseDate(updatedMovie.getMovieReleaseDate());
            }
            if (updatedMovie.getMovieRating() != 0.0) {
                existingMovie.setMovieRating(updatedMovie.getMovieRating());
            }
            if (updatedMovie.getMoviePosterUrl() != null) {
                existingMovie.setMoviePosterUrl(updatedMovie.getMoviePosterUrl());
            }
            return movieRepository.save(existingMovie);
        } else {
            return null;
        }
    }

    public boolean deleteMovie(Long movieId) {
        if (movieRepository.existsById(movieId)) {
            movieRepository.deleteById(movieId);
            return true;
        } else {
            return false;
        }
    }
    
    // Additional methods for business logic or other CRUD operations can be added
    
}
