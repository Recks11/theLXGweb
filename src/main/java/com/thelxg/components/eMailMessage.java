package com.thelxg.components;


import com.thelxg.data.models.player;

public interface eMailMessage {

    void setMessageForPlayer(player player);

    String getMessage();

    void setMessageForFixture(player player);
}
