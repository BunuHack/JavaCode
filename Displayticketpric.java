import java.util.Scanner;

public class Displayticketpric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any of these key to know your ticket prize : B , G , M ");
        char key = sc.next().charAt(0);
        if (key == 'B'|key =='b') {
        System.out.println("Your ticket price is "+200);
            
        } else if(key == 'G'|key =='g'){
        System.out.println("Your ticket price is "+80);
            
        }else if (key == 'M'|key =='m'){
        System.out.println("Your ticket price is "+50);

        }else{
            System.out.println("Invalid Key !");
        }
        
    }
}
