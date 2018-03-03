package com.example.demo.Model;

/**
 * Created by Mina_Yousry on 27/02/2018.
 */
public class Standing {
    int position;
    String teamName;
    int points;
    int wins;
    int draws;
    int losses;
    int goals;
    int goalsAgainst;
    int goalDiffrence;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamNAme) {
        this.teamName = teamNAme;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalDiffrence() {
        return goalDiffrence;
    }

    public void setGoalDiffrence(int goalDiffrence) {
        this.goalDiffrence = goalDiffrence;
    }
}
