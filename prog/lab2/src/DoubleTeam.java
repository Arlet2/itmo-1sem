package com.company;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    DoubleTeam(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected String describe() {
        return "делается более уклончивым";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(1).stat(Stat.EVASION,(int)(Math.random()*5+1)));
    }
}
