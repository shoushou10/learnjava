package com.soso.nba;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

@Component(value = "playerTest")
public class PlayerTest {

    @Test
    public void show() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        Player player = (Player) context.getBean("player");
        player.setName("Kobe");
        player.setNum(24L);
        player.show();
        Assert.assertEquals(24L,player.getNum().longValue());
    }
}