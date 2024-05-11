package com.lauracercas.moviecards.service.actor;


import com.lauracercas.moviecards.model.Actor;
import com.lauracercas.moviecards.repositories.ActorJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    private final ActorJPA actorDao;

    public ActorServiceImpl(ActorJPA actorDao) {
        this.actorDao = actorDao;
    }
//    private final ActorDao actorDao;

//    public ActorServiceImpl(ActorDao actorDao) {
//        this.actorDao = actorDao;
//    }

    @Override
    public List<Actor> getAllActors() {
        return actorDao.findAll();
    }

    @Override
    public Actor save(Actor actor) {
        return actorDao.save(actor);
    }

    @Override
    public Actor getActorById(Integer actorId) {
        return actorDao.getById(actorId);
    }
}
