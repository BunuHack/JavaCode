import java.util.Scanner;

public class SumofNusingRecursion {

    public static void calculateSum(int n , int i , int sum){

        if (i==n) {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        calculateSum(n, i+1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        calculateSum(n, i, sum);
    }


    //  public static void calculateSum(int n , int i , int sum){

    //     if (n==0) {
    //         sum+=n;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=n;
    //     calculateSum(n-1, i, sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your Number :");
    //     int n = sc.nextInt();
    //     int i = n;
    //     int sum = 0;

    //     calculateSum(n, i, sum);
    // }
}
