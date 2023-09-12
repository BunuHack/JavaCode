public class SubsequencesInRecur {
    
    public static void Subsequences(String str , int ind , String newstString){

        if(ind == str.length() ) {
            System.out.println(newstString);
            return;
        }
        char currChar = str.charAt(ind);
        //chose 
        Subsequences(str, ind +1, newstString + currChar);
        // Don't choose to be
        Subsequences(str, ind +1, newstString);
    }
    public static void main(String[] args) {
        String str = "abc";
        Subsequences(str, 0, " ");
    }
}
