package com.thelxg.data.Dao;

import com.thelxg.data.models.features.fixtures;

import java.util.List;

public interface fixtureDao {
    
    void saveFixture(fixtures fixture);

    void setScore(fixtures fixture);

    List<fixtures> getAllFixtures();

    boolean fixtureExists(String homePlayer, String awayPlayer, String groupNumber);

    List<fixtures> getFixturesWithoutTime();

    List<fixtures> getFixturesWithTime();

    List<fixtures> getFixturesByGroupNumber(String groupNumber);

    List<fixtures> getFixturesByAlias(String Alias);
}
