import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class SortByPreco implements Comparator<Objeto> {

    @Override
    public int compare(Objeto arg0, Objeto arg1) {
        return (int) (arg0.preco - arg1.preco);
    }

}

class SortByTipo implements Comparator<Objeto> {

    @Override
    public int compare(Objeto arg0, Objeto arg1) {
        return (int) (arg0.tipo - arg1.tipo);
    }

}

class Objeto {
    long tipo, preco;

    public Objeto() {}

    public Objeto(long tipo, long preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public long getTipo() {
        return tipo;
    }

    public void setTipo(long tipo) {
        this.tipo = tipo;
    }

    public long getPreco() {
        return preco;
    }

    public void setPreco(long preco) {
        this.preco = preco;
    }

    final static Comparator<Objeto> sortTipo = new SortByTipo();
    final static Comparator<Objeto> sortPreco = new SortByPreco();

    @Override
    public String toString() {
        return "Objeto [tipo=" + tipo + ", preco=" + preco + "]";
    }
}

public class feira {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        long N = ler.nextLong();
        long T = ler.nextLong();

        List<Objeto> objetosTipo = lerObjetos(N);
        Collections.sort(objetosTipo, Objeto.sort);

        long C = ler.nextLong();
        long vendas = 0;

        for (int i = 0; i < C; i++) {
            vendas += objetosPreco.get(0).preco;
            objetosPreco.remove(0);
        }

        System.out.println(vendas);
    }

    public static List<Objeto> lerObjetos(long N) {
        List<Objeto> objetos = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            objetos.add(new Objeto());
        }
        lerTipos(objetos, N);
        lerPrecos(objetos, N);

        return objetos;
    }

    public static void lerTipos(List<Objeto> objetos, long N) {
        for (int i = 0; i < N; i++) {
            objetos.get(i).setTipo(ler.nextLong());
        }
    }

    public static void lerPrecos(List<Objeto> objetos, long N) {
        for (int i = 0; i < N; i++) {
            objetos.get(i).setPreco(ler.nextLong());
        }
    }
}
