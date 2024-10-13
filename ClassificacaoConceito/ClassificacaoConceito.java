package ClassificacaoConceito;

import java.util.Scanner;

public class ClassificacaoConceito {

    private String nome;
    private double nota;

    // Construtor que recebe o nome e a nota do aluno teste
    public ClassificacaoConceito(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Método para classificar o aluno de acordo com a nota (de 0 a 10)
    public void classificar() {
        String conceito;

        if (nota >= 9 && nota <= 10) {
            conceito = "SS (Superior)";
        } else if (nota >= 7.5 && nota < 9) {
            conceito = "MS (Muito Satisfatório)";
        } else if (nota >= 5 && nota < 7.5) {
            conceito = "MM (Mediano)";
        } else if (nota >= 3 && nota < 5) {
            conceito = "MI (Medíocre)";
        } else if (nota > 0 && nota < 3) {
            conceito = "II (Insatisfatório)";
        } else if (nota == 0) {
            conceito = "SR (Sem Rendimento)";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Conceito: " + conceito);
    }

    // Método para validar o nome do aluno
    private static String validarNome(Scanner scanner) {
        String nome;
        while (true) {
            System.out.print("Digite o nome do aluno: ");
            nome = scanner.nextLine();

            // Verificar se o nome contém apenas letras e espaços
            if (nome.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Nome inválido! Use apenas letras e espaços.");
            }
        }
        return nome;
    }

    // Método para validar a nota do aluno
    private static double validarNota(Scanner scanner) {
        double nota = -1;
        while (true) {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            String entrada = scanner.nextLine();

            try {
                // Tentar converter a entrada em um número decimal (double)
                nota = Double.parseDouble(entrada);

                // Verificar se a nota está entre 0 a 10
                if (nota >= 0 && nota <= 10) {
                    break; // Se for válido, vai sair do loop
                } else {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out
                        .println("Entrada inválida! Digite um número válido, utilizando ponto decimal se necessário.");
            }
        }
        return nota;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Validar o nome e a nota do aluno
        String nome = validarNome(scanner);
        double nota = validarNota(scanner);

        // Criar instância de ClassificacaoConceito e classificar
        ClassificacaoConceito aluno = new ClassificacaoConceito(nome, nota);
        aluno.classificar();

        scanner.close();
    }
}
