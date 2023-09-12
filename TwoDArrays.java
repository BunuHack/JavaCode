import java.util.Scanner;

class TwoDArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your  row and column :");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int [rows][cols];


        // Taking a matrix as an input and printing its elements.


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               numbers[i][j] = sc.nextInt();
                
            } 
        }
            System.out.println("The matrix what you inputed are  :");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }



        // Searching for an element x in a matrix.
/* 
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number which location you want to know :");
        int x = sc.nextInt();
  
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                //compare with x
                if(numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
        */
  
 

    }
}