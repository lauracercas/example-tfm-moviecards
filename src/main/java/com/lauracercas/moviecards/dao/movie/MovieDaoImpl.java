package com.lauracercas.moviecards.dao.movie;

import com.lauracercas.moviecards.model.Movie;
import com.lauracercas.moviecards.repositories.MovieJPA;
import org.springframework.stereotype.Repository;

import java.util.List;

public class MovieDaoImpl implements MovieDao {

    private final MovieJPA movieJPA;

    public MovieDaoImpl(MovieJPA movieJPA) {
        this.movieJPA = movieJPA;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieJPA.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        return movieJPA.save(movie);
    }

    @Override
    public Movie getMovieById(Integer movieId) {
        return movieJPA.findById(movieId).orElse(null);
    }
}
