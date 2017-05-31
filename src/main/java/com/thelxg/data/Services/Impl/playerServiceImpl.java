package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.playerDao;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public player getPlayerById(long id) {
        return playerdao.getPlayerById(id);
    }

    @Transactional
    public void removePlayer(long id) {
        playerdao.removePlayer(id);
    }
}
