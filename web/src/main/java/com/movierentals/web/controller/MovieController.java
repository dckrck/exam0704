package com.movierentals.web.controller;

import com.movierentals.core.Service.ActorService;
import com.movierentals.core.Service.MovieService;
import com.movierentals.web.converter.MovieConverter;
import com.movierentals.web.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorService actorService;

    @Autowired
    private MovieConverter movieConverter;

//    @RequestMapping(value = "/movies/{title}")
//    List<MovieDto> getAllMoviesByTitle(@PathVariable String title) {
//
//        return new ArrayList<>(
//                movieConverter.convertModelsToDtos(
//                        movieService.getMoviesByTitle(title)));
//    }
//

    /*
    @RequestMapping(value = "/upload/{urlimport}")
    void loadMovies(@PathVariable String urlimport) {
        if (urlimport.charAt(urlimport.length() - 7) == 's')
            clientService.readAddressesFromCsv(urlimport);
        else if (urlimport.charAt(urlimport.length() - 7) == 'n') {
            clientService.readFromCsv(urlimport);

        } else
            movieService.readFromCsv(urlimport);
    }


     */

    @RequestMapping(value = "/movieapp/movies")
    List<MovieDto> getAllMovies() {

        return new ArrayList<>(
                movieConverter.convertModelsToDtos(
                        movieService.getAllMovies()));
    }

    /*
    @RequestMapping(value = "/moviesPaginated/{pageNumber}")
    List<MovieDto> getPage(@PathVariable int pageNumber) {
        return new ArrayList<>(
                movieConverter.convertModelsToDtos(
                        movieService.getPaginated(pageNumber)));
    }

     */
//
//    @RequestMapping(value = "/movies", method = RequestMethod.POST)
//    MovieDto addMovie(@RequestBody MovieDto movieDto) {
//        var movie = movieConverter.convertDtoToModel(movieDto);
//
//        var result = movieService.saveMovie(movie.getStock(), movie.getTitle(), movie.getYear(), movie.getGenre());
//
//        var resultModel = movieConverter.convertModelToDto(result);
//
//        return resultModel;
//    }
//
//    @RequestMapping(value = "/movies/{id}", method = RequestMethod.PUT)
//    MovieDto updateMovie(@PathVariable Long id, @RequestBody MovieDto movieDto) {
//        movieDto.setId(id);
//        Movie movie = movieConverter.convertDtoToModel(movieDto);
//        return
//                movieConverter.convertModelToDto(
//                        movieService.updateMovie(
//                                movie.getId(), movie.getStock(), movie.getTitle(), movie.getYear(), movie.getGenre(), new HashSet<>()
//                        ));
//    }
//
//    @RequestMapping(value = "/movies/{id}", method = RequestMethod.DELETE)
//    ResponseEntity<?> deleteMovie(@PathVariable Long id) {
//        movieService.deleteMovie(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
