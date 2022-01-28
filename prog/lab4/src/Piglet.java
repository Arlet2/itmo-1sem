package com.company;

public class Piglet extends Entity implements LittleCreature, HouseOwner{
    Piglet(final String name,final State state){
        super(name, state);
    }
    @Override
    public String whoAmI() {
        return name+" - очень маленькое существо";
    }
    @Override
    public void troubles(){
        System.out.println(name+" не любит, когда на него напрыгивают");
    }
    @Override
    public void giveFood(FoodTaker foodTaker){
        System.out.println(name+" подвинул корзинку с желудями к гостю");
        speak("Угощайтесь, пожалуйста");
        foodTaker.takeFood(new Nut());
    }
    @Override
    public void openDoor(Guest[] guests) throws NobodyAtPartyException {
        if(guests == null) throw new NobodyAtPartyException("Nobody goes to "+name);
        System.out.println(name+" открывает дверь");
        for(Guest i: guests){
            i.enterInHouse();
        }
    }
    public void hug(Pooh pooh){
        getMind().setMood(Mood.FEAR);
        System.out.println(name+" прижимается к "+pooh);
        getMind().setVoice(Voice.ALMOST_FUNNY);
    }
}
