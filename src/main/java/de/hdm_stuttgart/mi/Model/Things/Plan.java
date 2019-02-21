package de.hdm_stuttgart.mi.Model.Things;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

public class Plan  {

    private String city;
    private Date date = new Date();
    private String todo;
    private String time;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }


    @Override
    public String toString() {
        return getCity()+ " " + getDate()+ " " + getTime()+ " " +getTodo();
    }
}
