package com.thelxg.data.Dao;

import com.thelxg.data.models.player;

/**
 * Created by rex on 27/05/2017.
 */
public interface playerDao {

    void addPlayer(player play);

    player getPlayerById(long id);

    void removePlayer(long id);

}
