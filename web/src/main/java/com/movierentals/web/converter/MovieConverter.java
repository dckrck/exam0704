package com.movierentals.web.converter;

import com.movierentals.core.Domain.Movie;
import com.movierentals.web.dto.MovieDto;
import org.springframework.stereotype.Component;

@Component
public class MovieConverter extends AbstractConverterBaseEntityConverter<Movie, MovieDto> {
    @Override
    public Movie convertDtoToModel(MovieDto dto) {
        var model = new Movie();
        model.setId(dto.getId());
        model.setTitle(dto.getTitle());
        model.setYear(dto.getYear());
        return model;
    }

    @Override
    public MovieDto convertModelToDto(Movie movie) {
        MovieDto dto = new MovieDto(movie.getTitle(),movie.getYear());
        dto.setId(movie.getId());
        return dto;
    }
}
