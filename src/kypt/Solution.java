package kypt;

import java.util.Objects;

class Person {
    public String name;
    protected String address;
    boolean isFriendly;
    private int phoneNumber;
    static int personCount = 0;

    private static void increasePersonCount() {
        Person.personCount += 1;
    }

    Person(String name, String address, boolean isFriendly, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.isFriendly = isFriendly;
        this.phoneNumber = phoneNumber;
        Person.increasePersonCount();
    }

    public void sayHi() {
        System.out.println("Hi, i am " + name);
    }

    public boolean haveManyFriends() {
        if (this.isFriendly) return true;
        return false;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name+", "+this.address+", "+((this.isFriendly)?"very friendly, ":"not much friendly, ")+"phone number: "+Objects.toString(this.phoneNumber);
    }
}

public class Solution {
    public static void main(String[] args) {
        Person me = new Person("kypt", "VietNam", true, 1804);
        Person myDad=new Person("VanDoaiPhan","VietNam",false,1603);
        System.out.println(me.toString());
        System.out.println(myDad.toString());
        System.out.println("Amount person already created: "+Person.personCount);
    }
}