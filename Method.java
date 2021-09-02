package com.company;

import java.util.Scanner;

public class Method {
    //create a method to count vowel letter in strings.
    public void vowel_count(){
        int count =0;
        String str="aeiou";
        System.out.println("Enter a String:");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        str1.toLowerCase();
        for (int i =0;i<str1.length();i++){
            char ch = str1.charAt(i);
            for (int j = 0;j<5;j++){
                if (ch == str1.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("There are "+ count +" vowel letters in given strings.");
    }
    public void interest_value(){
        float interest ;
        int year;
        float amount=0;
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter a investment amount:");
        amount = scan.nextFloat();
        System.out.println("Enter a number of year:");
        year = scan.nextInt();
        System.out.println("Enter a interest rate:");
        interest = scan.nextFloat();
        System.out.print("Year\t");
        System.out.print("FutureValue\n");
        for (int i = 1; i<= year;i++) {
            float interest_amount = (amount * interest) / 100;
            amount +=interest_amount;
            System.out.println(i+"\t");
            System.out.print("\n"+amount);
        }
    }
    public static void main(String[] args) {
        Method mo = new Method();
        mo.interest_value();
    }
}