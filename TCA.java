import java.util.Scanner;

public class TCA {
    final static Scanner SC = new Scanner(System.in);

    static int cmdDoPlayer;
    static boolean ctrl;

    static void receberComando(int max) {
        ctrl = true;

        do {
            cmdDoPlayer = SC.nextInt();

            if (cmdDoPlayer < 1 || cmdDoPlayer > max) {
                System.out.printf("\nComando não reconhecido\n");
                continue;
            }

            ctrl = false;
        } while (ctrl);

        ctrl = true;
    }

    static void creditos() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("Produtor: Murilo de Lima Zaparolli");
        System.out.printf("\n\n");
        System.out.printf("Começo da aventura!\t[1]\n");
        System.out.printf("Créditos\t\t[2]");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    static void inicio() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("Você acorda numa floresta, sem saber nem quem é você ou como veio parar nesse lugar.");
        System.out.printf("Você percebe apenas uma trilha um pouco apagada, parece que esse é o unico caminho a seguir.\n\n");
        System.out.printf( "Seguir a trilha\t[1]\n");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");

        receberComando(1);

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("Você segue a trilha, ainda sem encontrar nada.");
        System.out.printf("\n\n");
        System.out.printf( "Seguir a trilha\t[1]\n");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");

        receberComando(1);

        baus();
    }

    static void baus() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("Derrepente você chega numa estrutura de pedra, como se fosse um templo antigo.");
        System.out.println("Na entrada do templo, tem três baus com escrituras em cada.");
        System.out.printf("\n\n");
        System.out.printf("Ir em frente ao bau da esquerda\t[1]\n");
        System.out.printf("Ir em frente ao bau do meio\t[2]\n");
        System.out.printf("Ir em frente ao bau da direita\t[3]\n");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");

        receberComando(3);

        switch (cmdDoPlayer) {
            case 1:
                bauGuerreiro();
                break;
        
            case 2:
                break;
        }
    }

    static void bauGuerreiro() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("Você vai em frente a um bau com uma gravura de um escudo e uma espada.");
        System.out.println("Junto tem algumas escrituras.");
        System.out.printf("\n\n");
        System.out.printf("Ler escrituras do bau\t\t[1]\n");
        System.out.printf("Voltar e olhar outro bau.\t[2]");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");

        receberComando(2);

        switch (cmdDoPlayer) {
            case 2:
                baus();

            default:
                break;
        }

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("As escrituras dizem:");
        System.out.println("Guerreiro.");
        System.out.println("Focado em defesa e ataque.");
        System.out.println("Vida: 25");
        System.out.println("Dano: 2 ~ 6");
        System.out.println("Passiva: fortificação - recebe menos dano as vezes.");
        System.out.println("Abilidade: bloqueio - chance de não receber dano.");
        System.out.printf("\n\n");
        System.out.printf("Abrir o bau e pegar os equipamentos\t[1]\n");
        System.out.printf("Voltar e olhar outro bau.\t\t[2]");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("\n\n\n");
        System.out.println("Bem vindos!!");
        System.out.println("Para fazer um comando, digite o numero no colchetes.");
        System.out.printf("\n\n");
        System.out.printf("Começo da aventura!\t[1]\n");
        System.out.printf("Créditos\t\t[2]");
        System.out.printf("\n\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------");

        receberComando(2);
        ctrl = true;

        while (ctrl) {
            switch (cmdDoPlayer) {
                case 1:
                    ctrl = false;
                    break;
            
                case 2:
                    creditos();
                    receberComando(2);
                    break;
            }
        }
        
        inicio();
    }
}

// del TCA.class; javac TCA.java; java TCA
// rm TCA.class && javac TCA.java && java TCA
