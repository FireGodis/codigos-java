package JogoAdivinhacao;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        int numerodasorte = 0;
        int numsecreto;

        // Gerador de números aleatórios
        Random random = new Random();
        numsecreto = random.nextInt(100); // Gera um número entre 0 e 99

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo do Número Secreto!");

        // Laço enquanto o número não for acertado
        while (numerodasorte != numsecreto) {
            System.out.print("Digite o número secreto: ");
            numerodasorte = scanner.nextInt();

            System.out.println("O número digitado é: " + numerodasorte + "\n");

            if (numerodasorte > numsecreto) {
                System.out.println("O número secreto é menor!");
            } else if (numerodasorte < numsecreto) {
                System.out.println("O número secreto é maior!");
            }
        }

        // Quando o número for acertado
        System.out.println("Você acertou!!! " + numsecreto + " era o número secreto!");

        scanner.close();
    }
}
