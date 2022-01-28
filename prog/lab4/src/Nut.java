package com.company;

public class Nut extends Item{
    Nut(){
        super("орехи");
    }
    @Override
    public void changeOwner(Entity entity) {
        System.out.println(entity.name+" берёт "+this.name + " и начинает есть");
        entity.getMind().setVoice(Voice.CLOGGED_WITH_ACORNS);
    }
}
