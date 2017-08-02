package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.groupsDao;
import com.thelxg.data.Services.groupsService;
import com.thelxg.data.models.features.groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class groupsServiceImpl implements groupsService {

    private final groupsDao groupsDao;

    @Autowired
    public groupsServiceImpl(groupsDao groupsDao) {
        this.groupsDao = groupsDao;
    }

    @Transactional
    public void setGroupNumber(groups group) {
        groupsDao.setGroupNumber(group);
    }

    @Transactional
    public groups getLastGroup() {
        return groupsDao.getLastGroup();
    }

    @Transactional
    public groups getGroupByNumber(int number) {
        return groupsDao.getGroupByNumber(number);
    }
}
