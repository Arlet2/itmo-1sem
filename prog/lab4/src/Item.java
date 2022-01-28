package com.company;

public abstract class Item {
    protected final String name;
    Item(String name){
        this.name = name;
    }
    public abstract void changeOwner(Entity entity);
}
