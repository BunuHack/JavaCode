import java.util.Scanner;

public class AverageandSum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println(" How Many Number you want Sum and Average : ");
    int n = sc.nextInt();
    int cal[] = new int[n];

    System.out.println("Enter Your Numbers :");
    float sum = 0;
    for (int i = 0; i < cal.length; i++) {
        cal[i] = sc.nextInt();
        sum += cal[i];

    }
    System.out.println();
    System.out.println("The Sum Of Your Number Is "+ (int)sum);
    float avg = sum /n;
    System.out.println("The Average Of Your Number Is "+ avg);
   }
}
