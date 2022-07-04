package com.movierentals.web.converter;

/**
 * Created by radu.
 */
public interface Converter<Model, Dto> {
    Model convertDtoToModel(Dto dto);

    Dto convertModelToDto(Model model);
}
