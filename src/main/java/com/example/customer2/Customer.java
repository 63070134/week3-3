package com.example.customer2;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;
    public Customer(){
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }

    public Customer(String ID, String name, boolean sex, int age) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        if(age < 0){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
