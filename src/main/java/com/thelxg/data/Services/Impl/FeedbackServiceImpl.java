package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.FeedbackDao;
import com.thelxg.data.Services.FeedbackService;
import com.thelxg.data.models.features.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackDao feedbackDao;

    @Autowired
    public FeedbackServiceImpl(FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }


    @Transactional
    public void saveFeedback(Feedback feedback) {
        feedbackDao.saveFeedback(feedback);
    }

    @Transactional
    public Feedback getFeedbackById(long id) {
        return feedbackDao.getFeedbackById(id);
    }

    @Transactional
    public void deleteFeedback(long id) {
        feedbackDao.deleteFeedback(id);
    }

    @Transactional
    public List<Feedback> getAllFeedback() {
        return feedbackDao.getAllFeedback();
    }
}
