import java.util.Scanner;

public class festa {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int e = SC.nextInt(), s = SC.nextInt(), l = SC.nextInt(), d;
        d = Math.abs(e - s) + Math.abs(s - l) + Math.abs(l - e);
        System.out.println(d);
    }
}