package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.playerDao;
import com.thelxg.data.models.features.fixtures;
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

        play.setPlayerGroup(0);
        play.setFixtureGenerated("no");
        play.setMailStatus("not sent");
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
    public List<player> getPlayersWIthNonGeneratedFixtures() {
        return sessionFactory.getCurrentSession()
                .createQuery("from player where fixtureGenerated = :fixtureStatus")
                .setParameter("fixtureStatus","no")
                .list();
    }

    @Override
    public List getAllPlayersNotInGroup() {
        return sessionFactory.getCurrentSession()
                .createQuery("from player where playerGroup = :playerGroup")
                .setParameter("playerGroup", 0)
                .list();
    }

    @Override
    public List<player> getAllPlayersInGroup() {
        return sessionFactory.getCurrentSession()
                .createQuery("from player where playerGroup is not null")
                .list();
    }

    @Override
    public List<player> getPlayersInGroup(int groupNumber) {

        return sessionFactory.getCurrentSession()
                .createQuery("from player where playerGroup = :groupNumber")
                .setParameter("groupNumber",groupNumber)
                .list();
    }

    @Override
    public List getAllPlayers() {
        return sessionFactory.getCurrentSession().createQuery("from player order by date asc ").list();
    }

    @Override
    public player getPlayerByUniqueId(String uniqueId) {
        return (player) sessionFactory.getCurrentSession()
                .createQuery("from player where PlayerId = :uniqueId")
                .setParameter("uniqueId", uniqueId )
                .uniqueResult();
    }

    @Override
    public List getPlayersInLocation(String location) {
        return sessionFactory.getCurrentSession()
                .createQuery("from player where location = :location order by date asc ")
                .setParameter("location",location)
                .list();
    }

    @Override
    public player getPlayerByAlias(String alias) {
        return (player) sessionFactory.getCurrentSession()
                .createQuery("from player where alias = :alias")
                .setParameter("alias", alias)
                .uniqueResult();
    }

    @Override
    public List<player> getAllPlayersNotInTable() {

        return sessionFactory.getCurrentSession()
                .createQuery("from player where inTables = :inTables order by date asc ")
                .setParameter("inTables",false)
                .list();
    }

    @Override
    public List<player> getAllPlayersInTable() {

        return sessionFactory.getCurrentSession()
                .createQuery("from player where inTables = :inTables order by date asc ")
                .setParameter("inTables",true)
                .list();
    }
}
