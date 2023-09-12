import java.util.Scanner;

// import javax.swing.plaf.TreeUI;

public class Remove_dupli_inRecur {
    public static boolean[] map = new boolean [26];

    public static void removeDuplicate(String str , int ind , String newstString){

        if(ind == str.length()){
            System.out.println(newstString);
            return;
        }
        char currChar = str.charAt(ind);
        if (map[currChar- 'a']== true) {
            removeDuplicate(str, ind+1, newstString);
        }else {
            newstString += currChar;
            map[currChar-'a'] = true;
            removeDuplicate(str, ind+1, newstString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.next();
        removeDuplicate(str, 0, " ");
        
    }
}
