package com.lauracercas.moviecards.service.movie;


import com.lauracercas.moviecards.model.Movie;
import com.lauracercas.moviecards.repositories.MovieJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieJPA movieDao;

    public MovieServiceImpl(MovieJPA movieDao) {
        this.movieDao = movieDao;
    }

//    public MovieServiceImpl(MovieDao movieDao) {
//        this.movieDao = movieDao;
//    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public Movie getMovieById(Integer movieId) {
        return movieDao.getById(movieId);
    }
}
