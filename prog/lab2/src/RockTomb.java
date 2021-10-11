package com.company;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    RockTomb(){
        super(Type.ROCK,60,95);
    }

    @Override
    protected String describe() {
        return "начинает закидывать камнями";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().turns(1).stat(Stat.SPEED,-1*(int)(Math.random()*5+1)));
    }
}
