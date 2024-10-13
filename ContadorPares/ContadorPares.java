package ContadorPares;

public class ContadorPares {

    private int N;

    // Construtor que recebe o valor de N
    public ContadorPares(int N) {
        this.N = N;
    }

    // Método para contar e imprimir os números pares até N
    public void contarPares() {
        System.out.println("Números pares de 0 até " + N + ":");
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        ContadorPares contador = new ContadorPares(10);
        contador.contarPares(); // Vai imprimindo: 0, 2, 4, 6, 8, 10
    }
}