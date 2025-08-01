import java.util.Scanner;

public class Quermesse {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int n, p, g=0, c=1;
        while (true) {
            n = SC.nextInt();
            if (n == 0) {
                break;
            }
            for (int i=0; i<n; i++) {
                p = SC.nextInt();
                if (p == i+1) {
                    g=p;
                }
            }
            System.out.printf("Teste %d\n%d\n\n", c, g);
            c++;
        }
    }
}
