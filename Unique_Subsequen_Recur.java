import java.util.HashSet;
import java.util.Set;

public class Unique_Subsequen_Recur {

    public static void uniqueSubquence(String str , int idx , String newstString ,HashSet<String>set){

        if (idx==str.length()) {
            
        if (set.contains(newstString)) {
            return;
        } else {
            System.out.println(newstString);
            set.add(newstString);
            return;

        }

        }
        char currChar = str.charAt(idx);
        uniqueSubquence(str, idx+1, newstString + currChar ,set);

        uniqueSubquence(str, idx+1, newstString ,set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubquence(str, 0, "",set);

    }
}
