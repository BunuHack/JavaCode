public class Hollowrectangle {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=5; j++) {
                if (i==1 || j==1 || i==r || j==c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
