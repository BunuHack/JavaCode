import java.util.Scanner;
//Geeks for Geeks Exercise.
public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Intiger : ");
        int a = sc.nextInt();
        System.out.println("Enter a Float : ");
        float b = sc.nextFloat();
        System.out.println("Enter a Long  : ");
        long c = sc.nextLong();
        System.out.println("Enter a Byte : ");
        byte d = sc.nextByte();
        System.out.println("Enter a String : ");
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("Your Output Is :");
        System.out.println(a);  
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
}
