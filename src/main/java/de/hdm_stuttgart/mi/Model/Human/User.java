package de.hdm_stuttgart.mi.Model.Human;

import de.hdm_stuttgart.mi.Model.Human.IUserActions;
import de.hdm_stuttgart.mi.Model.Things.Bag;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class User implements IUserActions {
    int userNumber;
    private String name;
    private int age;
    private String address;
    private String city;
    private String Email;

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
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
    public void addtoPlan(List retList, int index) {

    }

    @Override
    public void addBag() {
        Bag bag = new Bag();
        LinkedList<Bag> baglist = new LinkedList<>();
        baglist.add(bag);

    }

    @Override
    public void checkPlan() {

    }

    @Override
    public void checkBag() {


    }
}
