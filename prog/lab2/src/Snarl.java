package com.company;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    Snarl() {
        super(Type.DARK,55,95);
    }
    @Override
    protected String describe(){
        return "рычит";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(1).stat(Stat.ATTACK,-1*(int)(Math.random()*5+1)));
    }
}
