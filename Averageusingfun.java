import java.util.Scanner;

public class Averageusingfun {
    
    public static float averageCal (float a, float b, float c){
        float average = (a+b+c)/3;
        return average;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();

        System.out.println("The average is :" + averageCal(a, b, c));
        
    }
}
