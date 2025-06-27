import java.util.Scanner;

public class Main {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = SC.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        }
    }
}