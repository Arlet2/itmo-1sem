package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    Facade(){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected String describe(){
        return "дерётся";
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        if(def.getCondition() == Status.BURN ||
        def.getCondition() == Status.PARALYZE ||
        def.getCondition() == Status.POISON)
            return super.calcBaseDamage(att,def)*2;
        return super.calcBaseDamage(att,def);
    }
}
