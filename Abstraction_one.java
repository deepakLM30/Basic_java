package com.company;
interface Plane {
    void name();
    void price();
    void capacity();
}
class PassengerPlane implements Plane{
    @Override
    public void name(){
        System.out.println("Name: Passenger plane.");
    }

    @Override
    public void price() {
        System.out.println("Price: $1M");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: 500 people.");
    }

}
class CargoPlane implements Plane{

    @Override
    public void name() {
        System.out.println("Name: Cargo plane.");
    }

    @Override
    public void price() {
        System.out.println("Price: $1.5M");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: 800 people.");
    }
}
class FighterPlane implements Plane{

    @Override
    public void name() {
        System.out.println("Name: Fighter plane.");
    }

    @Override
    public void price() {
        System.out.println("Price: $2M");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: 100 people.");
    }
}
public class Abstraction_one {
    public static void main(String[] args){
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        pp.name();
        pp.price();
        pp.capacity();

      cp.name();
      cp.price();
      cp.capacity();

      fp.name();
      fp.price();
      fp.capacity();
    }
}
