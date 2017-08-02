package com.thelxg.data.Services;

import com.thelxg.data.models.features.groups;

public interface groupsService {

    void setGroupNumber(groups group);

    groups getLastGroup();

    groups getGroupByNumber(int number);
}
