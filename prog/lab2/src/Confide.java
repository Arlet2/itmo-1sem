package com.company;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    Confide(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected String describe() {
        return "делает людишек слабее";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK,-1*(int)(Math.random()*5+1)));
    }
}
