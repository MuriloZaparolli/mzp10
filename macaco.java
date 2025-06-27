import java.util.Scanner;

public class macaco {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n, x, y, u, v, xfinal = -10000, yfinal = 10000, ufinal = 10000, vfinal = -10000, contTeste = 0;
    
        while (true) {

            n = SC.nextInt();
            
            if (n == 0) {
                break;
            }
            
            for (int i = 0; i < n; i++) {
            
                x = SC.nextInt();
                y = SC.nextInt();
                u = SC.nextInt();
                v = SC.nextInt();
            
                if (x >= xfinal || y <= yfinal) {
                    xfinal = x;
                    yfinal = y;
                }
                if (u <= ufinal || v >= vfinal) {
                    ufinal = u;
                    vfinal = v;
                }
            }

            contTeste++;
            
            if (xfinal > ufinal && yfinal < vfinal) {
                System.out.printf("Teste %d\nnenhum\n\n", contTeste);
            } else {
                System.out.printf("Teste %d\n%d %d %d %d\n\n", contTeste, xfinal, yfinal, ufinal, vfinal);
            }
        }
    }
}