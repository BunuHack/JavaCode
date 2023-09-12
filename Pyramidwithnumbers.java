import java.util.Scanner;

public class Pyramidwithnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers :");
        int n = sc.nextInt();
        System.out.println("The pyramid is :");


        //Half Pyramid with Numbers

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(j+" ");
        //     }System.out.println(" ");
        // } 


        //Inverted Half Pyramid with Numbers 

        // for (int i = n; i >=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Floyd's Triangle

        // int number = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(number+"  ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //0-1 Triangle

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
 
    }
}

