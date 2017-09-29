package com.thelxg.components.impl;

import com.thelxg.components.KnockOutApiService;
import com.thelxg.data.Services.KnockoutScoreService;
import com.thelxg.data.models.features.KnockoutScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnockOutApiImpl implements KnockOutApiService {

    private final KnockoutScoreService knockoutScoreService;

    @Autowired
    public KnockOutApiImpl(KnockoutScoreService knockoutScoreService) {
        this.knockoutScoreService = knockoutScoreService;
    }


    @Override
    public String GetScoresApi(int firstRoundNumber, int secondRoundNumber, int thirdRoundNumber, int forthRoundNumber, int fifthRoundNumber, String players) {

        List<KnockoutScore> round1 =  knockoutScoreService.getScoresByRound(firstRoundNumber);
        List<KnockoutScore> round2 =  knockoutScoreService.getScoresByRound(secondRoundNumber);
        List<KnockoutScore> round3 =  knockoutScoreService.getScoresByRound(thirdRoundNumber);
        List<KnockoutScore> round4 =  knockoutScoreService.getScoresByRound(forthRoundNumber);
        List<KnockoutScore> round5 =  knockoutScoreService.getScoresByRound(fifthRoundNumber);

        List<String> round1Score = new ArrayList<String>();
        List<String> round2Score = new ArrayList<String>();
        List<String> round3Score = new ArrayList<String>();
        List<String> round4Score = new ArrayList<String>();
        List<String> round5Score = new ArrayList<String>();

        for(KnockoutScore knockoutScore : round1){ round1Score.add(knockoutScore.scoreApi());}
        for(KnockoutScore knockoutScore2 : round2){ round2Score.add(knockoutScore2.scoreApi());}
        for(KnockoutScore knockoutScore3 : round3){ round3Score.add(knockoutScore3.scoreApi());}
        for(KnockoutScore knockoutScore4 : round4){ round4Score.add(knockoutScore4.scoreApi());}
        for(KnockoutScore knockoutScore5 : round5){ round5Score.add(knockoutScore5.scoreApi());}

        String scores = "{"+
                "\"teams\" : [\n" + players
                 +
                "        ],\n" +
                "        \"results\" : [\n" +
                "            "+round1Score.toString()+",\n" +
                "            "+round2Score.toString()+",\n" +
                "            "+round3Score.toString()+",\n" +
                "            "+round4Score.toString()+",\n" +
                "            "+round5Score.toString()+"\n" +
                "           ]\n" +
                "    }";
        return scores.trim();
    }

    @Override
    public String GetFinalsScoresApi(int firstRoundNumber, int secondRoundNumber, int thirdRoundNumber, String players) {
        List<KnockoutScore> round1 =  knockoutScoreService.getScoresByRound(firstRoundNumber);
        List<KnockoutScore> round2 =  knockoutScoreService.getScoresByRound(secondRoundNumber);
        List<KnockoutScore> round3 =  knockoutScoreService.getScoresByRound(thirdRoundNumber);

        List<String> round1Score = new ArrayList<String>();
        List<String> round2Score = new ArrayList<String>();
        List<String> round3Score = new ArrayList<String>();

        for(KnockoutScore knockoutScore : round1){ round1Score.add(knockoutScore.scoreApi());}
        for(KnockoutScore knockoutScore2 : round2){ round2Score.add(knockoutScore2.scoreApi());}
        for(KnockoutScore knockoutScore3 : round3){ round3Score.add(knockoutScore3.scoreApi());}

        String scores = "{"+
                "\"teams\" : [\n" + players
                +
                "        ],\n" +
                "        \"results\" : [\n" +
                "            "+round1Score.toString()+",\n" +
                "            "+round2Score.toString()+",\n" +
                "            "+round3Score.toString()+"\n"  +
                "           ]\n" +
                "    }";
        return scores.trim();
    }
}
