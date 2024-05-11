package com.lauracercas.moviecards.service.movie;


import com.lauracercas.moviecards.model.Movie;
import com.lauracercas.moviecards.repositories.MovieJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieJPA movieJPA;

    public MovieServiceImpl(MovieJPA movieJPA) {
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
        return movieJPA.getById(movieId);
    }
}
