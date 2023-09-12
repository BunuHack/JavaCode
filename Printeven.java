import java.util.Scanner;

public class Printeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        System.out.println("The even numbers are ");
        for (int i = 2; i <= n; i=i+2) {
            System.out.println(i);
        }

         
    //    for(int i=1; i<=n; i++) {
    //     if(i % 2 == 0) {
    //         System.out.println(i);
    //     }
    //}

    }
    
}
