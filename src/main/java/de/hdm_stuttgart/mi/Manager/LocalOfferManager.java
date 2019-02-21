package de.hdm_stuttgart.mi.Manager;

import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Human.User;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class LocalOfferManager implements ISaveData {

    private static final Logger log = LogManager.getLogger("writer");

    private static Map<String, ArrayList<LocalOffer>> localMap = new HashMap<>();


    public void save(User local){
        localMap.put(local.getUserName(),local.getOfferList());
        log.info(local +" saved");
    }

    public ArrayList<LocalOffer> callLocalOffer (String userName){
        ArrayList<LocalOffer> returnLocalOffer = new ArrayList<>();
        if(localMap.containsKey(userName)){
            returnLocalOffer = localMap.get(userName);
        }
        log.debug(returnLocalOffer +" showed");
        return returnLocalOffer;
    }

    public void removeExpiredOffer(){
        log.info("thread runs");
        Calendar c = Calendar.getInstance();

        // set the calendar to start of today
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        Date today = c.getTime();
        Local local = new Local();

        Iterator<LocalOffer> iterator = local.getOfferList().iterator();
        while(iterator.hasNext()){
            LocalOffer localOffer = iterator.next();
            if (localOffer.getDate().before(today)) {
                log.debug("Removing " + localOffer);
                iterator.remove();
            }
        }
    }

}