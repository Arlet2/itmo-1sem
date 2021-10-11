package com.company;

public class Lombre extends Lotad{
    Lombre(final String name,final int level){
        super(name,level);
        setStats(60,50,50,60,70,50);
        addMove(new Amnesia());
    }
}
