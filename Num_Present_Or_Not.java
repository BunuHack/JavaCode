
//Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class Num_Present_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Size :");
        int size= sc.nextInt();
        System.out.println("Enter Your Marks :");
        int marks [] = new int[size];

        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Your Entered Marks Are :");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println(" ");

        System.out.println("Enter a number to check present or not in array :");
        int n = sc.nextInt();

        //Using for loop
        boolean Check = false;
        for (int i = 0; i < marks.length; i++) {
            if (n == marks[i]) {
                Check = true;
                break;
            } 
        }
        if (Check) {
            System.out.println("Present in Array ");
            
        } else {
            System.out.println("Not Present in Array ");
        }


        //Using for-each loop 
        //     boolean check = false;
        //     for (int i : marks) {
        //         if (n == marks[i]) {
        //             check = true;
        //             break;
        //         }
        //     }
        //     if (check) {
        //     System.out.println("Present in Array ");
            
        //    } else {
        //     System.out.println("Not Present in Array ");
        //    } 


    }
}
