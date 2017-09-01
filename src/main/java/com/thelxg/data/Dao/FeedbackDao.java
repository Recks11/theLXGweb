package com.thelxg.data.Dao;


import com.thelxg.data.models.features.Feedback;

import java.util.List;

public interface FeedbackDao {

    void saveFeedback(Feedback feedback);

    Feedback getFeedbackById(long id);

    void deleteFeedback(long id);

    List<Feedback> getAllFeedback();
}
