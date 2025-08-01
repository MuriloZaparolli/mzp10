import java.util.Scanner;

public class Dama {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        while (true) {
            x1 = SC.nextInt();
            y1 = SC.nextInt();
            x2 = SC.nextInt();
            y2 = SC.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }
            if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            } else if (x1 == x2 || y1 == y2 || Math.abs(x1-x2) == Math.abs(y1-y2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
