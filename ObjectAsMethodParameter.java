package com.company;
class First{
    public void name(){
        System.out.println("Name: Deepak Sharma.");
    }
    public void age(){
        System.out.println("Age: 21");
    }
    public void address(){
        System.out.println("Address: Kathmandu");
    }
}
class Seconds {
    public void display(First first){//object in parameter
        first.name();
        first.age();
        first.address();
    }
}
public class ObjectAsMethodParameter {
    public static void main(String[] args) {
        {
            Seconds seconds = new Seconds();
            seconds.display(new First());
        }
    }
}
