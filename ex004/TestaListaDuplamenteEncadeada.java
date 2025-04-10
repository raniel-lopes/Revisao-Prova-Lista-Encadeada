package ex004;

import java.util.Scanner;

public class TestaListaDuplamenteEncadeada {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir professor no início");
            System.out.println("2 - Inserir professor no fim");
            System.out.println("3 - Remover professor do início");
            System.out.println("4 - Remover professor do fim");
            System.out.println("5 - Listar professores");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do professor: ");
                    String nomeInicio = sc.nextLine();
                    lista.inserirListaEsquerda(nomeInicio);
                    break;
                case 2:
                    System.out.print("Digite o nome do professor: ");
                    String nomeFim = sc.nextLine();
                    lista.inserirListaDireita(nomeFim);
                    break;
                case 3:
                    String removidoInicio = lista.removerListaEsquerda();
                    System.out.println("Removido: " + removidoInicio);
                    break;
                case 4:
                    String removidoFim = lista.removerListaDireita();
                    System.out.println("Removido: " + removidoFim);
                    break;
                case 5:
                    lista.listarListaImprimir();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
