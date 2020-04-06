package com.soso.nba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Player {
    private String name;
    private Long num;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void show(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}

class MainClass{
    public static void main(String[] arg){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        Player player = (Player) context.getBean("player");
        player.show();
    }
}
