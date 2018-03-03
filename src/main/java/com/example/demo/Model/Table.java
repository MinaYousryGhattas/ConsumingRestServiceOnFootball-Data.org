package com.example.demo.Model;

/**
 * Created by Mina_Yousry on 27/02/2018.
 */
public class Table {
    String leagueCaption;
    int matchday;
    Standing[] standing;

    public String getLeagueCaption() {
        return leagueCaption;
    }

    public void setLeagueCaption(String leagueCaption) {
        this.leagueCaption = leagueCaption;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public Standing[] getStanding() {
        return standing;
    }

    public void setStanding(Standing[] standing) {
        this.standing = standing;
    }
}
