import java.util.Scanner;

public class ProgramaTabuada {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int j=SC.nextInt();
        int l=SC.nextInt();

        for (; j<=l; j++) {
            System.out.println();
            System.out.println("Tabuada do " + j);

            for (int i=1; i<=10; i++) {
                System.out.printf("%d\tx\t%d\t=\t%d\n", j, i, j*i);
            }
        }

        System.out.println();
    }
}