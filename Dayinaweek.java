import java.util.Scanner;

public class Dayinaweek {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter choice inbetween 1 to 7");
        int n = sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("It is Monday");
                break;
            case 2:
            System.out.println("It is Tuesday");
                break;
            case 3:
            System.out.println("It is Wednesday");
                break;
            case 4:
            System.out.println("It is Thursday");
                break;
            case 5:
            System.out.println("It is Friday");
                break;
            case 6:
            System.out.println("It is Saturday");
                break;
            case 7:
            System.out.println("It is Sunday");
                break;

            default:
            System.out.println("Invalid choice !");
                break;

        //Another way to wrote Switch Case Without Use of Break
        //    case 1 -> System.out.println("Monday");
        //    case 2 -> System.out.println("Tuesday");
        //    case 3 -> System.out.println("Wednesday");
        //    case 4 -> System.out.println("Thursday");
        //    case 5 -> System.out.println("Friday");
        //    case 6 -> System.out.println("Saturday");
        //    case 7 -> System.out.println("Sunday");
        }
    }
}
