package de.hdm_stuttgart.mi.Model.Human;

import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Local extends User {

    private static final Logger log = LogManager.getLogger("writer");

    private static ArrayList<LocalOffer> offerList = new ArrayList<>();

    public Local(){
        super();
    }

    /**
     * upload the offers
     * @param locOff: new offer is created
     */
    public void addToOfferList(LocalOffer locOff) {
        log.debug(locOff +" were added");
        offerList.add(locOff);
    }

    public ArrayList<LocalOffer> getOfferList() {
        return offerList;
    }


}
