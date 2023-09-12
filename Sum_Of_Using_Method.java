import java.util.Scanner;

 class Sum_Of_Using_Method {

    int CalcSum( int a,int b){
       return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number To Sum :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum_Of_Using_Method obj = new Sum_Of_Using_Method();
        int c = obj.CalcSum(a, b);
        System.out.println("Sum Of Two Number Is : " +c);
    }

    
    //Alternative Way To Code Method ------>>>
    // public static int CalcSum(int a, int b){
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Two Number To Sum :");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println("Sum Of Two Number Is : "+CalcSum(a, b) );
    // }
}
