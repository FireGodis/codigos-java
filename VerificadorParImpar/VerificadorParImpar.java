package VerificadorParImpar;

public class VerificadorParImpar {

    private int numero;

    public VerificadorParImpar(int numero) {
        this.numero = numero;
    }

    public void verificar() {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    public static void main(String[] args) {

        VerificadorParImpar verificador = new VerificadorParImpar(7);
        verificador.verificar(); // Vai imprimir: O número 7 é ímpar.

        VerificadorParImpar outroVerificador = new VerificadorParImpar(10);
        outroVerificador.verificar(); // Vai imprimir: O número 10 é par.
    }
}