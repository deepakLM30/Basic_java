package com.company;
import java.util.*;
class Base{
    Base(){
        System.out.println("I'm a constructor of base class.");
    }
    //create a constructor overloading
    Base(int x){
        System.out.println("I'm a overloading constructor of class Base with value "+x);
    }
    static class Derived extends Base{
        Derived(){
            System.out.println("I'm a Constructor of Derived class");
        }
        Derived(int x,int y){
            super(x);
            System.out.println("I'm a overloading constructor of Derived class with value "+y);
        }
    }
    static class Child_derived extends Derived{
        Child_derived(){
            System.out.println("I'm a constructor of Child_derived class.");
        }
        Child_derived(int x ,int y,int z){
            super(x,y);//transfer value of x and y above constructor Derived(int x,int y)
            System.out.println("I'm a overloading constructor of Child_derived class with value "+z);
        }
    }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Base.Child_derived cd = new Base.Child_derived( 45,36,74);

    }
}