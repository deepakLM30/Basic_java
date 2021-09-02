package com.company;
//this keyword is used  to refer to the current object in a method or constructor
//it's help to differ between class attributes and parameters with same name
class Employees{
    int salary;// attributes of this class employee
    //let's create a constructor of this Employees class with salary parameters
    public Employees(int salary){
        this.salary = salary;//here this.salary refers attributes of Employees class not parameters of constructors
    }

    public int getSalary() {
        return salary;
    }
}
public class UseThis {
    public static void main(String[] args) {
        Employees emo = new Employees(5000);
        System.out.println( emo.getSalary());
    }
}
