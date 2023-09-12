import java.util.Scanner;


public class AddtionusingFunction {
    public static int calculateSum(int a,int b) {
        // int sum = a+b;
        // return sum;

        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your first number :");
        int a = sc.nextInt();

        System.out.println("Enter your second number :");
        int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println("The sum is :"+sum);

        System.out.println("The sum is "+ calculateSum(a, b));
    }
}
