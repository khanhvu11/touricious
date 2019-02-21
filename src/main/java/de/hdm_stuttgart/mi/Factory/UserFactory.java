package de.hdm_stuttgart.mi.Factory;

import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Human.Tourist;
import de.hdm_stuttgart.mi.Model.Human.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserFactory {

    private static final Logger log = LogManager.getLogger("writer");


    public User createUser(String type){
        switch (type) {
            case "Tourist":
                return new Tourist();
            case "Local":
                return new Local();
            default:
               log.error(type + "is not accepted");
        }
        return null;

    }

}
