package de.hdm_stuttgart.mi.Model.Things;

import de.hdm_stuttgart.mi.Model.Human.Local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalOffer {
    private String name;
    private String city;
    private String description;
    private Date date;
    private String time;
    private String equipment;
    private int numberofPeople;
    private Local local;

  //  public LocalOffer (String name, String city, String desc, String time, String equip, int numberofpeople){
       // this.name = name;
    //}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public int getNumberofpeople() {
        return numberofPeople;
    }

    public void setNumberofpeople(int numberofpeople) {
        this.numberofPeople = numberofpeople;
    }

    @Override
    public String toString() {
        return getName()+ " " + getCity()+" " + getDescription()+" "+getDate()+" "+ getEquipment();
    }
}
