package com.soso.nba;

import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "team")
public class Team {
    private String name;
    private String city;
    private String coach;
    private List<Player> playerList;

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void addPlayer(Player player) {
        this.playerList.add(player);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setCity(String city) {

        this.city = city;
    }


    public String getCoach() {
        return coach;
    }

    public String getCity() {

        return city;
    }

    public String getName() {

        return name;
    }

    public void show(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", coach='" + coach + '\'' +
                ", playerList=" + playerList +
                '}';
    }
}
