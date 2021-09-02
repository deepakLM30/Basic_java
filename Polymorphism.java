package com.company;
class SmartPhone{
    public void phone(){
        System.out.println("Phone has different ringtones.");
    }
}
class Camera extends SmartPhone{
    public void phone(){
        System.out.println("Phone can take a photos.");
    }
}
class Music extends SmartPhone{
    public void phone(){
        System.out.println("Music can play in smartphone.");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        SmartPhone spo = new SmartPhone();
        Camera cmo = new Camera();
        Music mo = new Music();
        spo.phone();
        cmo.phone();
        mo.phone();
    }
}
