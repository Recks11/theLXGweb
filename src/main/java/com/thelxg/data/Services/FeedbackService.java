package com.thelxg.data.Services;

import com.thelxg.data.models.features.Feedback;

import java.util.List;

public interface FeedbackService {

    void saveFeedback(Feedback feedback);

    Feedback getFeedbackById(long id);

    void deleteFeedback(long id);

    List<Feedback> getAllFeedback();
}
