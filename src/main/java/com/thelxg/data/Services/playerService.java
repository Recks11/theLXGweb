package com.thelxg.data.Services;

import com.thelxg.data.models.player;

/**
 * Created by rex on 27/05/2017.
 */

public interface playerService {


    void addPlayer(player play);

    player getPlayerById(long id);

    void removePlayer(long id);
}
