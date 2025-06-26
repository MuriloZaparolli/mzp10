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
        int n, x, y, u, v, xf = 0, yf = 0, uf = 0, vf = 0, cnt = 0;
        String nn = "";
        boolean ctrl = false;
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
                }
                if (y < yf) {
                    yf = y;
                }
                if (u < uf) {
                    uf = u;
                }
                if (v > vf) {
                    vf = v;
                }
                if (x > uf && y > vf) {
                    nn = "nenhum";
                    ctrl = true;
                }
                if (u < xf || v < yf) {
                    nn = "nenhum";
                    ctrl = true;
                }
            }
            cnt++;
            if (ctrl) {
                System.out.println(nn);
            } else {
                System.out.printf("Teste %d\n%d %d %d %d\n", cnt, xf, yf, uf, vf);
            }
        }
    }
}
