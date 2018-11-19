package de.hdm_stuttgart.mi.BusinessLogic;

import de.hdm_stuttgart.mi.Model.Local;
import de.hdm_stuttgart.mi.Model.Tourist;
import de.hdm_stuttgart.mi.Model.User;

import javax.jws.soap.SOAPBinding;

public class UserFactory {

    public User createUser(String type){

        switch (type){
            case "Tourist": return new Tourist();
            case "Local": return new Local();
        }
        return null;
    }

}
