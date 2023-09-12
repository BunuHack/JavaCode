import java.util.Scanner;

public class Pass_Or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Physics : ");
        float m1 = sc.nextFloat();

        System.out.println("Enter Your Math : ");
        float m2 = sc.nextFloat();

        System.out.println("Enter Your English : ");
        float m3 = sc.nextFloat();

        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if (avg >= 40 && m1 >=33 && m2 >=33 && m3>=33) {
            System.out.println("Congratulation You Are Pass ");
        } else {
            System.out.println("Sorry ! You Are Fail ");
        }
    }
}
