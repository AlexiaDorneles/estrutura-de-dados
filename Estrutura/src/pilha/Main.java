package pilha;

import java.util.Scanner;

/**
 * @author alexia.pereira
 */
public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Pilha<Elemento> pilha = new Pilha<>();
        int opcao;

        do {

            System.out.println("   ");
            System.out.println("Opções: ");
            System.out.println("1 - Adicionar Elemento");
            System.out.println("2 - Remover Elemento");
            System.out.println("3 - Imprimir Pilha");
            System.out.println("4 - Sair");

            opcao = t.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do elemento: ");
                    pilha.adicionar(new Elemento(t.next()));
                    break;
                case 2:
                    pilha.remover();
                    break;
                case 3:
                    pilha.imprimir();
                    break;
                case 4:
                    System.out.println("Finalizado");
                    t.close();
                    break;
            }

        } while (opcao != 4 && opcao < 4);
    }
}
