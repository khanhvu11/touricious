package de.hdm_stuttgart.mi.Model.Human;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Manager.LocalOfferManager;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Model.Things.Plan;

import java.util.ArrayList;
import java.util.List;

public class Tourist extends User {


    private static ArrayList<LocalOffer> foundList = new ArrayList<>();
    private static ArrayList<LocalOffer> wishList = new ArrayList<>();


    public Tourist(){
        super();
    }

    public static ArrayList<LocalOffer> findingOffer(String city) throws NoCityFoundException{
        Local loList = new Local();
        for (LocalOffer offer : loList.getOfferList()) {
            if (offer.getCity() == city) {
                foundList.add(offer);
            }
        }
        return foundList;
    }

    public void chooseOffer(int index) {
        wishList.add(foundList.get(index-1));
    }

    public static ArrayList<LocalOffer> getWishList() {
        return wishList;
    }

    @Override
    public String toString() {
        return super.getName() +"\n"+ super.getAddress()+"\n"+super.getCity();
    }
}
