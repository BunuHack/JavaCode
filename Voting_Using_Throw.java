import java.util.Scanner;

class YoungerAgeException extends RuntimeException{

    YoungerAgeException (Sting msg){
        super(msg);
    }
}



public class Voting_Using_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
         if (age <= 18) {
            throw new YoungerAgeException("You Are Not Eligible For Vote ");
         } else {
            System.out.println("You Are Eligible For Vote ");
         }
    }
}
