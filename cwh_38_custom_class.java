import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

/**
 * cwh_38_custom_class
 */

 class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My Name Is "+name);
        System.out.println("My Id Is "+id);
    }
    public int getSalary(){  
        return salary;
    }
 }
public class cwh_38_custom_class {

     public static void main(String[] args) {

        Employee bunu = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your ID And Name :");
        bunu.id = sc.nextInt();
        sc.nextLine();
        bunu.name = sc.nextLine();
        bunu.salary = 200;
        bunu.printDetails();
        int salary = bunu.getSalary();
        System.out.println("Salary Is "+salary);
        
        // Employee harry = new Employee(); // Instantiating a new Employee Object
        // Employee john = new Employee(); // Instantiating a new Employee Object

        // // Setting Attributes for Harry
        // harry.id = 12;
        // harry.salary = 34;
        // harry.name = "CodeWithHarry";

        // // Setting Attributes for John
        // john.id = 17;
        // john.salary = 12;
        // john.name = "John Khandelwal";

        // // Printing the Attributes
        // harry.printDetails();
        // john.printDetails();
        // int salary = john.getSalary();
        // System.out.println("Salary "+salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
     }

    
}