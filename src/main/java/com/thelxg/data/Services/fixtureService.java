package com.thelxg.data.Services;

import com.thelxg.data.models.features.fixtures;

import java.util.List;

public interface fixtureService {

    void saveFixture(fixtures fixture);

    void updateFixture(fixtures fixture);

    void setScore(fixtures fixture);

    fixtures getFixturesById(long id);

    fixtures getUngeneratedFixturesById(long id);

    List<fixtures> getAllFixtures();

    boolean fixtureExists(String homePlayer, String awayPlayer, String groupNumber);

    List<fixtures> getFixturesWithoutTime();

    List<fixtures> getFixturesWithTime();

    List<fixtures> getFixturesByGroupNumber(String groupNumber);

    List<fixtures> getUngeneratedFixturesByGroupNumber(String groupNumber);

    List<fixtures> getFixturesByAlias(String Alias);

    List<fixtures> getUngeneratedFixtures();

    List<fixtures> getUnDuplicatedFixtures();

}
