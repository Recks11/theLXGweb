package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.tableDao;
import com.thelxg.data.Services.tableService;
import com.thelxg.data.models.features.tables;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class tableServiceImpl implements tableService {

    private final tableDao tableDao;

    @Autowired
    public tableServiceImpl(tableDao tableDao) {
        this.tableDao = tableDao;
    }

    @Transactional
    public void addPlayerToTable(player player) {
        tableDao.addPlayerToTable(player);
    }

    @Transactional
    public boolean generateTableForFixture(long fixtureId) {
        return tableDao.generateTableForFixture(fixtureId);
    }

    @Transactional
    public boolean generateTableForAllFixtures() {
        return tableDao.generateTableForAllFixtures();
    }

    @Transactional
    public List<tables> getTableForGroup(int groupNumber) {
        return tableDao.getTableForGroup(groupNumber);
    }

    @Transactional
    public tables getTableEntryByHomePlayer(String playerAlias) {
        return tableDao.getTableEntryByHomePlayer(playerAlias);
    }

    @Transactional
    public tables getTableEntryByAwayPlayer(String playerAlias) {
        return tableDao.getTableEntryByAwayPlayer(playerAlias);
    }

    @Transactional
    public List<tables> getAllTables() {
        return tableDao.getAllTables();
    }
}
