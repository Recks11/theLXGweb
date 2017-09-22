package com.thelxg.data.Dao;

import com.thelxg.data.models.FiestaPlayer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FiestaPlayerDaoImpl implements FiestaPlayerDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public FiestaPlayerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPlayer(FiestaPlayer fiestaPlayer) {
        sessionFactory.getCurrentSession().save(fiestaPlayer);
    }

    @Override
    public void updatePlayer(FiestaPlayer fiestaPlayer) {
        sessionFactory.getCurrentSession().update(fiestaPlayer);
    }

    @Override
    public FiestaPlayer getPlayerById(long id) {
        return sessionFactory.getCurrentSession().get(FiestaPlayer.class, id);
    }

    @Override
    public void removePlayer(long id) {
        sessionFactory.getCurrentSession().delete(getPlayerById(id));
    }

    @Override
    public List<FiestaPlayer> getAllFiestaPlayers() {
        return sessionFactory.getCurrentSession().createQuery("from FiestaPlayer").list();
    }

    @Override
    public FiestaPlayer getPlayerByUniqueId(String uniqueId) {
        return (FiestaPlayer) sessionFactory.getCurrentSession()
                .createQuery("from FiestaPlayer where PlayerId = :playerId")
                .setParameter("playerId", uniqueId).uniqueResult();
    }

    @Override
    public FiestaPlayer getPlayerByAlias(String alias) {
        return (FiestaPlayer) sessionFactory.getCurrentSession()
                .createQuery("from FiestaPlayer where alias = :alias")
                .setParameter("alias", alias).uniqueResult();
    }
}
