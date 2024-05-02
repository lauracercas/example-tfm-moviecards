package com.lauracercas.moviecards.service.actor;


import com.lauracercas.moviecards.dao.actor.ActorDao;
import com.lauracercas.moviecards.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    private final ActorDao actorDao;

    public ActorServiceImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public List<Actor> getAllActors() {
        return actorDao.getAllActors();
    }

    @Override
    public Actor save(Actor actor) {
        return actorDao.save(actor);
    }

    @Override
    public Actor getActorById(Integer actorId) {
        return actorDao.getActorById(actorId);
    }
}
