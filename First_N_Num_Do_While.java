import java.util.Scanner;
///Using Do-while Loop 
public class First_N_Num_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        System.out.println("First "+ n +" Number Is :");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=n);
    }
}
