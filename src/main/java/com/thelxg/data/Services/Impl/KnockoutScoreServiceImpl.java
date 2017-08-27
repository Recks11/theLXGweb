package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.KnockoutScoreDao;
import com.thelxg.data.Services.KnockoutScoreService;
import com.thelxg.data.models.features.KnockoutScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class KnockoutScoreServiceImpl implements KnockoutScoreService {


    private final KnockoutScoreDao knockoutScoreDao;

    @Autowired
    public KnockoutScoreServiceImpl(KnockoutScoreDao knockoutScoreDao) {
        this.knockoutScoreDao = knockoutScoreDao;
    }


    @Transactional
    public void saveScore(KnockoutScore score) {
        knockoutScoreDao.saveScore(score);
    }

    @Transactional
    public void updateScore(KnockoutScore score) {
        knockoutScoreDao.updateScore(score);
    }

    @Override
    public KnockoutScore getScoreById(long id) {
        return knockoutScoreDao.getScoreById(id);
    }

    @Transactional
    public List<KnockoutScore> getAllScores() {
        return knockoutScoreDao.getAllScores();
    }

    @Transactional
    public List<KnockoutScore> getScoresByRound(int round) {
        return knockoutScoreDao.getScoresByRound(round);
    }
}
