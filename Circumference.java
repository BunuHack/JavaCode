import java.util.Scanner;

public class Circumference {
    public static double calCircumference(double r){
        
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius :");
        int r = sc.nextInt();

        System.out.println("The Circumference is "+calCircumference(r));
    }
}
