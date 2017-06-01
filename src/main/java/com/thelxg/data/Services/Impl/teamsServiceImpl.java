package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.teamsDao;
import com.thelxg.data.Services.teamsService;
import com.thelxg.data.models.teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by rex on 01/06/2017.
 */
@Service
public class teamsServiceImpl implements teamsService {

    private final teamsDao teamDao;

    @Autowired
    public teamsServiceImpl(teamsDao teamDao) {
        this.teamDao = teamDao;
    }

    @Transactional
    public void addTeam(teams team) {
        teamDao.addTeam(team);
    }

    @Transactional
    public void removeTeam(long id) {
        teamDao.removeTeam(id);
    }

    @Transactional
    public teams getTeamById(long id) {
        return teamDao.getTeamById(id);
    }

    @Transactional
    public List<teams> getTeamByRegion(String Region) {
        return teamDao.getTeamByRegion(Region);
    }
}
