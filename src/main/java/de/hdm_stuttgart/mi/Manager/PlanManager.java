package de.hdm_stuttgart.mi.Manager;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Model.Human.Tourist;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Model.Things.Plan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class PlanManager {


    ArrayList<Plan> plans = new ArrayList<>();


    public ArrayList<Plan> showPlan (){
        Tourist tourist = new Tourist();
        for (LocalOffer offer : tourist.getWishList()){
            Plan plan = new Plan();
            plan.setTodo(offer.getDescription());
            plan.setDate(offer.getDate());
            plans.add(plan);
        }
        return plans;
    }

    public void deletePlan(int index){
        plans.remove(index-1);
    }
}
