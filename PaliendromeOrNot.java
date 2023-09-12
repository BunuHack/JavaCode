import java.util.Scanner;

public class PaliendromeOrNot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        int c = n;
        int s = 0;
        int r;
        while (n<=0) {
            
            r = n%10;
            s = (s*10)+r;
            n/=10;

        }

        if (n==s) {
            System.out.println("Palendrome Number ");
        } else {
            System.out.println("Not a Palendrome Number ");
        }
    }
}
