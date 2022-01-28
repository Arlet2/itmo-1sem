package com.company;

public class Pooh extends Entity implements Guest{
    private final Shadow shadow;
    Pooh(final String name,final State state){
        super(name,state);
        shadow = new Shadow("Тень "+name,State.STAY);
    }
    @Override
    public void enterInHouse(){
        System.out.println(name+" входит в дом");
    }
    public Shadow getShadow() {
        return shadow;
    }
    public void suggest(Entity entity) {
        getMind().setMood(Mood.HAPPY);
        System.out.println(name+" предлагает "+entity.name+" пойти в гости к Пятачку после того как поест");
        System.out.println("Так как там, может быть, угостят желудями");
        getMind().setMood(Mood.NORMAL);
        setState(State.EATING,true,false);
    }
    public void tellAboutLittleCreature(Entity entity, LittleCreature littleCreature){
        System.out.println(name+" начинает рассказывать "+ entity +" о том, что "+littleCreature.whoAmI());
        littleCreature.troubles();
        System.out.println(name+" просит "+entity+" не наскакивать во время первого знакомства");
    }
    public void startJourneyWith(Entity entity, String place){
        setState(State.ON_WAY);
        entity.setState(State.ON_WAY);
        System.out.println(name+" и "+ entity +" после завтрака начали путешествие в "+place);
    }
    public void endJourneyWith(Tigger tigger,Piglet piglet){
        System.out.println(name+" стучит в дверь");
        Guest[] guests = {this, tigger};
        piglet.openDoor(guests);
        setState(State.AT_HOUSE);
        tigger.setState(State.AT_HOUSE);
    }

    static class Shadow extends Entity {
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
}
