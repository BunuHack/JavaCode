
//  class Add {

//     public static void main(String args[]) {
//         int a=10,b=8,sum=0;
//         sum = a + b;
//         System.out.println("The addition of two number is"+sum);
//     }
// }

import java.util.*;

public class Add {

    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The addtion of two number is "+(a+b));
        
    }
}