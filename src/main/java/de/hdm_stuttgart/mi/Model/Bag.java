package de.hdm_stuttgart.mi.Model;

import java.io.File;

public class Bag {
    private String thing;
    private File ticket;
    public static int numberofItems = 0;

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public File getTicket() {
        return ticket;
    }

    public void setTicket(File ticket) {
        this.ticket = ticket;
        numberofItems ++;
    }


}
