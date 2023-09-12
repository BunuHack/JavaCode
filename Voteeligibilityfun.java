import java.util.Scanner;

public class Voteeligibilityfun {
    public static void eligiblityTest(int age){
        if (age>=18 && age <= 100) {
            System.out.println("Eligible for vote ");
        } else {
            System.out.println("Not Eligible for vote ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        
        eligiblityTest(age);


    }
}
