package ru.babakov.api.homework;

import java.util.*;

public class APIHomework
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Nekrasov");
        Person p2 = new Person("Romanov");
        Person p3 = new Person("Aleksandrov");
        Person p4 = new Person("Sechenov");
        Person p5 = new Person("Pavlov");

        String[] phoneNumbers = {
                "8(915)5728911",
                "8(916)9326712",
                "8(983)8923617",
                "8(985)9587210",
                "8(916)2389013",
                "8(975)7348315",
                "8(995)9326177",
                "8(914)8734381",
                "8(985)9515719",
                "8(957)3712893",
                "8(993)6347811",
                "8(979)9895710",
                "8(916)8823962"
        };

        p1.AddPerson(phoneNumbers[5]);
        p1.AddPerson(phoneNumbers[2]);
        p5.AddPerson(phoneNumbers[11]);
        p2.AddPerson(phoneNumbers[3]);
        p3.AddPerson(phoneNumbers[7]);
        p2.AddPerson(phoneNumbers[1]);
        p5.AddPerson(phoneNumbers[4]);
        p4.AddPerson(phoneNumbers[0]);
        p2.AddPerson(phoneNumbers[6]);
        p5.AddPerson(phoneNumbers[10]);
        p4.AddPerson(phoneNumbers[9]);
        p4.AddPerson(phoneNumbers[12]);
        p5.AddPerson(phoneNumbers[8]);

        HashMap<Person, List<String>> phoneList = new HashMap<>();
        phoneList.put(p1, p1.phoneNumber);
        phoneList.put(p2, p2.phoneNumber);
        phoneList.put(p3, p3.phoneNumber);
        phoneList.put(p4, p4.phoneNumber);
        phoneList.put(p5, p5.phoneNumber);

        TreeMap<Person, List<String>> phoneBook = new TreeMap<>(new PersonComparator());
        phoneBook.putAll(phoneList);

        for (Map.Entry<Person, List<String>> elem : phoneBook.entrySet()){
            System.out.printf(elem.getKey() + ":\n");
            for (String str : elem.getValue()){
                System.out.println("\t" + str);
            }
        }
    }
}
