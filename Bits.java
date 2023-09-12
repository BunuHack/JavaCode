import java.util.Scanner;

public class Bits {
 
   public static void main(String args[]) {
    //Get Bit
    //   int n = 5; //0101
    //   int pos = 2;
    //   int bitMask = 1<<pos;
 
    //   if((bitMask & n) == 0) {
    //       System.out.println("bit was zero");
    //   } else {
    //       System.out.println("bit was one");
    //   }

    
    //Set Bit
    //   int n = 5; //0101
    //   int pos = 1;
    //   int bitMask = 1<<pos;
 
    //   int newNumber = bitMask | n;
    //   System.out.println(newNumber);

    
   // Clear Bit
    //  int n = 5; //0101
    //  int pos = 2;
    //  int bitMask = 1<<pos;
    //  int newBitMask = ~(bitMask);
    //  int newNumber = newBitMask & n;
    //  System.out.println(newNumber);

    //Update Bit
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your operation : 0 or 1");
    int oper = sc.nextInt();
    // oper=1 -> set; oper=0 -> clear
   int n = 5; //0101
   int pos = 1;
  
   int bitMask = 1<<pos;
   if(oper == 1) {
       //set
       int newNumber = bitMask | n;
       System.out.println(newNumber);
   } else {
    //clear
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & n;
    System.out.println(newNumber);
   }




   

   }
}


