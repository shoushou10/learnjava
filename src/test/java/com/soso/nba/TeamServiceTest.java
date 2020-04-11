package com.soso.nba;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TeamService.class)
public class TeamServiceTest {

    @InjectMocks
    TeamService teamService;

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

    /**
     * @desc 测试私有方法
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @Test
    public void test_getName() throws IllegalAccessException,InvocationTargetException{
        Method method = PowerMockito.method(TeamService.class,"getName",String.class);
        Object ret = method.invoke(teamService,"Lakers");
        assertEquals("Lakers",ret);
    }

    /**
     * @desc 测试私有方法2
     * @throws Exception
     */
    @Test
    public void test_getName_2() throws Exception{
        Object ret = Whitebox.invokeMethod(teamService,"getName","Kobe");
        assertEquals("Kobe",ret);
    }

    /**
     * @desc Mock私有方法
     * @throws Exception
     */
    @Test
    public void test_retName() throws Exception{
        TeamService spy = PowerMockito.spy(teamService);
        PowerMockito.when(spy,"getName","Yaoming").thenReturn("YaoMing");
        assertEquals("YaoMing",spy.retName("Yaoming"));
    }
}