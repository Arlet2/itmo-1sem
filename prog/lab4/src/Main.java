package com.company;

public class Main {
    public static void main(String[] args) {
        Pooh pooh = new Pooh("Пух",State.AT_HOUSE);
        Tigger tigger = new Tigger("Тигра",State.AT_HOUSE);
        Piglet piglet = new Piglet("Пятачок",State.AT_HOUSE);

        tigger.sayAboutProblem();
        pooh.suggest(tigger);

        System.out.println();

        int i=0;
        while(true){
            try {
                if(i == 2){
                    System.out.println("Пух психует и быстро доедает");
                    pooh.setState(State.AT_HOUSE,false,true);
                }
                tigger.tryToCall(pooh);
                break;
            } catch (Throwable t) {
                System.out.println(t.getMessage());
            }
            finally {
                i++;
            }
        }

        System.out.println();

        pooh.startJourneyWith(tigger,"дом Пятачка");

        System.out.println();

        pooh.tellAboutLittleCreature(tigger,piglet);
        tigger.playWithShadow(pooh.getShadow());

        System.out.println();

        pooh.endJourneyWith(tigger,piglet);

        System.out.println();

        piglet.giveFood(tigger);
        piglet.hug(pooh);
        piglet.speak("Так ты Тигра? Ну-ну!");
        tigger.speak("Да да я");

        tigger.tryToFinishEating();
        tigger.speak("Да, это я");

        Entity friends = new Entity("Пух и Пятачок", State.STAY) {
            @Override
            public void speak(String phrase) {
                System.out.println(name+" говорят: "+phrase);
            }
        };
        friends.speak("Что-что?");

        tigger.getMind().setVoice(Voice.NORMAL);
        tigger.speak("Я ЕСТЬ ТИГРА");
    }
}
