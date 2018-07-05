package com.thelxg.components;

public interface KnockOutApiService {

    String GetScoresApi(int firstRoundNumber, int secondRoundNumber, int thirdRoundNumber, int forthRoundNumber, int fifthRoundNumber, String players);

    String GetFinalsScoresApi(int firstRoundNumber, int secondRoundNumber, int thirdRoundNumber, String players);
}
