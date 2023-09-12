import java.util.Scanner;

public class Oddevenusingfun {
    public static void calculateEvenOdd (int n){
        if (n%2==0) {
            System.out.println("Your number is Even ");
        } else {
            System.out.println("Your number is Odd ");
        }               
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        calculateEvenOdd(n);
    }
}


