package com.thelxg.data.Dao;

import com.thelxg.data.models.Player;

import java.util.List;

/**
 * Created by rex on 27/05/2017.
 */
public interface playerDao {

    void addPlayer(Player play);

    void updatePlayer(Player play);

    Player getPlayerById(long id);

    void removePlayer(long id);

    List getAllPlayers();

    List<Player> getPlayersWIthNonGeneratedFixtures();

    List getAllPlayersNotInGroup();

    List<Player> getAllPlayersInGroup();

    List<Player> getPlayersInGroup(int groupNumber);

    List getPlayersInLocation(String location);

    Player getPlayerByUniqueId(String uniqueId);

    Player getPlayerByAlias(String alias);

    List<Player> getAllPlayersNotInTable();

    List<Player> getAllPlayersInTable();


}
