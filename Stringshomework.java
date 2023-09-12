import java.util.Scanner;


public class Stringshomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
       /* System.out.println("Enter Your Size :");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlength = 0;
        System.out.println("Enter your strings :");
        for (int i = 0; i < size; i++) {
             array[i] = sc.next();
             totlength += array[i].length();//  totlength = totlength + array[i].length();

        }
        System.out.println("Your total Strings length is :"+ totlength);
        */


//   Input a string from the user. Create a new string called ‘result’ in which you will replace the 
//   letter ‘e’ in the original string with letter ‘i’. 
//    Example : 
//    original = “eabcdef’ ; result = “iabcdif”
//    Original = “xyz” ; result = “xyz”


      /*  System.out.println("Enter a string :");
        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("Your string was :"+ result);
        */

//         Input an email from the user. You have to create a username from the email 
//         by deleting the part that comes after ‘@’. Display that username to the user.
//      Example : 
//      email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//      email = “helloWorld123@gmail.com”; username = “helloWorld123”

        System.out.println("Enter Your Email :");
        String email = sc.next();
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
               break;

            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("Your username is :"+""+username);

    }
}
