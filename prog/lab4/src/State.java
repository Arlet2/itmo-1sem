package com.company;

public enum State {
    STAY(null,null),
    EATING("начал кушать","закончил кушать"),
    ON_WAY("отправляется в путь","прибыл на место"),
    AT_HOUSE("теперь в доме","вышел из дома");
    private final String startPhrase;
    private final String endPhrase;
    State(final String startPhrase,final String endPhrase){
        this.startPhrase = startPhrase;
        this.endPhrase = endPhrase;
    }
    public String startState(){
        return startPhrase;
    }
    public String endState(){
        return endPhrase;
    }
}
