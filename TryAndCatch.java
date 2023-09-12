public class TryAndCatch {
    public static void main(String[] args) {

       try{
        System.out.println("Starting Of Try Block");
        System.out.println();
        int a = 10 , b = 0 , c;
        c = a/b;
       }
       catch (ArithmeticException e){
         //System.out.println(e);  // It Show Two Things In Output Such as : 1.Exception Name 2. Description 

        //e.printStackTrace();     //It Show Three Things In Output Such as :1. Exception Name 2. Description 3. Stack Trace Line

        //System.out.println(e.getMessage());     // It Shows Only Description 

        System.out.println("A Number Can't devide by 0 If Divide It Shows Arithmatic Exception ");

       }
       System.out.println();
       System.out.println( " Catch Block Ended");
    }
}
