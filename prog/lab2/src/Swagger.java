package com.company;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    Swagger(){
        super(Type.NORMAL,0,85);
    }
    @Override
    protected String describe(){
        return "начинает конфузить";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
        p.addEffect(new Effect().turns(2).stat(Stat.ATTACK,(int)(Math.random()*5+1)));
    }
}
