package com.company;

import java.util.Scanner;
    interface Emp{
        Scanner scan = new Scanner(System.in);
        public String name();
        public double salary();
        public String address();
    }
    class Me implements Emp {
        String name;
        double salary;
        String address;
        @Override
        public String name() {
            System.out.println("Enter your name:");
            name = scan.nextLine();
            return name;

        }

        @Override
        public double salary() {
            System.out.println("Enter your salary:");
            salary = scan.nextDouble();
            return salary;

        }

        @Override
        public String address() {
            System.out.println("Enter your address:");
            address = scan.nextLine();
            return address;
        }
    }
public class Interface {
    public static void main(String[] args) {
            Me objme = new Me();
            String name = objme.name();
            double salary = objme.salary();
            String address = objme.address();
            System.out.print("Name:\t" +name);
            System.out.print("\nSalary:\t"+salary);
            System.out.print("\nAddress:\t" +address);
        }
    }
