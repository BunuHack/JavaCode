import java.util.Scanner;

public class Calculator_using_conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();
        System.out.println("Enter Your Operation What You want to perform : \n + , - , * , / , % ");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println(a+b);
        } else if(c=='-') {
            System.out.println(a-b);
        }else if(c=='*') {
            System.out.println(a*b);
        }else if(c=='/') {
            System.out.println(a/b);
        }else if(c=='%') {
            System.out.println(a%b);
        }else  {
            System.out.println("Invalid Operation !");
        }
    }
}
