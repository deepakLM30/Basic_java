package com.company;

import java.util.Scanner;

public class Conditional_Statement {
    public void positive_or_negative(int number){
        if (number >=0){
            System.out.printf("%d is positive number.",number);
        }
        else {
            System.out.printf("%d is negative number",number);
        }
    }
    //create the method for solve the quadratic equation
    public void quadratic_equation_solve(){
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.println("\nEnter the value of a , b and c:");
        System.out.printf("A:\t");
        a = scan.nextDouble();
        System.out.println(a);
        System.out.printf("\nB:\t");
        b = scan.nextDouble();
        System.out.printf("\nC:\t");
        c = scan.nextDouble();
        double sq =Math.pow(b,2.0) - (4.0 * a * c);
        System.out.println(sq);
        if (sq>0.0){
            //it has two real roots
            double x = (-b + Math.pow(sq,0.5))/(2.0 * a);
            System.out.println("x:\t"+x);
            double y = (-b- Math.pow(sq,0.5))/(2.0 * a);
            System.out.println("y:\t"+y);
        }
        else if(sq == 0.0){
            //it has one roots
            double y = -b/(2.0*a);
            System.out.println("y:\t"+y);
        }
        else {
            System.out.printf("It does not have any real roots.");
        }
    }
    public void float_check_with_three_decimals(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        float x = scan.nextFloat();
        System.out.println("Enter second number:");
        float y = scan.nextFloat();
    }
    public static void main(String[] args) {
        Conditional_Statement obj_cs = new Conditional_Statement();
//        obj_cs.positive_or_negative(45);
        obj_cs.quadratic_equation_solve();
    }
}