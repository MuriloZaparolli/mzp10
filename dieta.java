import java.util.Scanner;

public class dieta {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SC.nextInt(), m = SC.nextInt(), p, g, c, r = 0;
        for (int i = 0; i < n; i++) {
            p = SC.nextInt() * 4;
            g = SC.nextInt() * 9;
            c = SC.nextInt() * 4;
            r += p + g + c;
        }
        System.out.println(m - r);
    }
}