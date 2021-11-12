package com.company;

public class Shadow extends Entity {
    private boolean isCaught = false;
    Shadow(final String name,final State state){
        super(name,state);
    }
    public void turnAway(final Tigger tigger){
        if(!isCaught) {
            System.out.println(name + " отвернулась от " + tigger);
            tigger.tryToCatchShadow(this);
        }
    }
    public void setCaught(boolean caught) {
        isCaught = caught;
        if(isCaught){
            System.out.println(name+" была поймана!");
        }
        else{
            System.out.println(name+" не удалось поймать");
        }
    }
}
