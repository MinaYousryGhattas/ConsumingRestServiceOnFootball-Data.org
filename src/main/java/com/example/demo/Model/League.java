package com.example.demo.Model;

/**
 * Created by Mina_Yousry on 27/02/2018.
 */
public class League {
    String id;
    String caption;
    String league;
    String year;
    String currentMatchday;
    String numberOfMatchdays;
    String numberOfTeams;
    String numberOfGames;
    String lastUpdated;

    public League() {
    }
//    public Links get_links() {
//        return _links;
//    }
//
//    public void set_links(Links _links) {
//        this._links = _links;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(String currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    public String getNumberOfMatchdays() {
        return numberOfMatchdays;
    }

    public void setNumberOfMatchdays(String numberOfMatchdays) {
        this.numberOfMatchdays = numberOfMatchdays;
    }

    public String getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(String numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    public String getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(String numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
