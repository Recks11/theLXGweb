package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.fixtureDao;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.features.fixtures;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class fixtureDaoImpl implements fixtureDao {

    private final playerService player;

    private final SessionFactory sessionFactory;

    @Autowired
    public fixtureDaoImpl(playerService player, SessionFactory sessionFactory) {
        this.player = player;
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveFixture(fixtures fixture) {

        if ((this.fixtureExists(fixture.getHomePlayer(), fixture.getAwayPlayer(), fixture.getGroup()))
                && (!fixture.getHomePlayer().equals(fixture.getAwayPlayer()))) {
            System.out.println("fixture " + fixture.viewScore() + " exists \n");
        } else {
            sessionFactory.getCurrentSession().save(fixture);
        }
    }

    @Override
    public void updateFixture(fixtures fixture) {

        fixture.setFixtureUpdated(true);
        sessionFactory.getCurrentSession().update(fixture);
    }


    @Override
    public fixtures getFixturesById(long id) {
        return sessionFactory.getCurrentSession().get(fixtures.class, id);
    }

    @Override
    public fixtures getUngeneratedFixturesById(long id) {
        return (fixtures) sessionFactory.getCurrentSession()
                .createQuery("from fixtures where tableGenerated = :tableGenerated")
                .setParameter("tableGenerated", false)
                .uniqueResult();
    }

    @Override
    public void setScore(fixtures fixture) {
        sessionFactory.getCurrentSession().update(fixture);
    }

    @Override
    public List<fixtures> getAllFixtures() {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures order by fixtureTime, group asc, homePlayer asc ")
                .list();
    }

    @Override
    public boolean fixtureExists(String homePlayer, String awayPlayer, String groupNumber) {

        List fixtureList = sessionFactory.getCurrentSession()
                .createQuery("from fixtures where homePlayer=:homePlayer and awayPlayer=:awayPlayer and group = :groupNumber")
                .setParameter("homePlayer", homePlayer)
                .setParameter("awayPlayer", awayPlayer)
                .setParameter("groupNumber", groupNumber)
                .list();

        return fixtureList.size() > 0;


    }

    @Override
    public List<fixtures> getFixturesWithoutTime() {
        return sessionFactory.getCurrentSession().createQuery("from fixtures where fixtureTime is null").list();
    }

    @Override
    public List<fixtures> getFixturesWithTime() {
        return sessionFactory.getCurrentSession().createQuery("from fixtures where fixtureTime is not null").list();
    }

    @Override
    public List<fixtures> getFixturesByGroupNumber(String groupNumber) {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures where group = :groupNumber")
                .setParameter("groupNumber", groupNumber).list();
    }

    @Override
    public List<fixtures> getUngeneratedFixturesByGroupNumber(String groupNumber) {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures where group = :groupNumber and tableGenerated = false order by fixtureTime")
                .setParameter("groupNumber", groupNumber).list();
    }

    @Override
    public List<fixtures> getFixturesByAlias(String Alias) {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures where homePlayer = :alias or awayPlayer = :alias order by fixtureTime")
                .setParameter("alias", Alias).list();
    }

    @Override
    public List<fixtures> getUngeneratedFixtures() {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures where tableGenerated = :tableGenerated")
                .setParameter("tableGenerated", false).list();
    }

    @Override
    public List<fixtures> getUnDuplicatedFixtures() {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures where duplicated = :duplicated")
                .setParameter("duplicated", false).list();
    }

    @Override
    public List<fixtures> getUpdatedFixtures() {
        return sessionFactory.getCurrentSession().createQuery("from fixtures where fixtureUpdated = true and tableGenerated = false ").list();
    }

    @Override
    public List<fixtures> getFixturesWithTableGenerated() {
        return sessionFactory.getCurrentSession()
                .createQuery("from fixtures where tableGenerated = :tableGenerated")
                .setParameter("tableGenerated", true).list();
    }
}
