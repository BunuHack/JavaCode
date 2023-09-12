import java.util.Scanner;

public class Fist_last_occurance_recur {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int ind , char elem){


        if(ind == str.length()) {
            return;
            }
            if(str.charAt(ind) == elem) {
            if(first == -1) {
            first = ind;
            } else {
            last = ind;
            }
            }
            findOccurance(str, ind+1, elem);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.next();
        System.out.println("Enter Your Element :");
        char elem = sc.next().charAt(0);
        findOccurance(str, 0, elem);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);


    }
}
