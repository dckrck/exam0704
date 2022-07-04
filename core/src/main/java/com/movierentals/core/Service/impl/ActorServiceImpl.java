package com.movierentals.core.Service.impl;

import com.movierentals.core.Domain.Actor;
import com.movierentals.core.Domain.Movie;
import com.movierentals.core.Repository.BaseRepository;
import com.movierentals.core.Service.ActorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    private BaseRepository<Actor, Long> actorRepository;

    public Actor saveActor(Long id, String name, Integer rating) {
        Actor a=Actor.builder().name(name).rating(rating).build();//description(description).genre(genre).build();
        a.setId(id);
        Actor actor1 = actorRepository.save(a);
        logger.info(actor1.toString());
        return actor1;
    }

    public List<Actor> getAllActors() {
        List<Actor> actors = this.actorRepository.findAll();
        actors.forEach(c -> logger.info(c.toString()));
        return actors;
    }
}
