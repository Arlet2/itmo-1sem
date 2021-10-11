package com.company;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    DreamEater() {
        super(Type.PSYCHIC,100,100);
    }
    @Override
    protected String describe(){
        return "начинает кошмарить";
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return def.getCondition() == Status.SLEEP;
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP,-1*(int)(p.getStat(Stat.HP)-p.getHP()));
    }

}
