package com.thelxg.data.Services;

import com.thelxg.data.models.features.tables;
import com.thelxg.data.models.Player;

import java.util.List;

public interface tableService {


    void addPlayerToTable(Player player);

    boolean generateTableForFixture(long fixtureId);

    boolean generateTableForAllFixtures();

    List<tables> getTableForGroup(int groupNumber);

    tables getTableEntryByHomePlayer(String playerAlias);

    tables getTableEntryByAwayPlayer(String playerAlias);

    List<tables> getAllTables();
}
