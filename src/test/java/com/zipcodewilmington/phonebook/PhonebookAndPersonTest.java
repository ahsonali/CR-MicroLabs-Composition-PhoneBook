package com.zipcodewilmington.phonebook;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Map;
import java.util.TreeMap;


import org.junit.Test;

public class PhonebookAndPersonTest {

    PhoneBook testPhoneBook;

    @Before
    public void setup () {
        testPhoneBook = new PhoneBook();
    }





    @Test
    public void addPersonTest1()
    {
        new Person("Kevin", "5758541235");
        testPhoneBook.addPerson("Kevin", "5758541235");
        String testNumber = testPhoneBook.lookupList("Kevin");
        Assert.assertTrue(testNumber.equals("[5758541235]"));
    }

    @Test
    public void addPersonTest2()
    {
        new Person("Eric", "9798542457");
        testPhoneBook.addPerson("Eric", "9798542457");
        String testNumber = testPhoneBook.lookupList("Eric");
        Assert.assertFalse(testNumber.equals("[9798548471]"));


    }

    @Test
    public void removeTest1(){
        testPhoneBook.addPerson("Tommy", "8542168741");
        testPhoneBook.addPerson("Rocky", "8745219874");
        testPhoneBook.removePerson("Tommy");
        String testNumber = testPhoneBook.lookupList("Rocky");
        Assert.assertNotEquals(null, testNumber );
    }

    @Test
    public void removeTest2(){
        testPhoneBook.addPerson("Bill", "8542168542");
        testPhoneBook.addPerson("Ricky", "2541238574");
        testPhoneBook.removePerson("Ricky");
        String actual = testPhoneBook.listNamesOnly();
        Assert.assertTrue(actual.equals("Bill\n"));

    }

    @Test
    public void reverseLookUpTest1()
    {
        testPhoneBook.addPerson("James", "4847165522");
        String testNumber = testPhoneBook.reverseLookUp("4847165522");
        Assert.assertTrue(testNumber.equals("James"));
    }

    @Test
    public void reverseLookUpTest2()
    {
        testPhoneBook.addPerson("Jake", "8574125557");
        testPhoneBook.addPerson("Paul", "7412579651");
        testPhoneBook.myTreeMap.get("Paul").addNumbers("8512125547");
        String testNumber = testPhoneBook.reverseLookUp("8512125547");
        Assert.assertTrue(testNumber.equals("Paul"));

    }

    @Test
    public void reverseLookUpTest3()
    {
        testPhoneBook.addPerson("Tim", "5214856532");
        testPhoneBook.addPerson("John", "2679412351");
        testPhoneBook.myTreeMap.get("John").addNumbers("2679412355");
        String testNumber = testPhoneBook.reverseLookUp("2679418888");
        Assert.assertFalse(testNumber.equals("John"));
    }

    @Test
    public void listNamesOnly1()
    {
        testPhoneBook.addPerson("Melanie", "8542218694");
        testPhoneBook.addPerson("Mark", "741254857 4");
        testPhoneBook.addPerson("Will", "8524678551");
        String actual = testPhoneBook.listNamesOnly();
        String expected = "Mark\nMelanie\nWill\n";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void listNamesOnly2()
    {
        testPhoneBook.addPerson("Kate", "5474155558");
        testPhoneBook.addPerson("Brian", "7851257777");
        testPhoneBook.addPerson("Daron", "8547222878");
        String actual = testPhoneBook.listNamesOnly();
        String expected = "Kate\nBrian\nBaron";
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void listNamesWithNumbers1()
    {
        testPhoneBook.addPerson("Dame", "5248526397");
        testPhoneBook.addPerson("John", "8574123659");
        testPhoneBook.addPerson("Vin", "3642596584");
        String actual = testPhoneBook.listNamesWithNumbers();
        String expected = "Dame: [5248526397]\nJohn: [8574123659]\nVin: [3642596584]\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listNamesWithNumbers2()
    {
        testPhoneBook.addPerson("Dame", "5248526397");
        testPhoneBook.addPerson("John", "8574123659");
        testPhoneBook.addPerson("Vin", "3642596584");
        String actual = testPhoneBook.listNamesWithNumbers();
        String expected = "Dame: [5248526397]\nJohn: [8574123659]\nWill: [3642596584]";
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void addMoreThanOneNumber1()
    {
        testPhoneBook.addPerson("Amy", "8542003695");
        testPhoneBook.addPerson("Rachel", "7415448521");
        testPhoneBook.addPerson("Brittany", "4102553674");

        testPhoneBook.myTreeMap.get("Amy").addNumbers("9008760987");
        testPhoneBook.myTreeMap.get("Amy").addNumbers("9008765678");

        String actual = testPhoneBook.listNamesWithNumbers();
        String expected = "Amy: [8542003695, 9008760987, 9008765678]\nBrittany: [4102553674]\nRachel: [7415448521]\n";
        Assert.assertEquals(expected,actual);



    }

    @Test
    public void addMoreThanOneNumber2()
    {
        testPhoneBook.addPerson("Allen", "8547159658");
        testPhoneBook.addPerson("Bill", "7411452369");
        testPhoneBook.addPerson("Kyle", "6523695821");

        testPhoneBook.myTreeMap.get("Allen").addNumbers("584254854");
        testPhoneBook.myTreeMap.get("Allen").addNumbers("7496358264");

        String actual = testPhoneBook.listNamesWithNumbers();
        String expected = "Allen: [8547159658, 5842544854, 7496358567]\nBill: [7411452369]\nKyle: [6523695821]\n";
        Assert.assertNotEquals(expected,actual);


    }

    @Test
    public void removeANumber1()
    {
        testPhoneBook.addPerson("Ahson", "6154536541");
        testPhoneBook.addPerson("Ralph", "5437866789");
        testPhoneBook.addPerson("Colin", "8767890978");

        testPhoneBook.myTreeMap.get("Colin").addNumbers("9089908987");
        testPhoneBook.myTreeMap.get("Colin").addNumbers("5458907689");
        testPhoneBook.myTreeMap.get("Colin").removeNumbers("8767890978");

        String actual = testPhoneBook.listNamesWithNumbers();
        String expected = "Ahson: [6154536541]\nColin: [9089908987, 5458907689]\nRalph: [5437866789]\n";
        Assert.assertEquals(expected,actual);


    }


    }









    //





