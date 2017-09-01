package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.FeedbackDao;
import com.thelxg.data.models.features.Feedback;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FeedbackDaoImpl implements FeedbackDao{

    private final SessionFactory sessionFactory;

    @Autowired
    public FeedbackDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveFeedback(Feedback feedback) {

        sessionFactory.getCurrentSession().save(feedback);
    }

    @Override
    public Feedback getFeedbackById(long id) {

        return sessionFactory.getCurrentSession().get(Feedback.class, id);
    }

    @Override
    public void deleteFeedback(long id) {

        sessionFactory.getCurrentSession().delete(getFeedbackById(id));
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return sessionFactory.getCurrentSession().createQuery("from Feedback").list();
    }
}
