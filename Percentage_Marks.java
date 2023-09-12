import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Percentage_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Total Marks :");
        int tot = sc.nextInt();
      
        System.out.println("Enter Your 1 st subject marks : ");
        int first = sc.nextInt();
        System.out.println("Enter Your 2 nd subject marks : ");
        int second = sc.nextInt();
        System.out.println("Enter Your 3 rd subject marks : ");
        int third = sc.nextInt();
        System.out.println("Enter Your 4 th subject marks : ");
        int fourth = sc.nextInt();
        System.out.println("Enter Your 5 th subject marks : ");
        int fivth = sc.nextInt();
        
        float Percent = (float)(first + second + third + fourth + fivth) * 100 /tot;
        System.out.println(" The Percentage is : "+ Percent);


    }
}
