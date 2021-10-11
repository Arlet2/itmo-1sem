package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lotad extends Pokemon {
    Lotad(final String name,final int level){
        super(name,level);
        setStats(40,30,30,40,50,30);
        addType(Type.WATER);
        addType(Type.GRASS);
        addMove(new RockTomb());
        addMove(new Confide());
    }
}
