package ru.babakov.api.homework;

import java.util.ArrayList;

public class Person
{
    String name;

    ArrayList<String> phoneNumber = new ArrayList<>();

    int counter;

    public void AddPerson(String phoneNum){
        phoneNumber.add(phoneNum);
        counter++;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public  String toString(){
        return name;
    }
}
