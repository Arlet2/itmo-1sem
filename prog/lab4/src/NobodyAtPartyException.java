package com.company;

// unchecked
public class NobodyAtPartyException extends RuntimeException{
    NobodyAtPartyException(String msg){
        super(msg);
    }
}
