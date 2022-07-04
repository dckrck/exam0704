package com.movierentals.core.Domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@Table(name = "actor")
public class Actor extends BaseEntity<Long> {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mid")
    private Movie movie;


}