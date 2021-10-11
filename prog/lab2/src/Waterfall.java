package com.company;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    Waterfall(){
        super(Type.PSYCHIC,80,100);
    }
    @Override
    protected String describe(){
        return "льёт водичку";
    }
}
