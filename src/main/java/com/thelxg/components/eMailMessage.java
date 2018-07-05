package com.thelxg.components;


import com.thelxg.data.models.FiestaPlayer;
import com.thelxg.data.models.Player;

public interface eMailMessage {

    void setMessageForFiestaPlayer(FiestaPlayer player);

    void setMessageForPlayer(Player player);

    String getMessage();

    void setMessageForFixture(Player player);
}
