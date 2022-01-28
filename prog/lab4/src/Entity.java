package com.company;

public abstract class Entity {
    protected final String name;
    private State state;
    private final Mind mind;
    Entity(final String name, final State state){
        this.name = name;
        this.state = state;
        mind = new Mind(); // singleton
    }
    protected final Mind getMind(){
        return mind;
    }
    protected final void setState(State state){
        setState(state,true,true);
    }
    protected final void setState(State state,boolean withStart,boolean withEnd){
        if(this.state.endState() != null && withEnd)
            System.out.println("*"+name+" "+this.state.endState()+"*");
        this.state = state;
        if(state.startState() != null && withStart)
            System.out.println("*"+name+" "+state.startState()+"*");
    }
    public final State getState(){
        return state;
    }
    public void speak(String phrase){
        if(mind.getVoice().isSilence)
            System.out.println(name+" "+ mind.getVoice().getVoicePhrase());
        else
            System.out.println(name+" "+ mind.getVoice().getVoicePhrase()+": "+phrase);
    }

    @Override
    public final String toString(){
        return name;
    }
    protected class Mind {
        private Voice voice;
        protected Mood mood;

        private Mind(){
            voice = Voice.NORMAL;
            mood = Mood.NORMAL;
        }

        public final Mood getMood() {
            return mood;
        }

        protected final void setVoice(Voice voice) {
            System.out.println("*голос у "+Entity.this.name+" меняется на "+voice.getName()+"*");
            this.voice = voice;
        }
        private Voice getVoice(){
            return voice;
        }

        protected final void setMood(Mood mood) {
            System.out.println("*настроение у "+Entity.this.name+" меняется на "+mood.getName()+"*");
        }
    }
    public enum Mood{
        NORMAL("нормальный"),
        HAPPY("довольный"),
        FEAR("испуганный");

        private final String name;
        Mood(final String name){
            this.name = name;
        }
        private String getName(){
            return name;
        }
    }

}
