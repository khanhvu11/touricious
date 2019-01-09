package de.hdm_stuttgart.mi.Manager;

import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class LocalOfferManager {


    Map<Local,LocalOffer> localManager = new HashMap<>();

    public void localOfferMap (){
        localManager.put(new Local(), new LocalOffer());
    }


    public static void removeExpiredOffer(){
        Calendar c = Calendar.getInstance();

        // set the calendar to start of today
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        Date today = c.getTime();
        Local localOffer = new Local();
        for (LocalOffer offer : localOffer.getOfferList()) {
            if (offer.getDate().before(today)) {
                localOffer.getOfferList().remove(offer);
            }
        }
    }

}