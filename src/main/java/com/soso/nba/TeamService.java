package com.soso.nba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "teamService")
public class TeamService {

    @Autowired
    Team team;

    @Autowired
    Player player;

    public void show(){
        team.show();
    }

    private String getName(String name){
        return name;
    }

    public String retName(String name){
        return getName(name);
    }
}
