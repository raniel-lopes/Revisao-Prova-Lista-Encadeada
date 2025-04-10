package ex002;

import java.util.Scanner;

public class TestaListaEncadeada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        int opcao;

        do {
            System.out.println("\n=== MENU DE VIAGENS ===");
            System.out.println("1 - Adicionar viagem");
            System.out.println("2 - Remover última viagem");
            System.out.println("3 - Listar viagens");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID da viagem: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome da viagem: ");
                    String nome = sc.nextLine();
                    Viagem v = new Viagem(id, nome);
                    lista.adicionar(v);
                    System.out.println("Viagem adicionada!");
                    break;

                case 2:
                    lista.remover();
                    System.out.println("Última viagem removida.");
                    break;

                case 3:
                    System.out.println("\nLista de viagens:");
                    lista.listar();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
