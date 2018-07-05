package com.thelxg.components;


import com.thelxg.data.models.Player;

public interface groupsAndFixtures {

    boolean generateFixtures();

    boolean generateGroups();

    boolean sendFixtureMail(Player player);
}
