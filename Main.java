import java.util.Scanner;

public class Main {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        float[][] matriz = new float[12][12];
        float soma=0;
        int cnt=0;
        char caractere;
        caractere = SC.next().charAt(0);
        for (int linha=0; linha<matriz.length; linha++) {
            for (int coluna=0; coluna<matriz.length; coluna++) {
                matriz[linha][coluna]=SC.nextFloat();
                if (linha<coluna) {
                    soma+=matriz[linha][coluna];
                    cnt++;
                }
            }
        }
        if (caractere=='M') {
            soma/=cnt;
        }
        System.out.printf("%.1f\n", soma);
    }
}