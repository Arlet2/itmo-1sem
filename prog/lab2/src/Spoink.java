package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spoink extends Pokemon {
    Spoink(final String name,final int level) {
        super(name,level);
        addType(Type.PSYCHIC);
        setStats(60,25,35,70,80,60);
        addMove(new Swagger());
        addMove(new Facade());
        addMove(new Waterfall());
    }
}
