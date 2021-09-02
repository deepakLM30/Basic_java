package com.company;

import java.util.Scanner;
//first create a Marks class and method to get marks from user:
class Marks{
    public float marks_of_subject(){
        float marks ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total marks of five subject:");
        marks = scan.nextFloat();
        return marks;
    }
}
class Percentage extends Marks{
    public float percentage(){
        // get the marks from Marks class
        float marks = super.marks_of_subject();
        float per = (marks /500)*100;
        return per;
    }
}
class Gpa extends Percentage{
    public void gpa(){
        float per =  super.percentage();
        float g_p_a = per /25;
        System.out.println("Percentage:\t"+per +"%");
        System.out.println("Gpa:\t"+g_p_a);
    }
}
public class UseSuperKeyword1 {
public static void main(String[] args) {
        Gpa gpo = new Gpa();
        gpo.gpa();
    }
}