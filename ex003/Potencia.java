package ex003;

import java.util.Scanner;

public class Potencia {

    // Função recursiva para calcular X elevado a Y
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1; // Caso base: qualquer número elevado a 0 é 1
        }
        return base * potencia(base, expoente - 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (X): ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente (Y): ");
        int expoente = sc.nextInt();

        if (expoente < 0) {
            System.out.println("O expoente deve ser um número inteiro positivo.");
        } else {
            int resultado = potencia(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é: " + resultado);
        }

        sc.close();
    }
}