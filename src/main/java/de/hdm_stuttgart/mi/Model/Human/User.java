package de.hdm_stuttgart.mi.Model.Human;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Exception.WrongNumberException;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Model.Things.Plan;

import java.util.ArrayList;

public class User  {
    private String userName;
    private String name;
    private int age;
    private String address;
    private String city;
    private String Email;
    private ArrayList<LocalOffer> offerList = new ArrayList<>();
    private ArrayList<LocalOffer> foundList = new ArrayList<>();
    private ArrayList<LocalOffer> wishList = new ArrayList<>();
    private ArrayList<Plan> plans = new ArrayList<>();


    /*public User(){
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.Email = Email;
    }*/
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAddress(String address){this.address = address;}

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return getName() +" "+ getAge() +" "+ getAddress()+" "+ getCity() + " "+getEmail();
    }

    public ArrayList<LocalOffer> findingOffer(String city) throws NoCityFoundException{
        return foundList;
    }

    public void chooseOffer(int index) throws WrongNumberException {

    }

    public void addOffertoPlan(){

    }

    public void writePlan(Plan plan){
    }

    public ArrayList<Plan> getPlans() {
        return plans;
    }

    public void deletePlan(int index){
    }


    public void addToOfferList(LocalOffer locOff) {
    }

    public ArrayList<LocalOffer> getOfferList() {
        return offerList;
    }


}
