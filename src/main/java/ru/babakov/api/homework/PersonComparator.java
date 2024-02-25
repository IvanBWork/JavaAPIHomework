package ru.babakov.api.homework;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o2.counter != o1.counter){
            return Integer.compare(o2.counter, o1.counter);
        }
        else {

            return o2.counter;
        }
    }
}
