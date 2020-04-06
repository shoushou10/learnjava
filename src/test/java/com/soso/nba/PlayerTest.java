package com.soso.nba;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void show() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        Player player = (Player) context.getBean("player");
        player.show();
        Assert.assertEquals(24L,player.getNum().longValue());
    }
}