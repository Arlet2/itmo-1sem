package com.company;

public class Pooh extends Entity implements Guest{
    Pooh(final String name,final State state){
        super(name,state);
    }
    @Override
    public void enterInHouse(){
        System.out.println(name+" входит в дом");
    }
    public void tellAboutLittleCreature(Entity entity, LittleCreature littleCreature){
        System.out.println(name+" начинает рассказывать "+ entity +" о том, что "+littleCreature.whoAmI());
        littleCreature.troubles();
        System.out.println(name+" просит "+entity+" не наскакивать во время первого знакомства");
    }
    public void startJourneyWith(Entity entity, String place){
        setState(State.ON_WAY);
        entity.setState(State.ON_WAY);
        System.out.println(name+" и "+ entity +" после завтрака начали путешествие в "+place);
    }
    public void endJourneyWith(Tigger tigger,Piglet piglet){
        System.out.println(name+" стучит в дверь");
        Guest[] guests = {this, tigger};
        piglet.openDoor(guests);
        setState(State.AT_HOUSE);
        tigger.setState(State.AT_HOUSE);
    }
}
