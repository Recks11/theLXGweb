package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.fixtureDao;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.features.fixtures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class fixtureServiceImpl implements fixtureService {

    private final playerService player;

    private final fixtureDao fixtures;

    @Autowired
    public fixtureServiceImpl(playerService player, fixtureDao fixture) {
        this.player = player;
        this.fixtures = fixture;
    }

    @Transactional
    public void saveFixture(fixtures fixture) {

        fixtures.saveFixture(fixture);
    }

    @Transactional
    public void updateFixture(fixtures fixture) {
        fixtures.updateFixture(fixture);
    }

    @Transactional
    public void setScore(fixtures fixture) {
        fixtures.setScore(fixture);
    }

    @Transactional
    public fixtures getFixturesById(long id) {
        return fixtures.getFixturesById(id);
    }

    @Transactional
    public fixtures getUngeneratedFixturesById(long id) {
        return fixtures.getUngeneratedFixturesById(id);
    }

    @Transactional
    public List<fixtures> getAllFixtures() {
        return fixtures.getAllFixtures();
    }

    @Transactional
    public boolean fixtureExists(String homePlayer, String awayPlayer, String groupNumber) {

        return fixtures.fixtureExists(homePlayer, awayPlayer, groupNumber);
    }

    @Transactional
    public List<fixtures> getFixturesWithoutTime() {
        return fixtures.getFixturesWithoutTime();
    }

    @Transactional
    public List<fixtures> getFixturesWithTime() {
        return fixtures.getFixturesWithTime();
    }

    @Transactional
    public List<fixtures> getFixturesByGroupNumber(String groupNumber) {
        return fixtures.getFixturesByGroupNumber(groupNumber);
    }
    @Transactional
    public List<fixtures> getUngeneratedFixturesByGroupNumber(String groupNumber) {
        return fixtures.getUngeneratedFixturesByGroupNumber(groupNumber);
    }

    @Transactional
    public List<fixtures> getUngeneratedFixtures() {
        return fixtures.getUngeneratedFixtures();
    }

    @Transactional
    public List<fixtures> getFixturesByAlias(String Alias) {
        return fixtures.getFixturesByAlias(Alias);
    }

    @Transactional
    public List<fixtures> getUpdatedFixtures() {
        return fixtures.getUpdatedFixtures();
    }

    @Transactional
    public List<fixtures> getUnDuplicatedFixtures() {
        return fixtures.getUnDuplicatedFixtures();
    }
}
