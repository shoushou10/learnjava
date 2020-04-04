package com.soso.nba;

public class Player {
    private String name;
    private int num;
    private String role;
    private int score;
    private int backboard;
    private int assist;
    private int block;
    private int turnover;

    Player(String name,int num,String role){
        this.name = name;
        this.num = num;
        this.role = role;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setBankboard(int bankboard){
        this.backboard = backboard;
    }

    public void setAssist(int assist){
        this.assist = assist;
    }

    public void setBlock(int block){
        this.block = block;
    }

    public void setTurnover(int turnover){
        this.turnover = turnover;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getRole() {
        return role;
    }

    public int getScore() {
        return score;
    }

    public int getBackboard() {
        return backboard;
    }

    public int getAssist() {
        return assist;
    }

    public int getBlock() {
        return block;
    }

    public int getTurnover() {
        return turnover;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "num: " + getNum() + "\n" +
                "role: " + getRole() + "\n" +
                "backboard: " + getBackboard() + "\n" +
                "assist: " + getAssist() + "\n" +
                "block: " + getBlock() + "\n" +
                "turnover: " + getTurnover() + "\n";
    }
}

class MainClass{
    public static void main(String[] arg){
        Player p1 = new Player("Kobe",24,"PG");
        System.out.println(p1.toString());
    }
}
