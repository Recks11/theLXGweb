package com.thelxg.data.Dao;

import com.thelxg.data.models.player;

import java.util.List;

/**
 * Created by rex on 27/05/2017.
 */
public interface playerDao {

    void addPlayer(player play);

    void updatePlayer(player play);

    player getPlayerById(long id);

    void removePlayer(long id);

    List getAllPlayers();

    List getPlayersInLocation(String location);

}
