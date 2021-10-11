package com.company;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    Amnesia(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected String describe() {
        return "страдает амнезией";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(2).stat(Stat.SPECIAL_DEFENSE,(int)(Math.random()*5+1)));
    }
}
