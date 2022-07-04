package com.movierentals.core.Service.impl;

import com.movierentals.core.Domain.Movie;
import com.movierentals.core.Repository.BaseRepository;
import com.movierentals.core.Service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    private BaseRepository<Movie, Long> movieRepository;
    //@Autowired
    //private BaseRepository<Client, Long> clientRepository;

    public Movie saveMovie(Long id, String title, Integer year) {
        Movie m=Movie.builder().title(title).year(year).build();//description(description).genre(genre).build();
        m.setId(id);
        Movie movie1 = movieRepository.save(m);
        logger.info(movie1.toString());
        return movie1;
    }

    public List<Movie> getAllMovies() {
        List<Movie> movies = this.movieRepository.findAll();
        movies.forEach(c -> logger.info(c.toString()));
        return movies;
    }

//
//    public List<Movie> getMoviesByTitle(String title) {
//        List<Movie> moviesFiltered = ((MovieRepository) this.movieRepository).findAllByTitle(title);
//        moviesFiltered.forEach(m -> logger.info(m.toString()));
//        return moviesFiltered;
//    }
//
//    public void deleteMovie(Long id) {
//        movieRepository.deleteById(id);
//        logger.info("deleted " + id);
////        todo
////        ((RentalRepository) this.rentalRepository).deleteRentalsByMid(id);
//
//    }
}
