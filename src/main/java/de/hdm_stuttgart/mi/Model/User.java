package de.hdm_stuttgart.mi.Model;

public class User implements IUserActions {
    private String name;
    private int age;
    private String address;
    private String city;
    private String Email;

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
    public void addPlan() {

    }

    @Override
    public void addBag() {

    }

    @Override
    public void checkPlan() {

    }

    @Override
    public void checkBag() {

    }
}
