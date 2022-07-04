package com.movierentals.web.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
//@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MovieDto  extends BaseDto{
    private String title;
    private Integer year;
}
