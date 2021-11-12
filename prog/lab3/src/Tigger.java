package com.company;

public class Tigger extends Entity implements FoodTaker, Guest{
    Tigger(final String name,final State state){
        super(name,state);
    }
    @Override
    public void takeFood(){
        System.out.println(name+" берёт еду");
        setVoice(Voice.CLOGGED_WITH_ACORNS);
    }
    @Override
    public void enterInHouse(){
        System.out.println(name+" входит в дом, прекращая прыгать");
    }
    public void playWithShadow(Shadow shadow){
        System.out.println(name+" начинает прятаться за деревьями");
        shadow.turnAway(this);
        shadow.turnAway(this);
        System.out.println(name+" рассказывает, что Тигры наскакивают только до завтрака");
        System.out.println("А как только они поедят желудей, то становятся Тихими и Вежливыми");
    }
    public void tryToCatchShadow(Shadow shadow){
        System.out.println(name + " пытается поймать " + shadow);
        shadow.setCaught(Math.random()<0.5);
    }
}
