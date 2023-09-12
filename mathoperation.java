import java.util.Scanner;

public class mathoperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your number for given operation :\n 1 (addition)\n 2 (substraction)\n 3 (multiplication)\n 4 (Division)\n 5 (modulo)\n ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("The addition of two number is "+(a+b));
                break;
            case 2:
                System.out.println("The Substraction of two number is "+(a-b));
                break;
            case 3:
                System.out.println("The Multiplication of two number is "+(a*b));
                break;
            case 4:
                System.out.println("The Division of two number is "+(a/b));
                break;
            case 5:
                System.out.println("The Modulo of two number is "+(a%b));
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
        
    }
}
