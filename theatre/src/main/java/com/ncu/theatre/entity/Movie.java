package com.ncu.theatre.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String movieName;
    private LocalDate movieReleaseDate;
    private double movieRating;
    private String moviePosterUrl;

    // Constructors, getters, and setters

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDate getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(LocalDate movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMoviePosterUrl() {
        return moviePosterUrl;
    }

    public void setMoviePosterUrl(String moviePosterUrl) {
        this.moviePosterUrl = moviePosterUrl;
    }

    public Movie() {
        // Default constructor for JPA
    }

    public Movie(Long movieId, String movieName, LocalDate movieReleaseDate, double movieRating,
            String moviePosterUrl) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieReleaseDate = movieReleaseDate;
        this.movieRating = movieRating;
        this.moviePosterUrl = moviePosterUrl;
    }
}
