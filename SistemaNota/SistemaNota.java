package SistemaNota;

public class SistemaNota {

    private double nota1;
    private double nota2;
    private double nota3;

    public SistemaNota(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarResultado() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aprovado com média " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Em recuperação com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }
    }

    public static void main(String[] args) {

        SistemaNota aluno1 = new SistemaNota(7.0, 6.0, 8.0);
        aluno1.verificarResultado();

        SistemaNota aluno2 = new SistemaNota(5.0, 6.0, 5.5);
        aluno2.verificarResultado();

        SistemaNota aluno3 = new SistemaNota(4.0, 3.5, 4.5);
        aluno3.verificarResultado();
    }
}