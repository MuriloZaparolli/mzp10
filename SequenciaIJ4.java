public class SequenciaIJ4 {
    public static void main(String[] args) {
        for (float i=0; i<=2.2; i+=0.2) {
            for (float j=i+1; j<=i+3; j+=1) {
                if (i==0||i==1||i>=1.9) {
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                }
            }
        }
    }
}
