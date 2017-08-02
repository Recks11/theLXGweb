package com.thelxg.data.Services;

import com.thelxg.data.models.player;

import java.util.List;

/**
 * Created by rex on 27/05/2017.
 */

public interface playerService {


    void addPlayer(player play);

    void updatePlayer(player play);

    player getPlayerById(long id);

    void removePlayer(long id);

    List getAllPlayers();

    List<player> getPlayersWIthNonGeneratedFixtures();

    List getAllPlayersNotInGroup();

    List<player> getAllPlayersInGroup();

    List<player> getPlayersInGroup(int groupNumber);

    List getPlayersInLocation(String location);

    player getPlayerByUniqueId(String uniqueId);

    player getPlayerByAlias(String alias);
}
