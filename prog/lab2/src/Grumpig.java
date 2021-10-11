package com.company;

public class Grumpig extends Spoink{
    Grumpig(final String name,final int level){
        super(name,level);
        setStats(80,45,65,90,110,80);
        addMove(new Thunder());
    }
}
