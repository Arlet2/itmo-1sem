package com.company;

public abstract class Entity {
    private Voice voice = Voice.NORMAL;
    protected final String name;
    private State state;
    Entity(final String name, final State state){
        this.name = name;
        this.state = state;
    }
    protected void setState(State state){
        if(this.state.endState() != null)
            System.out.println("*"+name+" "+this.state.endState()+"*");
        this.state = state;
        if(state.startState() != null)
            System.out.println("*"+name+" "+state.startState()+"*");
    }
    public State getState(){
        return state;
    }
    public void speak(String phrase){
        if(getVoice().isSilence)
            System.out.println(name+" "+getVoice().getVoicePhrase());
        else
            System.out.println(name+" "+getVoice().getVoicePhrase()+": "+phrase);
    }
    protected void setVoice(Voice voice) {
        System.out.println("*голос у "+name+" меняется на "+voice.getName()+"*");
        this.voice = voice;
    }
    private Voice getVoice(){
        return voice;
    }
    @Override
    public String toString(){
        return name;
    }
}
