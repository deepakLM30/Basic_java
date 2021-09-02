package com.company;
class Cylinder {
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void cylinder() {
        double surface = 2 * Math.PI * radius * (height + radius);
        double volume = Math.PI * Math.sqrt(radius) * height;
        System.out.println("Surface area of cylinder:\t" + surface);
        System.out.println("Volume of cylinder:\t" + volume);

    }

    public Cylinder() {
        this.height = 12;
        this.radius = 9;
    }
}
class Rectangle{
    private int length;
    private int breath;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getBreath() {
        return breath;
    }

    public Rectangle(){
        this.length = 4;
        this.breath= 5;
    }
    public Rectangle(int r_length,int r_breath){
        this.length = r_length;
        this.breath = r_breath;
    }
}
public class Access_Modifier {
    public static void main(String[] args) {
        //create the object of class of cylinder
        Cylinder myCylinder = new Cylinder();
//        System.out.println(myCylinder.getHeight());
//        System.out.println(myCylinder.getRadius());
//        myCylinder.setRadius(5);
//        System.out.println(myCylinder.getRadius());
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
        Rectangle myRectangle = new Rectangle(45,63);
        System.out.println(myRectangle.getBreath());
        System.out.println(myRectangle.getLength());

    }
}