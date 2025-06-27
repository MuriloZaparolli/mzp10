import java.util.Scanner;

public class meteoro {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, x2, y1, y2, n, x, y, m, k = 0;
        while (true) {
            x1 = SC.nextInt();
            x2 = SC.nextInt();
            y1 = SC.nextInt();
            y2 = SC.nextInt();
            if (x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0) {
                break;
            }
            m = 0;
            k++;
            n = SC.nextInt();
            for (int i = 0; i < n; i++) {
                x = SC.nextInt();
                y = SC.nextInt();
                if ((x >= x1 && x <= x2) && (y <= y1 && y >= y2)) {
                    m++;
                }
            }
            System.out.printf("Teste %d\n%d\n", k, m);
        }
    }
}