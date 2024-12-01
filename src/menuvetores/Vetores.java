/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuvetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    private int[] vetorA;
    private int[] vetorB;
    private boolean preenchidoA;
    private boolean preenchidoB;

    public Vetores() {
        vetorA = new int[5];
        vetorB = new int[5];
        preenchidoA = false;
        preenchidoB = false;
    }

    public void preencherVetor(Scanner scanner, String vetorNome) {
        if (vetorNome.equals("A")) {
            System.out.println("\nEntrada do VETOR A:");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print("Digite numero " + (i + 1) + ": ");
                vetorA[i] = scanner.nextInt();
            }
            preenchidoA = true;
        } else if (vetorNome.equals("B")) {
            System.out.println("\nEntrada do VETOR B:");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.print("Digite numero " + (i + 1) + ": ");
                vetorB[i] = scanner.nextInt();
            }
            preenchidoB = true;
        }
    }

    public void imprimirVetores() {
        if (preenchidoA && preenchidoB) {
            System.out.println("\nVETOR A:");
            Arrays.stream(vetorA).forEach(System.out::println);
            System.out.println("\nVETOR B:");
            Arrays.stream(vetorB).forEach(System.out::println);
        } else {
            System.out.println("Escolha primeiro opcoes 1 e 2.");
        }
    }

    public void somarVetores() {
        if (preenchidoA && preenchidoB) {
            System.out.println("\nSOMA:");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println(vetorA[i] + vetorB[i]);
            }
        } else {
            System.out.println("Escolha primeiro opcoes 1 e 2.");
        }
    }

    public void subtrairVetores() {
        if (preenchidoA && preenchidoB) {
            System.out.println("\nDIFERENCA:");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println(vetorA[i] - vetorB[i]);
            }
        } else {
            System.out.println("Escolha primeiro opcoes 1 e 2.");
        }
    }
}
