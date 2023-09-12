import java.util.Scanner;

public class KeybordCombi_using_Recur {

    public static String [] keypad = {".", "abc","def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};
    public static void printComb(String str , int idx , String combination){

        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar- '0'];
        
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx+1, combination + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0 - 9 to know your keybord combination :");
        String str = sc.next();
        printComb(str, 0, "");

    }
}
