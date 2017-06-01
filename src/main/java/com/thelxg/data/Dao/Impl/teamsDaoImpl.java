package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.teamsDao;
import com.thelxg.data.models.teams;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rex on 01/06/2017.
 */

@Repository
public class teamsDaoImpl implements teamsDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public teamsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addTeam(teams team) {
        sessionFactory.getCurrentSession().save(team);
    }

    @Override
    public void removeTeam(long id) {
        sessionFactory.getCurrentSession().delete(getTeamById(id));
    }

    @Override
    public teams getTeamById(long id) {
        return sessionFactory.getCurrentSession().get(teams.class, id);
    }

    @Override
    public List<teams> getTeamByRegion(String region) {
        return sessionFactory.getCurrentSession().createQuery("from teams where region = :region").setParameter("region", region).list();
    }
}
