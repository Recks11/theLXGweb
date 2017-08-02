package com.thelxg.data.Dao;

import com.thelxg.data.models.features.fixtures;
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

    List<player> getPlayersWIthNonGeneratedFixtures();

    List getAllPlayersNotInGroup();

    List<player> getAllPlayersInGroup();

    List<player> getPlayersInGroup(int groupNumber);

    List getPlayersInLocation(String location);

    player getPlayerByUniqueId(String uniqueId);

    player getPlayerByAlias(String alias);


}
