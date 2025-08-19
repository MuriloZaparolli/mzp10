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

public class feira2 {

    final static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        long N = ler.nextLong();
        long T = ler.nextLong();

        List<Objeto> objetosTipo = lerObjetos(N);
        List<Objeto> objetosPreco = copiarLista(objetosTipo);
        Collections.sort(objetosTipo, Objeto.sortTipo);
        Collections.sort(objetosPreco, Objeto.sortPreco);

        //printLista(objetosTipo);
        //printLista(objetosPreco);

        long C = ler.nextLong();
        long vendas = 0;

        for (long i = 0; i < C; i++) {
            long tipo = ler.nextLong();
            if (tipo == 0) {
                vendas += objetosPreco.get(0).preco;
                objetosTipo.remove(procurarObjeto(objetosPreco.get(0), objetosTipo));
                objetosPreco.remove(0);
            } else {
                List<Objeto> objetosLista = procurarTipo(tipo, objetosTipo);

                if (!objetosLista.isEmpty()) {
                    vendas += objetosLista.get(0).preco;
                    objetosTipo.remove(procurarObjeto(objetosLista.get(0), objetosTipo));
                    objetosPreco.remove(procurarObjeto(objetosLista.get(0), objetosPreco));
                }
            }
        }

        System.out.println(vendas);

    }

    public static int procurarObjeto(Objeto objeto, List<Objeto> objetos) {
        for (int i = 0; i < objetos.size(); i++) {
            if (objeto.equals(objetos.get(i))) return i;
        }

        return -1;
    }

    public static List<Objeto> copiarLista(List<Objeto> lista) {
        List<Objeto> lista2 = new LinkedList<>();

        for (int i = 0; i < lista.size(); i++) {
            lista2.add(lista.get(i));
        }
        
        return lista2;
    }

    public static List<Objeto> procurarTipo(long tipo, List<Objeto> objetos) {
        List<Objeto> objetosTipo = new LinkedList<>();

        for (Objeto objeto : objetos) {
            if (objeto.tipo == tipo) objetosTipo.add(objeto);
        }

        Collections.sort(objetosTipo, Objeto.sortPreco);
        return objetosTipo;
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

    public static void printLista(List<Objeto> lista) {
        for (Objeto objeto : lista) {
            System.out.println(objeto);
        }
    }
}
