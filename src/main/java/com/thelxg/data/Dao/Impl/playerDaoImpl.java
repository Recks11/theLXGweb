package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.playerDao;
import com.thelxg.data.models.player;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

/**
 * Created by rex on 27/05/2017.
 */
@Repository
public class playerDaoImpl implements playerDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public playerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void updatePlayer(player play) {
        sessionFactory.getCurrentSession().update(play);
    }

    @Override
    public void addPlayer(player play) {

        sessionFactory.getCurrentSession().save(play);
    }

    @Override
    public player getPlayerById(long id) {
        return sessionFactory.getCurrentSession().get(player.class, id);
    }

    @Override
    public void removePlayer(long id) {
        sessionFactory.getCurrentSession().delete(getPlayerById(id));
    }

    @Override
    public List getAllPlayers() {
        return sessionFactory.getCurrentSession().createQuery("from player").list();
    }

    @Override
    public List getPlayersInLocation(String location) {
        return sessionFactory.getCurrentSession().createQuery("from player where location = :location order by date").setParameter("location",location).list();
    }
}
