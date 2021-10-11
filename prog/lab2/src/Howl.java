package com.company;

import ru.ifmo.se.pokemon.*;

public class Howl extends StatusMove {
    Howl() {
        super(Type.NORMAL,0,0);
    }
    @Override
    protected String describe(){
        return "повыл";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(1).stat(Stat.ATTACK,(int)(Math.random()*5+1)));
    }
}
