package com.advancex.problem08;

public class Test08 {
    public static void main(String[] args) {
        /*Person maryRose = new Person("MaryRose", -10);
        Person person = new Person();
        person.setLifeValue(100);
        System.out.println(person.getLifeValue());
        person.setLifeValue(-10);*/
        try {
            Person maryRose = new Person("MaryRose", -10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Person person = new Person();
            person.setLifeValue(100);
            person.setLifeValue(-10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}