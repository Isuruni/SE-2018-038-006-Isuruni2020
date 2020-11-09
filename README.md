# SE-2018-038-006-Isuruni2020
package com.Pramodhi;

public class MyGame {
    public static void main(String[] args) {
        Worrior worrior01=new Worrior("worrior1",50);
        System.out.println("worrior1");
        System.out.println(50);

        Worrior worrior02=new Worrior ("worrior2",100);
        System.out.println("worrior2");
        System.out.println(100);
        Monster monster=new Monster("monster",150);
        System.out.println("monster");
        System.out.println(150);

        worrior01.setAge(worrior01.age);
        System.out.println("Now the age of monster is " + worrior01.setAge(worrior01.age));

        worrior01.walking();
        worrior02.walking();

        monster.stealing(worrior02);

        worrior01.walking();
        worrior02.walking();
    }

}
class Worrior{
    String name;
    int age;
    Boolean stick;

    Worrior(String name,int age) {
        this.name = name;
        this.age = age;
        this.stick = true;
    }
    int setAge(int age){
        this.age=age;
        return this.age;

    }

        void walking() {
            if (this.stick==true) {
                System.out.println(this.name + " is walking with the stick.");
            } else {
                System.out.println(this.name + " has become immobile.");
            }

        }
    }

    class Monster {

        String name;
        int age;

        Monster(String name, int age) {
            this.name = name;
            this.age = age;

        }

        void stealing(Worrior worrior) {


            worrior.stick=false;
            System.out.println(this.name + " has stolen " + worrior.name + "'s walking stick.");


        }
    }
