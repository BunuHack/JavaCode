import java.util.Scanner;

public class Numberpyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers :");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //Palindromic Pattern

        // for (int i = 1; i <=n; i++) {
        //     for (int j = i; j <= n-1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j >=1; j--) {
        //         System.out.print(j );
        //     }
        //     for (int j2 = 2; j2 <=i; j2++) {
        //         System.out.print(j2 );
        //     }
        //     System.out.println();
        // }
    }
}
