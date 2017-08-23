package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.voteDao;
import com.thelxg.data.models.vote;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class votesDaoImpl implements voteDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public votesDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public vote getVoteForPlayer(String playerAlias) {
        return (vote) sessionFactory.getCurrentSession()
                .createQuery("from vote where playerAlias = :playerAlias")
                .setParameter("playerAlias", playerAlias)
                .uniqueResult();
    }

    @Override
    public void voteForPlayer(String playerAlias) {
        vote newVote = getVoteForPlayer(playerAlias);
        int numberOfVotesForPlayer = newVote.getNumberOfVotes();
        newVote.setNumberOfVotes(numberOfVotesForPlayer + 1);
        sessionFactory.getCurrentSession().update(newVote);
    }

    @Override
    public List<vote> getAllVotes() {
        return sessionFactory.getCurrentSession().createQuery("from vote order by playerAlias asc ").list();
    }

    @Override
    public int getNumberOfVotesForPlayer(String playerAlias) {

        return (Integer) sessionFactory.getCurrentSession()
                .createQuery("select numberOfVotes from vote where playerAlias = :playerAlias")
                .setParameter("playerAlias",playerAlias).uniqueResult();
    }
}
