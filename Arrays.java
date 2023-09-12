import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    //   //Taking an array as an input and printing its elements.

    //   System.out.println("Enter the Array size :");    
    //   int size = sc.nextInt();
    //   int numbers[] = new int[size];
 
    //   System.out.println("Enter Your Numbers :");    

    //    for(int i=0; i<size; i++) {
    //        numbers[i] = sc.nextInt();
    //    }
 
    //    //print the numbers in array
    //   System.out.println("Your Inputed Numbers are :");    

    //    for(int i=0; i<numbers.length; i++) {
    //        System.out.print(numbers[i]+" ");
    //    }


//Take an array of names as input from the user and print them on the screen.


        // System.out.println("Enter your size :");
        // int size = sc.nextInt();
        // String name[] = new String[size];
        // System.out.println("Enter "+size+" Names :");
        // for (int i = 0; i < size; i++) {
            
        //     name[i]= sc.next();
        // }

        // for (int i = 0; i < name.length; i++) {

        //     System.out.println("name " + (i+1) +" is : " + name[i]);

        // }



//Find the maximum & minimum number in an array of integers. 


        // System.out.println("Enter your size :");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // System.out.println("Enter your Numbers :");
        
        // //input
        // for(int i=0; i<size; i++) {
        //     numbers[i] = sc.nextInt();
        // }
   
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
       
        //  for(int i=0; i<numbers.length; i++) {
        //      if(numbers[i] < min) {
        //          min = numbers[i];
        //      }

        //      if(numbers[i] > max) {
        //         max = numbers[i];
        //     }
        // }
  
        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);

 
        
//         Take an array of numbers as input and check if it is an array sorted in ascending order.
//       Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.
  

/*System.out.println("Enter your size :");
int size = sc.nextInt();
int numbers[] = new int[size];
 System.out.println("Enter Your Numbers :");
//input
for(int i=0; i<size; i++) {
    numbers[i] = sc.nextInt();
}

boolean isAscending = true;

 for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
     if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
         isAscending = false;
     }
 }

 if(isAscending) {
     System.out.println("The array is sorted in ascending order");
 } else {
     System.out.println("The array is not sorted in ascending order");
 }*/


    }
}






