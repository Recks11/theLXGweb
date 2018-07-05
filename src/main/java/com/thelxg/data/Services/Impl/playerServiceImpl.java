package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.playerDao;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rex on 27/05/2017.
 */

@Service
public class playerServiceImpl implements playerService {


    private final playerDao playerdao;

    @Autowired
    public playerServiceImpl(playerDao playerdao) {
        this.playerdao = playerdao;
    }

    @Transactional
    public void addPlayer(player play) {
        playerdao.addPlayer(play);
    }

    @Transactional
    public void updatePlayer(player play) {
        playerdao.updatePlayer(play);
    }

    @Transactional
    public player getPlayerById(long id) {
        return playerdao.getPlayerById(id);
    }

    @Transactional
    public void removePlayer(long id) {
        playerdao.removePlayer(id);
    }

    @Transactional
    public List getAllPlayers() {
        return playerdao.getAllPlayers();
    }

    @Transactional
    public List getAllPlayersNotInGroup() {
        return playerdao.getAllPlayersNotInGroup();
    }

    @Transactional
    public List<player> getAllPlayersInGroup() {
        return playerdao.getAllPlayersInGroup();
    }

    @Transactional
    public player getPlayerByAlias(String alias) {
        return playerdao.getPlayerByAlias(alias);
    }

    @Transactional
    public List<player> getPlayersWIthNonGeneratedFixtures() {
        return playerdao.getPlayersWIthNonGeneratedFixtures();
    }

    @Transactional
    public List<player> getPlayersInGroup(int groupNumber) {
        return playerdao.getPlayersInGroup(groupNumber);
    }

    @Transactional
    public player getPlayerByUniqueId(String uniqueId) {
        return playerdao.getPlayerByUniqueId(uniqueId);
    }

    @Transactional
    public List getPlayersInLocation(String location) {
        return playerdao.getPlayersInLocation(location);
    }

    @Transactional
    public List<player> getAllPlayersNotInTable() {
        return playerdao.getAllPlayersNotInTable();
    }

    @Transactional
    public List<player> getAllPlayersInTable() {
        return playerdao.getAllPlayersInTable();
    }
}
