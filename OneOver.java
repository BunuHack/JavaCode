import java.util.Scanner;

public class OneOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Batsman name :");
        String first = sc. nextLine();
        System.out.println("Enter First Batsman Score");
        int score;
        int tot = 0;
        for (int i = 0; i < 6; i++) {
        score = sc.nextInt();
        tot += score;
        }

        float avg = tot/6f;
        System.out.println("First Batsman Total Score is "+ tot);
        System.out.println("First Batsman Average Score is "+ avg);

        System.out.println(" ");
        System.out.println("Enter Second Batsman name :");
        sc.nextLine();
        String second = sc.nextLine();
        System.out.println("Enter Second Batsman Score");
        int score_s;
        int total = 0;
        for (int i = 0; i < 6; i++) {
        score_s = sc.nextInt();
        total += score_s;
        }

        float average = total/6f;
        System.out.println("Second Batsman Total Score is "+ total);
        System.out.println("Second Batsman Average Score is "+ average);

        System.out.println(" ");
        if (tot>total) {
            System.out.println(" First Batsman Played well than Second ");
        } else {
            System.out.println(" Second Batsman Played well than First ");
        }

    }
}
