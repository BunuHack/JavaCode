import java.util.Scanner;

public class Oddnosuminfun {
    public static int sumoftheOddno(int n){
        
        int sum = 0;
        for (int i = 1; i <=n; i=i+2) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter your Number ");
        int n = sc.nextInt();
        System.out.println("the sum of all odd numbers from 1 to "+n + " are :"+sumoftheOddno(n));

    }
}
