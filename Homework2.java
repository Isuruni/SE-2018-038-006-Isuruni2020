package com.Pramodhi;

public class Homework2 {

}

class A{
    A(){
        int n=1;
    }
    static String printOut(){

        return "I'm type A";
    }

}
class B extends A{
   int n=2;
    static String printOut(){
        
        return "I'm type B";
    }

}
class C{
    public static void main(String[] args) {
        B instance1= new B();
        B instance2 =new B();

        System.out.println(instance1);
        System.out.println(A.printOut());
        System.out.println(B.printOut());
    }
}

