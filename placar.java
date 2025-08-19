import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Gol implements Comparable {
    String dono;
    int minutos;

    public Gol(String dono, int minutos) {
        this.dono = dono;
        this.minutos = minutos;
    }

    @Override
    public int compareTo(Object outro) {
        Gol other = (Gol) outro;
        return this.minutos - other.minutos; 
    }
}

public class placar {

    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        List<Gol> gols = new LinkedList<>();
        gols.addAll(lerGols(ler.nextInt(), "Paulo"));
        gols.addAll(lerGols(ler.nextInt(), "Camila"));
        Collections.sort(gols);
        
        int paulo = 0, camila = 0;
        System.out.println("0 0");
        for (Gol gol : gols) {
            if (gol.dono.equals("Paulo")) paulo++;
            else camila++;

            System.out.printf("%d %d\n", paulo, camila);
        }
    }

    public static List<Gol> lerGols(int N, String dono) {
        List<Gol> gols = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            gols.add(new Gol(dono, ler.nextInt()));
        }

        return gols;
    }
}