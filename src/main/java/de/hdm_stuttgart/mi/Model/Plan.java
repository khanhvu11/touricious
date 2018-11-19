package de.hdm_stuttgart.mi.Model;

import java.sql.Time;
import java.util.Date;
import java.util.TimerTask;

public class Plan extends TimerTask {

    Date date;
    String todo;
    Time time;

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

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void UserNoti (){
        System.out.println("next stop is");
    }

    @Override
    public void run() {

    }
}
