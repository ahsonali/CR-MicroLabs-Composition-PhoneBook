package com.zipcodewilmington.phonebook;
import java.util.Set;
import java.util.*;
/**
 * Created by leon on 1/23/18.
 */


public class PhoneBook {

    TreeMap<String, Person> myTreeMap = new TreeMap<String, Person>();

    public PhoneBook(){}

    public void addPerson(String name, String number)
    {

            Person newContactEntry = new Person(name, number);
            myTreeMap.put(name, newContactEntry);


    }




    public void removePerson(String name)
    {
        myTreeMap.remove(name);
    }

    public String lookupList(String name)
    {
        return myTreeMap.get(name).getNumbers();
    }

    public String reverseLookUp(String number)
    {

        for (Map.Entry<String, Person> entry: myTreeMap.entrySet())
        {
            if (entry.getValue().getNumbers().contains(number))
            {
                String keyToValue = entry.getKey();
                return keyToValue;
            }

        }return "This phone number does not exist";

    }

    public String listNamesOnly()
    {
        String list = "";
        Set<String> theKeys = myTreeMap.keySet();

        for (String i: theKeys)
        {
            list += i + "\n";
        }

        return list;

    }

    public String listNamesWithNumbers(){

        String list = "";
        Set<String> theKeys = myTreeMap.keySet();

        for (String key : theKeys){
            list += key + ": " + myTreeMap.get(key).getNumbers() + "\n";
        }

        return list;

    }



}
















