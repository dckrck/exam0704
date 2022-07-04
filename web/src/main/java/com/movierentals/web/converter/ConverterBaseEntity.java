package com.movierentals.web.converter;

import com.movierentals.core.Domain.BaseEntity;
import com.movierentals.web.dto.BaseDto;

/**
 * Created by radu.
 */

public interface ConverterBaseEntity<Model extends BaseEntity<Long>, Dto extends BaseDto> extends Converter<Model, Dto> {

}

