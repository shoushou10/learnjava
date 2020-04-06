package com.soso.nba;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeamServiceTest {

    @Test
    public void show() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        TeamService teamService = (TeamService) context.getBean("teamService");
        teamService.player.setName("Kobe");
        teamService.player.setNum(24L);
        teamService.team.setName("Lakers");
        teamService.team.setCity("Los Angles");
        teamService.team.setCoach("Fills");
        teamService.team.setPlayerList(new ArrayList<Player>());
        teamService.team.addPlayer(teamService.player);
        teamService.show();
    }
}