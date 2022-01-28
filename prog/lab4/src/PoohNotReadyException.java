package com.company;

// checked
public class PoohNotReadyException extends Exception {
    PoohNotReadyException(){
        super("!!! Пух еще кушает и не может отправиться в путь !!!");
    }
}
