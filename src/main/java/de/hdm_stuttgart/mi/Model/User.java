package de.hdm_stuttgart.mi.Model;

public abstract class User {
    private String name;
    private int age;
    private String address;
    private String city;

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



}
