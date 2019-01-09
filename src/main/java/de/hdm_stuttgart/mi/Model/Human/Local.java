package de.hdm_stuttgart.mi.Model.Human;

import de.hdm_stuttgart.mi.Model.Human.User;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;

import java.util.ArrayList;

public class Local extends User {

    private static ArrayList<LocalOffer> offerList = new ArrayList<LocalOffer>();

    public Local(){
        super.getName();
        super.getAge();
        super.getAddress();
        super.getCity();
    }

    public static void addToOfferList(LocalOffer locOff) {
        offerList.add(locOff);
    }

    public ArrayList<LocalOffer> getOfferList() {
        return offerList;
    }


    public void offers(){}

}
