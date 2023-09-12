import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.naming.event.NamingExceptionEvent;

public class Takingmarks {
    public static void main(String[] args) {
        System.out.println("Enter Your marks ");
        Scanner sc = new Scanner(System.in);

        int input;

     do {

        int marks = sc.nextInt();
        
    if (marks>=90 && marks<=100) {
            System.out.println("This is good");
    } else if (marks>=60 && marks<=89) {
            System.out.println("This is also good ");
    } else if (marks>=1 && marks<=59){
            System.out.println("This is good as well");
    }else {
            System.out.println("Invalid choice !");
    }
        System.out.println("Enter 1 for continue and 0 for exit");
        input = sc.nextInt();
   } while (input==1);

        
    }
}
