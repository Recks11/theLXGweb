package com.thelxg.data.Dao;

import com.thelxg.data.models.features.groups;

public interface groupsDao {

    void setGroupNumber(groups group);

    groups getLastGroup();

    groups getGroupByNumber(int number);
}
