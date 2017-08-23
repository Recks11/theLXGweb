package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.voteDao;
import com.thelxg.data.Services.voteService;
import com.thelxg.data.models.vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class voteServiceImpl implements voteService {


    private final voteDao voteDao;

    @Autowired
    public voteServiceImpl(voteDao voteDao) {
        this.voteDao = voteDao;
    }

    @Transactional
    public vote getVoteForPlayer(String playerAlias) {
        return voteDao.getVoteForPlayer(playerAlias);
    }

    @Transactional
    public void voteForPlayer(String playerAlias) {
        voteDao.voteForPlayer(playerAlias);
    }

    @Transactional
    public List<vote> getAllVotes() {
        return voteDao.getAllVotes();
    }

    @Transactional
    public int getNumberOfVotesForPlayer(String playerAlias) {
        return voteDao.getNumberOfVotesForPlayer(playerAlias);
    }
}
