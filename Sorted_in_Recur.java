import java.util.Scanner;

public class Sorted_in_Recur {

    public static boolean isSorted(int arr[] , int ind){

        if (ind==arr.length-1) {
            return true;
        }
        if(arr[ind]<arr[ind+1]){
             return isSorted(arr, ind+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Array size :");    
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Your array :");    
  
         for(int i=0; i<size; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println(isSorted(arr, 0));
    }
}
