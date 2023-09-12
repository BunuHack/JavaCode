import java.util.Scanner;

public class Nestedifelsegrestest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Five Number :");
        int a = sc.nextInt();
        int b = sc. nextInt();
        int c = sc. nextInt();
        int d = sc. nextInt();
        int e = sc. nextInt();
         if (a>b && a>c && a>d && a>e) {
            System.out.println(a + " Is Gretest ");
         } else {
            if (b>c && b>d && b>e) {
                System.out.println(b + " Is Greatest ");
            } else {
                if (c>d && c>e) {
                    System.out.println(c +" Is Greatest ");
                } else {
                    if (d>e) {
                        System.out.println(d + " Is Greatest ");
                    } else {
                        System.out.println(e + " is Greatest ");
                    }
                }
            }
         }


    }
}
