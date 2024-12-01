/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuvetores;

    import java.util.Scanner;
/**
 *
 * @author REGYANE
 */
public class MenuVetores {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetores vetores = new Vetores(); // Instância da classe de lógica de vetores

        int opcao;

        do {
            System.out.println("\nVETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    vetores.preencherVetor(scanner, "A");
                    break;
                case 2:
                    vetores.preencherVetor(scanner, "B");
                    break;
                case 3:
                    vetores.imprimirVetores();
                    break;
                case 4:
                    vetores.somarVetores();
                    break;
                case 5:
                    vetores.subtrairVetores();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
