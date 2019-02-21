package de.hdm_stuttgart.mi.Exception;

import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;

import java.io.IOException;

public class WrongNumberException extends Exception {
    private String message;
    private int size;

    public WrongNumberException(int size){
        setMessage("Sorry we have only " + size +" offers");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
