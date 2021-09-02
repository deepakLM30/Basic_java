package com.company;
//super keyword uses
//first it is used to access the data member of superclass from subclass if they have same data member.
// second it is used to access the method of superclass from subclass if they have same method.
//third it's used to call the parent class constructor
//first
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    public void printColor(){
        System.out.println(color);//display color of class Dog
        System.out.println(super.color);//display color of class Animals
    }
}

//second
//first create Car class with one method run
class Car {
    public void run(){
        System.out.println("Car can run fast.");
    }
}
class Bmw extends Car{ // inherit a class Bmw form superclass(car)
    //it's has two method run() and color()
    public void run(){//method override
        System.out.println("BMW can run fast.");
    }
    public void color(){
        System.out.println("Car can be different color.");
    }
    //combine both method one is from class car and another is class Bmw
    public void work(){
        super.run();
        color();
    }
}
//third
//first create class A
class A{
    //create class constructor
    public A(){
        System.out.println("I'm a class A with value 0");
    }
}
//create class B by inherited class A
class B extends A{
    // Constructor B
    public B( int x){
        //call the constructor of Class A
        super();
        System.out.println("I'm a Class B with value "+x);
    }
}
class C extends B{

    public C(int x, int y) {
        super(x);
        System.out.println("I'm a class C with value "+y);
    }
}
/* Note: if there are constructor of super and subclass with same parameter,
 it is not mandatory to use supper keyword, constructor will call automatically from subclass.
 super() keyword is added by compiler automatically.
 */
class X {
    public X(){
        System.out.println("I'm constructor of class X.");
    }
}
class Y extends X{
    public Y(){
        System.out.println("I'm Constructor of class Y.");
    }
}
public class UseSuperKeyword {
    public static void main(String[] args) {
//        Bmw bo = new Bmw();
//        bo.work();
//        C co = new C(45,36);
        Y yoj = new Y();
    }
}
