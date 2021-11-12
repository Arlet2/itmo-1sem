package com.company;

public class Main {
    public static void main(String[] args) {
        Pooh pooh = new Pooh("Пух",State.STAY);
        Tigger tigger = new Tigger("Тигра",State.STAY);
        Piglet piglet = new Piglet("Пятачок",State.AT_HOUSE);
        pooh.startJourneyWith(tigger,"дом Пяточка");
        Shadow shadowOfPooh = new Shadow("Тень Пуха",pooh.getState());
        pooh.tellAboutLittleCreature(tigger,piglet);
        tigger.playWithShadow(shadowOfPooh);
        pooh.endJourneyWith(tigger,piglet);
        piglet.giveFood(tigger);
        piglet.hug(pooh);
        piglet.speak("Так ты Тигра? Ну-ну!");
        tigger.speak("Да да я");
    }
}
