import java.util.Scanner;

public class mania2 {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ler.nextInt();
        int M = ler.nextInt();

        int bandeja[][] = lerBandeja(N, M);
        int desorganizacao[][] = calcularDesorganizacao(bandeja);
        //System.out.println();
        //printBandeja(desorganizacao);
        int adicoes = 0;

        for (int i = 0; i < desorganizacao.length; i++) {
            for (int j = 0; j < desorganizacao[0].length; j++) {
                int cookie = desorganizacao[i][j];
                if (cookie > 0) {
                    int cookiesAdjacentes[] = obterAdjacentes(desorganizacao, i, j);

                    boolean cookieProblema = true;
                    for (int k = 0; k < cookiesAdjacentes.length && cookieProblema; k++) {
                        if (cookiesAdjacentes[k] != 0 && cookie < cookiesAdjacentes[k]) cookieProblema = false;
                    }

                    if (cookieProblema) {
                        adicoes++;
                        bandeja[i][j]++;

                        for (int k = 0; k < cookiesAdjacentes.length; k++) {
                            if (cookiesAdjacentes[k] != 0) {
                                switch (k) {
                                    case 0:
                                        desorganizacao[i][j+1] = 0;
                                        break;
                                    case 1:
                                        desorganizacao[i+1][j] = 0;
                                        break;
                                    case 2:
                                        desorganizacao[i][j-1] = 0;
                                        break;
                                    default:
                                        desorganizacao[i-1][j] = 0;
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(adicoes);
        printBandeja(bandeja);
    }

    public static int[][] lerBandeja(int N, int M) {
        int matriz[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        return matriz;
    }

    public static int[][] calcularDesorganizacao(int bandeja[][]) {
        int desorganizacao[][] = new int[bandeja.length][bandeja[0].length];
        for (int i = 0; i < bandeja.length; i++) {
            for (int j = 0; j < bandeja[0].length; j++) {
                int cookie = bandeja[i][j];
                int cookiesAdjacentes[] = obterAdjacentes(bandeja, i, j);

                for (int k = 0; k < cookiesAdjacentes.length; k++) {
                    if (cookiesAdjacentes[k] != 0 && (cookie + cookiesAdjacentes[k]) % 2 == 0) desorganizacao[i][j]++;
                }
            }
        }

        return desorganizacao;
    }

    public static int[] obterAdjacentes(int matriz[][], int i, int j) {
        int adjacentes[] = new int[4]; //0 direita, 1 baixo, 2 esquerda, 3 cima

        if (j+1 < matriz[0].length) adjacentes[0] = matriz[i][j+1];
        if (i+1 < matriz.length) adjacentes[1] = matriz[i+1][j];
        if (j-1 >= 0) adjacentes[2] = matriz[i][j-1];
        if (i-1 >= 0) adjacentes[3] = matriz[i-1][j];

        return adjacentes;
    }

    public static void printBandeja(int bandeja[][]) {
        for (int i = 0; i < bandeja.length; i++) {
            for (int j = 0; j < bandeja[0].length; j++) {
                if (j != bandeja[0].length - 1) System.out.printf("%d ", bandeja[i][j]);
                else System.out.println(bandeja[i][j]);
            }
        }
    }
}
