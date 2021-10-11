package com.company;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
    FlameCharge(){
        super(Type.PSYCHIC,50,100);
    }
    @Override
    protected String describe(){
        return "рвётся с огоньком";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(1).stat(Stat.SPEED,(int)(Math.random()*5+1)));
    }
}
