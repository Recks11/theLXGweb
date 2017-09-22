package com.thelxg.data.Dao;


import com.thelxg.data.models.FiestaPlayer;

import java.util.List;

public interface FiestaPlayerDao {

    void addPlayer(FiestaPlayer play);

    void updatePlayer(FiestaPlayer play);

    FiestaPlayer getPlayerById(long id);

    void removePlayer(long id);

    List<FiestaPlayer> getAllFiestaPlayers();

    FiestaPlayer getPlayerByUniqueId(String uniqueId);

    FiestaPlayer getPlayerByAlias(String alias);
}
