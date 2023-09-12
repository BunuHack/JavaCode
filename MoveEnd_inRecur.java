public class MoveEnd_inRecur {
    public static void moveAllX(String str , int ind , int count , String newstString){

        if (ind == str.length()){
            for (int i = 0; i < count; i++) {
                newstString += 'x';
            }
            System.out.println(newstString);
            return;
        }
        char currChar = str.charAt(ind);
        if (currChar == 'x') {
            count++;
            moveAllX(str, ind+1, count, newstString);   
        }else{
            newstString += currChar;
            moveAllX(str, ind+1, count, newstString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, " ");
    }
}
