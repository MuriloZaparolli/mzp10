public class Placas {
    public static void main(String[] args) {

        for (int valor1=0; valor1<10; valor1++) {
            for (int valor2=0; valor2<10; valor2++) {
                for (int valor3=0; valor3<10; valor3++) {
                    for (int valor4=0; valor4<10; valor4++) {
                        for (char letra1= 65; letra1<=90; letra1++) {
                            for (char letra2= 65; letra2<=90; letra2++) {
                                for (char letra3= 65; letra3<=90; letra3++) {
                                    System.out.printf("%c%c%c-%d%d%d%d\n", letra1, letra2, letra3, valor1, valor2, valor3, valor4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }    
}