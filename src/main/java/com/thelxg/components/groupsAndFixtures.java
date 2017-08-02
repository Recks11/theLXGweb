package com.thelxg.components;


import com.thelxg.data.models.player;

public interface groupsAndFixtures {

    boolean generateFixtures();

    boolean generateGroups();

    boolean sendFixtureMail(player player);
}
