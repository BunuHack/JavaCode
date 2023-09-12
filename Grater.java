import java.util.Scanner;

public class Grater {
    public static void gratest (int a, int b){
        if (a>b) {
            System.err.println(a+" is grater");
        } else {
            System.out.println(b+" is grater");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numebrs :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gratest(a, b);
    }
}

