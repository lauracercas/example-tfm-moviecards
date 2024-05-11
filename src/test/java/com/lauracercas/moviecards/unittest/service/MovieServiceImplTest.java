package com.lauracercas.moviecards.unittest.service;

import com.lauracercas.moviecards.dao.movie.MovieDao;
import com.lauracercas.moviecards.model.Movie;
import com.lauracercas.moviecards.repositories.MovieJPA;
import com.lauracercas.moviecards.service.movie.MovieServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class MovieServiceImplTest {
    @Mock
    private MovieJPA movieDao;
//    private MovieDao movieDao;

    private MovieServiceImpl sut;
    private AutoCloseable closeable;

    @BeforeEach
    public void setUp() {
        closeable = openMocks(this);
        sut = new MovieServiceImpl(movieDao);
    }

    @AfterEach
    void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    public void shouldGetAllMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie());
        movies.add(new Movie());

        when(movieDao.findAll()).thenReturn(movies);

        List<Movie> result = sut.getAllMovies();

        assertEquals(2, result.size());
    }

    @Test
    public void shouldGetMovieById() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setTitle("Sample Movie");

        when(movieDao.getById(anyInt())).thenReturn(movie);

        Movie result = sut.getMovieById(1);

        assertEquals(1, result.getId());
        assertEquals("Sample Movie", result.getTitle());
    }

    @Test
    public void shouldSaveMovie() {
        Movie movie = new Movie();
        movie.setTitle("New Movie");

        when(movieDao.save(movie)).thenReturn(movie);

        Movie result = sut.save(movie);

        assertEquals("New Movie", result.getTitle());
    }


}