public class Tempo {
    public static void main(String[] args) {
        for (int h=0; h<24; h++) {
            for (int m=0; m<60; m++) {
                for (int s=0; s<60; s++) {
                    for (int mm=0; mm<1000; mm++)
                    System.out.printf("%02d:%02d:%02d.%03d\n", h, m, s, mm);
                }
            }
        }
    }
}