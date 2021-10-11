package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pyukumuku extends Pokemon {
    Pyukumuku(final String name,final int level){
        super(name,level);
        addType(Type.WATER);
        setStats(55,60,130,30,130,5);
        addMove(new DreamEater());
        addMove(new Howl());
        addMove(new Snarl());
        addMove(new FlameCharge());
    }
}
