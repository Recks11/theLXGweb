package com.thelxg.data.Dao;

import com.thelxg.data.models.features.tables;
import com.thelxg.data.models.Player;

import java.util.List;

public interface tableDao {

    void addPlayerToTable(Player player);

    boolean generateTableForFixture(long fixtureId);

    boolean generateTableForAllFixtures();

    boolean updateTables(tables table);

    List<tables> getTableForGroup(int groupNumber);

    tables getTableEntryByHomePlayer(String playerAlias);

    tables getTableEntryByAwayPlayer(String playerAlias);

    List<tables> getAllTables();
}
