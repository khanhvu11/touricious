package de.hdm_stuttgart.mi.Manager;

import de.hdm_stuttgart.mi.Model.Human.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;


public class UserManager implements ISaveData {

    private static final Logger log = LogManager.getLogger("writer");
    private static List<User> userList = new ArrayList<>();

    private boolean existed = false;


    public void save (User user){
        userList.add(user);
        log.debug(user +" was saved");
    }

    public static List<User> getUserList() {
        return userList;
    }


}
