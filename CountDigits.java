import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int originalnumber = n;
        int no_ofdigits = 0;

        // while (n>0) {
        //     n = n / 10;
        //     no_ofdigits++;
        // }
        // System.out.println("The Number "+originalnumber+" Numbers Digits are "+no_ofdigits);

        
        //Sumof Digits ---->
        while (n>0) {
            no_ofdigits += n%10;
            n = n / 10;
           
        }
        System.out.println("The Number "+originalnumber+" Sum Is "+no_ofdigits);
    }
}
