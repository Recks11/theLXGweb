package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.playerDao;
import com.thelxg.data.models.player;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    public void addPlayer(player play) {
        play.setPlayerId("TheLXG-"+(Math.random()*Math.random()*100)+"-"+play.getAlias());
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
}
