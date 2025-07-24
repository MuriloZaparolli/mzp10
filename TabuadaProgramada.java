public class TabuadaProgramada {
    
    public static void main(String[] args) {

        for (int multiplicando=1; !(multiplicando>10); multiplicando++) {
            System.out.println();

            for (int multiplicador=1; multiplicador<=10; multiplicador++) {
                System.out.println(multiplicando + "x" + multiplicador + " = " + multiplicando*multiplicador);
            }
        }

        System.out.println();
    }
}