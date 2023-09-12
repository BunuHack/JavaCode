import java.util.Scanner;

public class BubbleSort {

    public static void printArray(int number[]){
         for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Your Array Size : ");
        int size = sc.nextInt();
        System.out.println("Enter Your Numbers : ");

        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Your Array is : ");
        printArray(number);
        //Bubble Sort 

        for (int i = 0; i < number.length -1; i++) {
            for (int j = 0; j < number.length-i-1; j++) {
                if (number[j] > number[j+1]) {
                     // Then Swap
                     int temp = number[j];
                     number[j] = number [j+1];
                     number[j+1] = temp;
                }
            }
        }
        System.out.println("Your Sorted Array Is : ");
        printArray(number);
    }
}
