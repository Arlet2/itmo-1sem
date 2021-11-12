package com.company;

public enum Voice {
    NORMAL("нормальный", false) {
        @Override
        public String getVoicePhrase() {
            return "говорит";
        }
    },
    ALMOST_FUNNY("почти весёлый", false) {
        @Override
        public String getVoicePhrase() {
            return "почти весёлым голосом произносит";
        }
    },
    CLOGGED_WITH_ACORNS("забитый желудями", true) {
        @Override
        public String getVoicePhrase() {
            return "не может говорить, так как его рот забит желудями";
        }
    };
    public final String name;
    public final boolean isSilence;
    Voice(final String name,final boolean isSilence){
        this.name = name;
        this.isSilence = isSilence;
    }
    public abstract String getVoicePhrase();
    public String getName(){
        return name;
    }
}