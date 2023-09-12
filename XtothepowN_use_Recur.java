import java.util.Scanner;

public class XtothepowN_use_Recur {
    // Print x^n (with stack height = n)
// public static int calcpow(int x, int n){

//     if (n == 0){
//         return 1;
//     }
//     if(x == 0){
//         return 0;
//     }

//     int X_ = calcpow(x, n-1);
//     int Xn_ = x * X_;

//     return Xn_;
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter X and N :");
//         int x = sc. nextInt();
//         int n = sc. nextInt();

//             int output =calcpow(x, n);
//             System.out.println("The "+x +" to the power "+n + " is : "+output);


// Print x^n (with stack height = logn)
public static int calcpow(int x, int n){

        if (n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
    if (n%2==0) {

       return calcpow(x, n/2) * calcpow(x, n/2);

    } else {

       return calcpow(x, n/2) * calcpow(x, n/2) * x;
        
    }

    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter X and N :");
            int x = sc. nextInt();
            int n = sc. nextInt();
    
                int output =calcpow(x, n);
                System.out.println("The "+x +" to the power "+n + " is : "+output);

    }
}
