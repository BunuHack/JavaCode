import java.util.Scanner;

public class FibUsingRecursion {

    public static void calcFibs(int a, int b, int n){
        if (n==0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        calcFibs(b, c, n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Term What You Want to know :");
        int n = sc. nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Your "+ n + " Terms of Fibonacci Series are : ");
        System.out.println(a );
        System.out.println(b );
        calcFibs(a, b, n-2);

    }
}
