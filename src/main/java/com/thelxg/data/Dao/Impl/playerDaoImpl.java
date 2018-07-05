package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.playerDao;
import com.thelxg.data.models.Player;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public void updatePlayer(Player play) {
        sessionFactory.getCurrentSession().update(play);
    }

    @Override
    public void addPlayer(Player play) {

        play.setPlayerGroup(0);
        play.setFixtureGenerated(false);
        play.setMailStatus("not sent");
        sessionFactory.getCurrentSession().save(play);
    }

    @Override
    public Player getPlayerById(long id) {
        return sessionFactory.getCurrentSession().get(Player.class, id);
    }

    @Override
    public void removePlayer(long id) {
        sessionFactory.getCurrentSession().delete(getPlayerById(id));
    }

    @Override
    public List<Player> getPlayersWIthNonGeneratedFixtures() {
        return  sessionFactory.getCurrentSession()
                .createQuery("from Player where fixtureGenerated = :fixtureStatus")
                .setParameter("fixtureStatus", false)
                .list();
    }

    @Override
    public List getAllPlayersNotInGroup() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Player where playerGroup = :playerGroup")
                .setParameter("playerGroup", 0)
                .list();
    }

    @Override
    public List<Player> getAllPlayersInGroup() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Player where playerGroup is not null")
                .list();
    }

    @Override
    public List<Player> getPlayersInGroup(int groupNumber) {

        return sessionFactory.getCurrentSession()
                .createQuery("from Player where playerGroup = :groupNumber")
                .setParameter("groupNumber", groupNumber)
                .list();
    }

    @Override
    public List getAllPlayers() {
        return sessionFactory.getCurrentSession().createQuery("from Player order by date asc ").list();
    }

    @Override
    public Player getPlayerByUniqueId(String uniqueId) {
        return (Player) sessionFactory.getCurrentSession()
                .createQuery("from Player where PlayerId = :uniqueId")
                .setParameter("uniqueId", uniqueId)
                .uniqueResult();
    }

    @Override
    public List getPlayersInLocation(String location) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Player where location = :location order by date asc ")
                .setParameter("location", location)
                .list();
    }

    @Override
    public Player getPlayerByAlias(String alias) {
        return (Player) sessionFactory.getCurrentSession()
                .createQuery("from Player where alias = :alias")
                .setParameter("alias", alias)
                .uniqueResult();
    }

    @Override
    public List<Player> getAllPlayersNotInTable() {

        return sessionFactory.getCurrentSession()
                .createQuery("from Player where inTables = :inTables order by date asc ")
                .setParameter("inTables", false)
                .list();
    }

    @Override
    public List<Player> getAllPlayersInTable() {

        return sessionFactory.getCurrentSession()
                .createQuery("from Player where inTables = :inTables order by date asc ")
                .setParameter("inTables", true)
                .list();
    }
}
