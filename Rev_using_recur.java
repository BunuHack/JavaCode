import java.util.Scanner;

public class Rev_using_recur {
   
    public static void Calcu_Rev(String str , int index){

        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        } 

        System.out.print(str.charAt(index)+" ");
        Calcu_Rev(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Calcu_Rev(str, str.length()-1);
    }
}
