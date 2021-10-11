package com.company;

public class Ludicolo extends Lotad{
    Ludicolo(final String name,final int level){
        super(name,level);
        setStats(80,70,70,90,100,70);
        addMove(new DoubleTeam());
    }
}
