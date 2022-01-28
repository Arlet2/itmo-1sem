package com.company;

public class Tigger extends Entity implements FoodTaker, Guest{
    Tigger(final String name,final State state){
        super(name,state);
    }
    @Override
    public void takeFood(Item item){
        item.changeOwner(this);

    }
    @Override
    public void enterInHouse(){
        System.out.println(name+" входит в дом, прекращая прыгать");
    }
    public void playWithShadow(Pooh.Shadow shadow){
        System.out.println(name+" начинает прятаться за деревьями");
        shadow.turnAway(this);
        shadow.turnAway(this);
        System.out.println(name+" рассказывает, что Тигры наскакивают только до завтрака");
        System.out.println("А как только они поедят желудей, то становятся Тихими и Вежливыми");
    }
    public void sayAboutProblem(){
        getMind().setVoice(Voice.VERY_STRONG);
        speak("Поверь мне, ты хоть и очень гостеприимный, но я бы хотел желудей");
        getMind().setVoice(Voice.NORMAL);
    }
    public void tryToCatchShadow(Pooh.Shadow shadow){
        System.out.println(name + " пытается поймать " + shadow);
        shadow.setCaught(Math.random()<0.5);
    }
    public void tryToCall(Pooh pooh) throws PoohNotReadyException {
        System.out.println(name+" пытается отправится вместе с Пухом");
        if(pooh.getState() == State.EATING) throw new PoohNotReadyException();
        System.out.println(name+" рад, что они наконец-то отправятся в путь");
    }
    public void tryToFinishEating(){
        System.out.println(name+" долго пережевывает желуди");
        getMind().setVoice(Voice.UNCLEAR);
    }
}
