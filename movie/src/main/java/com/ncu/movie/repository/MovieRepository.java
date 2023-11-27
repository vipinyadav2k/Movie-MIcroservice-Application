package com.ncu.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncu.movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByMovieName(String movieName);
    Movie findByMovieId(long movieId);
    
    
}
