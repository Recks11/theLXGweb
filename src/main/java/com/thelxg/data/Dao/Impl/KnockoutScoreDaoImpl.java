package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.KnockoutScoreDao;
import com.thelxg.data.models.features.KnockoutScore;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KnockoutScoreDaoImpl implements KnockoutScoreDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public KnockoutScoreDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void saveScore(KnockoutScore score) {
        sessionFactory.getCurrentSession().save(score);
    }

    @Override
    public KnockoutScore getScoreById(long Id) {

        return sessionFactory.getCurrentSession().get(KnockoutScore.class, Id);
    }

    @Override
    public void updateScore(KnockoutScore score) {
        sessionFactory.getCurrentSession().update(score);
    }

    @Override
    public List<KnockoutScore> getAllScores() {
        return sessionFactory.getCurrentSession()
                .createQuery("from KnockoutScore order by roundNumber , scoreHeirachy asc").list();
    }

    @Override
    public List<KnockoutScore> getScoresByRound(int round) {
        return (List<KnockoutScore>) sessionFactory.getCurrentSession()
                .createQuery("from KnockoutScore where roundNumber = :round order by scoreHeirachy asc ")
                .setParameter("round", round)
                .list();
    }
}
