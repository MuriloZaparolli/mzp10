import java.util.Scanner;

public class mamaco {
    final static Scanner SC = new Scanner(System.in);

    public static int lerCoordenadas() {
        int valor;
        do {
            valor = SC.nextInt();
        } while (valor < -10000 || valor > 10000);
        return valor;
    }

    public static void main(String[] args) {
        int n, x, y, u, v, xf = -10000, yf = 10000, uf = 10000, vf = -10000, cnt = 0;
        while (true) {
            do {
                n = SC.nextInt();
            } while (n < 0 || n > 10000);
            if (n == 0) {
                break;
            }
            for (int c = 0; c < n; c++) {
                x = lerCoordenadas();
                y = lerCoordenadas();
                u = lerCoordenadas();
                v = lerCoordenadas();
                if (x > xf) {
                    xf = x;
                } if (y < yf) {
                    yf = y;
                } if (u < uf) {
                    uf = u;
                } if (v > vf) {
                    vf = v;
                }
            }
            cnt++;
            if (xf > uf || yf < vf) {
                System.out.printf("Teste %d\nnenhum\n\n", cnt);
            } else {
                System.out.printf("Teste %d\n%d %d %d %d\n", cnt, xf, yf, uf, vf);
            }
        }
    }
}
