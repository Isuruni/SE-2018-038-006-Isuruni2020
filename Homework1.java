package com.Pramodhi;

public class Homework1 {
    public static void main(String[] args) {
    }
}
class MyClass2{
    String   name;
    int age;

    static int mybirthyear;
    static String mycountry;

    void myName(){

        System.out.println("My name is Isuruni");
        this.name=name;
        name= name+ "Hi";
        MyClass2.mybirthyear=2000;


    }
    void myAge(){

        System.out.println("My age is 22");
        age=age +1;
        MyClass2.mycountry="India";
    }

    static void myBirthYear(){

        System.out.println("My birth year is 1998");
        MyClass2.mybirthyear =1998;
        int age=21;
    }

    static void myCountry(){
        System.out.println("My country is Sri lanka");
        MyClass2.mycountry= "Sri Lanka";
        String name="Isuruni";
        
    }
}
