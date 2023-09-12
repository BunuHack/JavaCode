import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharCheackAssign {
 public static void main(String args[]) throws Exception {
 char c;
 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter any alphabet:");
 c = (char) bf.read();
 if(c >= 97 && c <= 123) {
 System.out.println("Lower Case");
 }
 else if(c >= 65 && c <= 96) {
 System.out.println("Upper Case");
 }
 else if(c >= 48 && c <= 57) {
 System.out.println("Digit");
 }else{
 System.out.println("other characters");
 }
 }
} 