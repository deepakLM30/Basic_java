package com.company;
class Employee{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    // single inheritance
    static class Deepak extends Employee{
        private int salary;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }
    }
    //Hierarchical inheritance
    static class Suraj extends Employee{
        private int salary;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }
    }
    //multiple inheritance
    /* here a class Deepak is inherit from superclass Employee.
     if now we inherit one class from Deepak this will be multiple inheritance
     */
    static class Me_deeak extends Deepak{
        private int bonus;

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public int getBonus() {
            return bonus;
        }
    }
    static class Me_ranjit extends Me_deeak{
        private float tax;

        public void setTax(float income) {
            float tax = (income * 13)/100;
            this.tax = tax;
        }
        public float getTax(){
            return tax;
        }
    }
}
public class Inheritance {
    public static void main(String[] args) {

        //lets create object of class Deepak
        Employee.Deepak myobj = new Employee.Deepak();
        myobj.setAge(25);
        myobj.setSalary(500000);
        myobj.setName("Deepak Sharma");
        System.out.println("\nName:\t"+myobj.getName());
        System.out.println("Age:\t"+myobj.getAge());
        System.out.println("Salary:\t"+myobj.getSalary());

        Employee.Suraj meSuraj = new Employee.Suraj();
        meSuraj.setSalary(600000);
        meSuraj.setName("Suraj Puri");
        meSuraj.setAge(23);
        System.out.println("\nName:\t"+meSuraj.getName());
        System.out.println("Age:\t"+meSuraj.getAge());
        System.out.println("Salary:\t"+meSuraj.getSalary());

        //lets create a obj of Me_deepak
        Employee.Me_deeak myd = new Employee.Me_deeak();
        myd.setBonus(3600);
        myd.setAge(25);
        myd.setSalary(500000);
        myd.setName("Deepak Sharma");
        System.out.println("\nName:\t"+myd.getName());
        System.out.println("Age:\t"+myd.getAge());
        System.out.println("Salary:\t"+myd.getSalary());
        System.out.println("Bonus:\t"+myd.getBonus());

        //create a object of class Me_ranjit
        Employee.Me_ranjit rs = new Employee.Me_ranjit();
        rs.setAge(63);
        rs.setName("Ranjit Shrestha");
        rs.setSalary(600000);
        rs.setBonus(30000);
        rs.setTax(rs.getSalary()+rs.getBonus());
        System.out.println("\nName:\t"+rs.getName());
        System.out.println("Age:\t"+rs.getAge());
        System.out.println("Salary:\t"+rs.getSalary());
        System.out.println("Bonus:\t"+rs.getBonus());
        System.out.println("Tax:\t"+rs.getTax());

    }
}