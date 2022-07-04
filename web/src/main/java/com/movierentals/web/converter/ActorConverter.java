package com.movierentals.web.converter;

import com.movierentals.core.Domain.Actor;
import com.movierentals.core.Domain.Movie;
import com.movierentals.web.dto.ActorDto;
import com.movierentals.web.dto.MovieDto;
import org.springframework.stereotype.Component;

@Component
public class ActorConverter extends AbstractConverterBaseEntityConverter<Actor, ActorDto> {
    @Override
    public Actor convertDtoToModel(ActorDto dto) {
        var model = new Actor();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setRating(dto.getRating());
        return model;
    }

    @Override
    public ActorDto convertModelToDto(Actor actor) {
        ActorDto dto = new ActorDto(actor.getName(),actor.getRating());
        dto.setId(actor.getId());
        return dto;
    }
}
