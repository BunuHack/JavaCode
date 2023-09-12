import java.util.Scanner;

public class printingNUsingRecursion {

    public static void printingNum(int n , int x){
        if (n==x+1) {
            return ;
        }
        System.out.println(n);
        printingNum(n+1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number :");
        int x = sc.nextInt();
        int n = 1;
        System.out.println("Acending printing numbers are :");
        printingNum(n, x);
    }


    // public static void printingNum(int n , int x){
    //     if (n==0) {
    //         return ;
    //     }
    //     System.out.println(n);
    //     printingNum(n-1, x);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your number :");
    //     int x = sc.nextInt();
    //     int n = x;
    //     System.out.println("Dcending printing numbers are :");
    //     printingNum(n, x);
    // }e4rdfc
        
}
