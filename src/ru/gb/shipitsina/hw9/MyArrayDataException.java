package ru.gb.shipitsina.hw9;

public class MyArrayDataException extends Exception{

    public MyArrayDataException (String message){
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause){
        super(message, cause);
    }
}