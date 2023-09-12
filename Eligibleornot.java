import java.util.Scanner;

public class Eligibleornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (age>18) {
            System.out.println("You are Eligible for Vote");
        } else if (age<18) {
            System.out.println("You are not Eligible for Vote");
        } else {
            System.out.println("You can apply for your voter ID !");
        } 
    }
}
