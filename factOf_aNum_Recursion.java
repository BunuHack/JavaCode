import java.util.Scanner;

public class factOf_aNum_Recursion {

    public static void calculateFact(int n, int i, int fact){
        if (i==1) {
            System.out.println(fact);
            return;
        }
        fact*=i;
        calculateFact(n, i-1, fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = n;
        int fact = 1;
        calculateFact(n, i, fact);
    }
}
