import java.util.Scanner;

public class towerofhonoiIn_recur {

    public static void towerOfHonoi( int n ,String sour , String help , String desti){
        if(n == 1){
            System.out.println("Transfer disk "+ n +" form "+ sour+" to "+desti);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHonoi(n-1, sour, desti, help);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + sour + " to " + help);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHonoi(n-1, help, sour, desti);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        towerOfHonoi(n, "S ", "H ", " D");
    }

}