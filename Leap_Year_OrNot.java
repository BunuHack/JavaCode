import java.util.Scanner;

public class Leap_Year_OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year :");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year +" Is a Leap Year !");
        } else {
            System.out.println(year +" Is a Non-Leap Year ");
        }
    }
}
