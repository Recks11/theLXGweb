package com.thelxg.data.models.features;

public class ScoreAPI {

    private String teams;

    private String results;

    public ScoreAPI() {
    }

    public ScoreAPI(String teams, String results) {
        this.teams = teams;
        this.results = results;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "{" +
                "teams:'" + teams + '\'' +
                ", results:'" + results + '\'' +
                '}';
    }
}
