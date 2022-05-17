package com.haulmont.tc.Afanasevaa.practice;

public class Person {
    private String firstName, lastName;
    private int passportId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
    public Person(){
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(int passportId){
        this.passportId = passportId;
    }
    public Person(String firstName, String lastName, int passportId ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public static void main(String[] args) {

        Person noName = new Person();
        Person vitya = new Person("Vitya", "Честников");
        Person zheka = new Person(123);
        Person manynya = new Person("Мария","Бурова", 2121);


    }

}
