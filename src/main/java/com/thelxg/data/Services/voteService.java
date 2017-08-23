package com.thelxg.data.Services;

import com.thelxg.data.models.vote;

import java.util.List;

public interface voteService {

    vote getVoteForPlayer(String playerAlias);

    void voteForPlayer(String playerAlias);

    int getNumberOfVotesForPlayer(String playerAlias);

    List<vote> getAllVotes();
}
