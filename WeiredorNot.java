import java.util.Scanner;

public class WeiredorNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int n = sc.nextInt();
        if (n%2 == 1) {
            System.out.println("Weired");
        } else {
            if (n>=2 && n<=5) {
                System.out.println("Not Weired");
            } else if (n<=20) {
                    System.out.println("Weird");
                } else {
                   System.out.println("Not Weird");
                }
            
        }
    }
}