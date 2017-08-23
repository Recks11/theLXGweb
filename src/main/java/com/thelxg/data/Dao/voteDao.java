package com.thelxg.data.Dao;

import com.thelxg.data.models.vote;

import java.util.List;

public interface voteDao {

    vote getVoteForPlayer(String playerAlias);

    void voteForPlayer(String playerAlias);

    int getNumberOfVotesForPlayer(String playerAlias);

    List<vote> getAllVotes();

}
