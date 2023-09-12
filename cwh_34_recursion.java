import java.util.Scanner;

public class cwh_34_recursion {
    
    // static void fun2(int n){
    //         if(n>0){
    //             fun2(n-1);
    //             System.out.println(n);
    //         }
    // }
    
    // public static void main(String[] args){
    //         int n = 3;
    //         fun2(n);
    // }
    
    

    //     static void fun2(int n){
    //         if(n>0){
    //             System.out.println(n);
    //             fun2(n-1);
    //         }
    // }
    
    
    // public static void main(String[] args){
    //         int n = 3;
    //         fun2(n);
    // }
    

    // Quick Quiz: Write a program to calculate (recursion must be used) factorial of a number in Java?
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number Which You Want To Know Factorial :");
        int x = sc.nextInt();
        System.out.println("The value of factorial "+ x +" is : " + factorial(x));
        System.out.println();
        System.out.println("The value of factorial " + x +" In Iterative Method is : " + factorial_iterative(x));
    }

    
}
