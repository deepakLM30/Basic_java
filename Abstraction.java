package com.company;
//using abstract class
abstract class Abs_first{
    abstract public void name();
    abstract public void age();
    public void eat(){
        System.out.println("I'm eating.");
    }
}
class ABC extends Abs_first{
    @Override
    public void name(){
        System.out.println("Deepak Sharma");
    }
    @Override
    public void age(){
        System.out.println(45);
    }
}
// use interface
interface Employee_info{
    void name();
    void age();
    void contact();
}
interface Payment_info{
    void occupation();
    void salary();
}
class Employee_details implements Employee_info, Payment_info{

    @Override
    public void name() {
        System.out.println("Deepak Sharma");
    }

    @Override
    public void age() {
        System.out.println(22);
    }

    @Override
    public void contact() {
        System.out.println("9840459818");
    }

    @Override
    public void occupation() {
        System.out.println("Software Engineer.");
    }

    @Override
    public void salary() {
        System.out.println("500000");
    }
    public void happy(){
        System.out.println("I'm happy.");
    }
}
public class Abstraction {
    //Abstraction is process of hiding the implementation
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.name();
        abc.age();
        abc.eat();

        Employee_details ed = new Employee_details();
        ed.name();
        ed.age();
        ed.contact();
        ed.occupation();
        ed.salary();
        ed.happy();
    }
}
