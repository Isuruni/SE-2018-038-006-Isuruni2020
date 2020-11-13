package com.Pramodhi;

public class Homework {
    public static void main(String[] args) {
    }
}
interface MyInterface {

    MyInterface instance1 = new MyClass();
    static int number = 0;
     static final int  sum=150;

    default void  MyInterface(){
    }

    default void firstMethod() {
        System.out.println("This my first method");
    }
}
class MyClass implements MyInterface {

    @Override
    public void firstMethod() {

    }
}
interface MyInterface1 extends MyInterface{

}
class MyClass1 implements MyInterface1{

}

