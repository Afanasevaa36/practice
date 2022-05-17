package com.haulmont.tc.Afanasevaa.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class PersonTest {

    public void TestGetterFirstName() {
        SoftAssert softAssert = new SoftAssert();
        Person person = new Person();
        person.setFirstName("Ded");
        person.setLastName("Babka");
        softAssert.assertEquals(person.getFirstName(), "Ded");
        softAssert.assertEquals(person.getLastName(), "Babka");
        softAssert.assertAll();
    }

    /*    public void TestGetterLastName() {
            Person person = new Person();
            person.setLastName("Babka");
            Assert.assertEquals(person.getLastName(), "Babka");
        }*/

}

