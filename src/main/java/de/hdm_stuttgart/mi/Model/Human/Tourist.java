package de.hdm_stuttgart.mi.Model.Human;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Exception.WrongNumberException;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Model.Things.Plan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Tourist extends User {


    private static final Logger log = LogManager.getLogger("writer");

    private ArrayList<LocalOffer> foundList1 = new ArrayList<>();
    private ArrayList<LocalOffer> wishList = new ArrayList<>();
    private ArrayList<Plan> plans = new ArrayList<>();

    public Tourist(){
        super();
    }

    /**
     * finding offers in where he want to go
     * @param city: city he want to come
     */
    public ArrayList<LocalOffer> findingOffer(String city) throws NoCityFoundException{
        ArrayList<LocalOffer> foundList = new ArrayList<>();
        this.foundList1=foundList;
        Local loList = new Local();
        loList.getOfferList().stream()
                .forEach(lo -> {
                    if(lo.getCity().equals(city)){
                        foundList.add(lo);
                    }
                });

        if (foundList.size() == 0){
            log.error("There is no offers in " + city);
            throw new NoCityFoundException(city);
        }
        log.debug(foundList +" found");
        return foundList;
    }

    /**
     * choose which offer he want to buy
     * @param index : index of items in offer list
     */
    public void chooseOffer(int index) throws WrongNumberException {
        if(index > foundList1.size()) {
            log.error("Number is bigger than List size");
            throw new WrongNumberException(foundList1.size());
            }
        else{
            wishList.add(foundList1.get(index - 1));
            log.debug(wishList);}

    }

    public void addOffertoPlan(){
        wishList.stream()
                 .forEach(localOffer -> {
            Plan plan = new Plan();
            plan.setCity(localOffer.getCity());
            plan.setTime(localOffer.getTime());
            plan.setTodo(localOffer.getDescription());
            plan.setDate(localOffer.getDate());
            plans.add(plan);
            log.debug(localOffer + " was added to plan");
        });

    }

    /**
     * adding Plan object to his Plan
     * @param plan : plan object
     */

    public void writePlan(Plan plan){
        plans.add(plan);
        log.debug(plan + " was written");
    }

    /**
     * self-made Plan
     */
    @Override
    public ArrayList<Plan> getPlans() {
        log.debug("Plan is shcwn");
        return plans;
    }

    public void deletePlan(int index){
        plans.remove(index-1);
        log.debug(plans.toString());

    }

    @Override
    public String toString() {
        return super.getName() +"\n"+ super.getAddress()+"\n"+super.getCity();
    }
}
