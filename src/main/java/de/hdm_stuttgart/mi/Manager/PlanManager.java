package de.hdm_stuttgart.mi.Manager;

import de.hdm_stuttgart.mi.Model.Human.User;
import de.hdm_stuttgart.mi.Model.Things.Plan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlanManager implements ISaveData {

    private static Map<String, ArrayList<Plan>> planMap = new HashMap<>();
    ArrayList<Plan> returnplan = new ArrayList<>();

    private static final Logger log = LogManager.getLogger("writer");

    public void save(User tourist ){
        planMap.put(tourist.getUserName(),tourist.getPlans());
        log.debug(planMap +"saved");
    }

    public ArrayList<Plan> callPlan (String userName){
        if(planMap.containsKey(userName)){
            returnplan = planMap.get(userName);
        }
        return returnplan;
    }
}
