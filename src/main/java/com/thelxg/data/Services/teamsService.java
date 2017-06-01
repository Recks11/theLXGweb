package com.thelxg.data.Services;

import com.thelxg.data.models.teams;

import java.util.List;

/**
 * Created by rex on 01/06/2017.
 */
public interface teamsService {

    void addTeam(teams team);

    void removeTeam(long id);

    teams getTeamById(long id);

    List<teams> getTeamByRegion(String Region);
}
