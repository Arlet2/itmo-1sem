package com.company;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    Thunder(){
        super(Type.ELECTRIC,110,70);
    }

    @Override
    protected String describe() {
        return "метает молнии";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if((int)(Math.random()+100) <= 30)
                Effect.paralyze(p);
    }
}
