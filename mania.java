import java.util.Scanner;

public class mania {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ler.nextInt();
        int M = ler.nextInt();

        if (N == 1) {
            int vetor[] = new int[M];
            int vetor2[] = new int[M];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = ler.nextInt();
            }

            for (int i = 0; i < vetor.length; i++) {
                if (i != 0 && i != vetor.length-1) {
                    if ((vetor[i] + vetor[i-1]) % 2 == 0) vetor2[i]++;
                    if ((vetor[i] + vetor[i+1]) % 2 == 0) vetor2[i]++;
                } else if ((i == 0 && (vetor[i] + vetor[i+1]) % 2 == 0) || (i == vetor.length-1 && (vetor[i] + vetor[i-1]) % 2 == 0)) {
                    vetor2[i]++;
                }
            }

            int quant = 0;
            for (int i = 0; i < vetor2.length; i++) {
                if (vetor2[i] == 0) continue;
                boolean cookieProblema = true;

                if (i == 0) {
                    if (vetor2[i] != 0 && vetor2[i] < vetor2[i+1]) cookieProblema = false;
                }  else if (i == vetor2.length-1) {
                    if (vetor2[i] != 0 && vetor2[i] < vetor2[i-1]) cookieProblema = false;
                } else if (vetor2[i] != 0 && (vetor2[i] < vetor2[i+1] || vetor2[i] < vetor2[i-1])) cookieProblema = false;
                if (cookieProblema) {
                    vetor[i]++;
                    vetor2[i] = 0;
                    if (i == 0) vetor2[i+1] = 0;
                    else if (i == vetor2.length-1) vetor2[i-1] = 0;
                    else {
                        vetor2[i+1] = 0;
                        vetor2[i-1] = 0;
                    }
                }
            }

            System.out.println(quant);
            for (int i = 0; i < vetor.length; i++) {
                if (i != vetor.length-1) {
                    System.out.printf("%d ", vetor[i]);
                } else System.out.println(vetor[i]);
            }
        }
    }
}
