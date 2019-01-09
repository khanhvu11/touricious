package de.hdm_stuttgart.mi.Exception;

import de.hdm_stuttgart.mi.Manager.LocalOfferManager;
import de.hdm_stuttgart.mi.Manager.PlanManager;
import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;

import java.io.IOException;

public class NoCityFoundException extends IOException {

    String city;
    Local localOfferList = new Local();
    private String message;

    public NoCityFoundException(String city){
        for (LocalOffer localOffer : localOfferList.getOfferList()){
            if (city.charAt(1)==localOffer.getCity().charAt(1)){
                setMessage("Do you mean this city: " + localOffer.getCity() );
            }
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        if (message == null){
            return "There's no offer at the city that you want to come";
        }
        return message;
    }

}
