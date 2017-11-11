package listaDuplamenteEncadeada;

import java.util.Scanner;

/**
 * @author alexia.pereira
 */
public class Main {
    private static Scanner t = new Scanner(System.in);
    private static String nome;

    private static void atribuirNome() {
        System.out.println("Digite o nome: ");
        nome = t.next();
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcao;

        do {

            System.out.println("   ");
            System.out.println("Opções: ");
            System.out.println("1 - Adicionar no Início");
            System.out.println("2 - Adicionar no Fim");
            System.out.println("3 - Adicionar no Meio");
            System.out.println("4 - Imprimir Lista");
            System.out.println("5 - Sair");

            opcao = t.nextInt();

            switch (opcao) {
                case 1:
                    atribuirNome();
                    lista.adicionarInicio(nome);
                    break;
                case 2:
                    atribuirNome();
                    lista.adicionarFim(nome);
                    break;
                case 3:
                    atribuirNome();
                    System.out.println("Digite a posição: ");
                    int posicao = t.nextInt();
                    lista.adicionarMeio(posicao, nome);
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    System.out.println("Finalizado");
                    t.close();
                    break;
            }
        } while (opcao != 5 && opcao <= 5);
    }
}
