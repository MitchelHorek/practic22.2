package com.company;

public class EmptyStringException extends Throwable {
    public EmptyStringException(String s) {
        super(s);
    }
}