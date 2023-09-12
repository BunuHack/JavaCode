import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Rock for : 0 \n Enter Paper for : 1\n Enter Scissor : 2 ");
        int n = sc.nextInt();

        if (n==0) {
        System.out.println("Your Choice Is Rock ");
        } else if(n==1) {
        System.out.println("Your Choice Is Paper ");
        }else if (n==2){
        System.out.println("Your Choice Is Scissor ");
        }else{
        System.out.println("Enter A Valid Number !");
        }
        
           Random ran = new Random();
           int num = ran.nextInt(2);
        //    System.out.println("Computer Number is :" + num);
        if (num == 0) {
            System.out.println("Computer Choice Is Rock ");
        } else if (num == 1){
            System.out.println("Computer Choice Is Paper ");
        }else{
            System.out.println("Computer Choice Is Scissor ");
        }
         
            if (n == num ) {
                System.out.println(" Game Is Tie ");
                
            }  else if (n == 0 && num == 2 || n == 2 && num == 1 || n == 1 && num == 0) {
                    System.out.println(" You Win ");
            } 
            
            else if (num == 0 && n == 2) {
                System.out.println(" Computer Win ");
            } 
            else if(num == 2 && n == 1) {
                System.out.println(" Computer Win ");
            }
            else if(num == 1 && n == 0){
                System.out.println( " Computer Win " );
            }
        

    }
}
