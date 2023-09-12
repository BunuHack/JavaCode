import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Tableprintinfun {
    public static void printingTable (int n){

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * "+ i +" = "+ n*i);
            
            // Also we can use those format specifier --->
            // System.out.printf("%d * %d = %d\n ",n , i , n*i);
            // System.out.format("%d * %d = %d\n ",n , i , n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        System.out.println("The multiplication table is ");
        printingTable(n);
    }
}
