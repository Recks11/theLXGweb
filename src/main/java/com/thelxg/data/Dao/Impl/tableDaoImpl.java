package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.tableDao;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.features.fixtures;
import com.thelxg.data.models.features.tables;
import com.thelxg.data.models.player;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class tableDaoImpl implements tableDao {


    private final SessionFactory sessionFactory;
    private final fixtureService fixtureService;
    private final playerService playerService;

    @Autowired
    public tableDaoImpl(SessionFactory sessionFactory, fixtureService fixtureService, playerService playerService) {
        this.sessionFactory = sessionFactory;
        this.fixtureService = fixtureService;
        this.playerService = playerService;
    }




    @Override
    public void addPlayerToTable(player player) {

        tables table = new tables();
        table.setPlayerId(player.getPlayerId());
        table.setPlayerAlias(player.getAlias());
        table.setGoalDifference(0);
        table.setPoints(0);
        table.setDraws(0);
        table.setLosses(0);
        table.setWins(0);
        table.setPlayed(0);
        table.setGroup(player.getPlayerGroup());

        sessionFactory.getCurrentSession().save(table);
    }

    @Override
    public boolean updateTables(tables table) {
        sessionFactory.getCurrentSession().update(table);
        return true;
    }

    @Override
    public boolean generateTableForFixture(long fixtureId) {
        /*
         *
         * TODO
         * optimize code
         *
         */
        //Done
        fixtures fixture = fixtureService.getFixturesById(fixtureId);
        player homePlayer = playerService.getPlayerByAlias(fixture.getHomePlayer());
        player awayPlayer = playerService.getPlayerByAlias(fixture.getAwayPlayer());
        String homePlayerAlias = homePlayer.getAlias();
        String awayPlayerAlias = awayPlayer.getAlias();
        tables homeTableEntry = getTableEntryByHomePlayer(homePlayerAlias);
        tables awayTableEntry = getTableEntryByAwayPlayer(awayPlayerAlias);

        //scores from fixture
        int homeFixtureScore = fixture.getHomeScore();
        int awayFixtureScore = fixture.getAwayScore();

        //accumulated points
        int homePoints = homeTableEntry.getPoints();
        int awayPoints = awayTableEntry.getPoints();

        //accumulated goal difference
        int homeGoalDifference = homeTableEntry.getGoalDifference();
        int awayGoalDifference = awayTableEntry.getGoalDifference();
        int homePlayed = homeTableEntry.getPlayed();
        int awayPlayed = awayTableEntry.getPlayed();

        if (!fixture.isTableGenerated()){

            if(homeFixtureScore > awayFixtureScore){
                //set home points and goal difference
                homeTableEntry.setPoints(homePoints + 3);
                homeTableEntry.setGoalDifference(homeGoalDifference + (homeFixtureScore - awayFixtureScore));
                //set away goal difference
                awayTableEntry.setGoalDifference(awayGoalDifference + (awayFixtureScore - homeFixtureScore));
                homeTableEntry.setPlayed(homePlayed + 1);
                awayTableEntry.setPlayed(awayPlayed + 1);
                updateTables(homeTableEntry);
                updateTables(awayTableEntry);
                fixture.setTableGenerated(true);

            }else if(awayFixtureScore > homeFixtureScore){
                //set away points and goal difference
                awayTableEntry.setPoints(awayPoints + 3);
                awayTableEntry.setGoalDifference(awayGoalDifference + (awayFixtureScore - homeFixtureScore));
                //set home goal difference
                homeTableEntry.setGoalDifference(homeGoalDifference + (homeFixtureScore - awayFixtureScore));
                homeTableEntry.setPlayed(homePlayed + 1);
                awayTableEntry.setPlayed(awayPlayed + 1);
                updateTables(awayTableEntry);
                updateTables(homeTableEntry);
                fixture.setTableGenerated(true);
            }else{
                homeTableEntry.setPoints(homePoints + 1);
                awayTableEntry.setPoints(awayPoints + 1);
                homeTableEntry.setGoalDifference(homeGoalDifference + (homeFixtureScore - awayFixtureScore));
                //set away goal difference
                awayTableEntry.setGoalDifference(awayGoalDifference + (awayFixtureScore - homeFixtureScore));
                homeTableEntry.setPlayed(homePlayed + 1);
                awayTableEntry.setPlayed(awayPlayed + 1);
                updateTables(awayTableEntry);
                updateTables(homeTableEntry);
                fixture.setTableGenerated(true);
            }
            return true;

        }else{
            return false;
        }
    }

    @Override
    public boolean generateTableForAllFixtures() {
        List<fixtures> fixturesList = fixtureService.getUngeneratedFixtures();

        for(fixtures fixture : fixturesList){
            generateTableForFixture(fixture.getId());
        }
        return true;
    }

    @Override
    public tables getTableEntryByHomePlayer(String playerId) {

        return (tables) sessionFactory.getCurrentSession()
                .createQuery("from tables where playerAlias = :playerId")
                .setParameter("playerId",playerId)
                .uniqueResult();
    }
    @Override
    public tables getTableEntryByAwayPlayer(String playerId) {

        return (tables) sessionFactory.getCurrentSession()
                .createQuery("from tables where playerAlias = :playerId")
                .setParameter("playerId",playerId)
                .uniqueResult();
    }

    @Override
    public List<tables> getTableForGroup(int groupNumber) {
        return sessionFactory.getCurrentSession()
                .createQuery("from tables where group = :groupNumber")
                .setParameter("groupNumber", groupNumber)
                .list();
    }

    @Override
    public List<tables> getAllTables() {

        return  sessionFactory.getCurrentSession().createQuery("from tables order by points desc, goalDifference desc").list();
    }
}
