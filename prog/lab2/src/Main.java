package com.company;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();

        Ludicolo ludicolo = new Ludicolo("larymar",6);
        Lombre lombre = new Lombre("bitway",3);
        Lotad lotad = new Lotad("zhabakva",2);
        Grumpig grumpig = new Grumpig("klimenkov",8);
        Spoink spoink = new Spoink("pismak",8);
        Pyukumuku pyukumuku = new Pyukumuku("artemka",1);

        b.addAlly(lotad);
        b.addAlly(grumpig);
        b.addAlly(ludicolo);

        b.addFoe(lombre);
        b.addFoe(spoink);
        b.addFoe(pyukumuku);

        b.go();
    }
}
