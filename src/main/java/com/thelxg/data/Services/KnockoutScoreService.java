package com.thelxg.data.Services;

import com.thelxg.data.models.features.KnockoutScore;

import java.util.List;

public interface KnockoutScoreService {

    void saveScore(KnockoutScore score);

    void updateScore(KnockoutScore score);

    KnockoutScore getScoreById(long id);

    List<KnockoutScore> getAllScores();

    List<KnockoutScore> getScoresByRound(int round);
}
