import java.util.Scanner;

public class posi_neg_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = sc.nextInt();
        System.out.println("Your entered number is : "+a);
        if (a==0) {
            System.out.println("Your Number is Zero ");
        } else if (a>0) {
            System.out.println("Your Number is Positive ");
        }else{
            System.out.println("Your Number is Negative ");
        }
    }
}
