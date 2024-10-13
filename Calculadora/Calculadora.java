import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
    private double num1, num2, resu;
    private boolean resuzero;
    private Scanner op;

    // construtor
    public Calculadora(double num1, double num2, double resu, Scanner scanner, boolean resuzero) {
        this.num1 = num1;
        this.num2 = num2;
        this.resu = resu;
        this.op = scanner;
        this.resuzero = resuzero;
    }

    // getters

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResu() {
        return resu;
    }

    public boolean getResuZero() {
        return resuzero;
    }

    // setters

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setResu(double resu) {
        this.resu = resu;
    }

    public void setResuZero(boolean resuzero) {
        this.resuzero = resuzero;
    }

    public int EscolherOP() {
        int escolha;

        System.out.println("Qual Operação matemática você deseja escolher?:\n");
        System.out.println("1 --> +\n2 --> -\n3 --> *\n4 --> /");
        System.out.println("5 --> ^\n6 --> Raiz Quadrada\n");
        System.out.print("--> ");
        escolha = op.nextInt();

        EscolherNum1();
        EscolherNum2();

        switch (escolha) {
            case 1:
                Adicao();
                break;
            case 2:
                Subtracao();
                break;
            case 3:
                Multiplicacao();
                break;
            case 4:
                Divisao();
                break;
            case 5:
                Potencializao();
                break;
            case 6:
                RaizQuadrada();
                break;
            default:
                System.out.println("teste");
                break;

        }
        return escolha;
    }

    public double EscolherNum1() {

        System.out.println("Escolha o primeiro numero:\n");
        System.out.print("\n--> ");
        setNum1(op.nextDouble());

        return getNum1();
    }

    public double EscolherNum2() {

        System.out.println("Escolha o segundo numero:\n");
        System.out.print("--> ");
        setNum2(op.nextDouble());

        return getNum2();
    }

    public void ImprimirResu() {
        if (getResuZero() == true) {
            System.out.println("Erro: não é possivel dividir um número por zero");
        } else {
            System.out.println("O resultado é: " + getResu());
        }

    }

    public Double Adicao() {
        double resultado = getNum1() + getNum2();
        setResu(resultado);
        return getResu();
    }

    public Double Subtracao() {
        double resultado = getNum1() - getNum2();
        setResu(resultado);
        return getResu();
    }

    public Double Multiplicacao() {
        double resultado = getNum1() * getNum2();
        setResu(resultado);
        return getResu();
    }

    public Double Divisao() {

        if (getNum2() == 0) {
            setResuZero(true);
        } else {
            double resultado = getNum1() / getNum2();
            setResu(resultado);

        }
        return getResu();
    }

    public Double Potencializao() {
        double resultado = Math.pow(getNum1(), getNum2());
        setResu(resultado);
        return getResu();
    }

    public Double RaizQuadrada() {
        double resultado = Math.sqrt(getNum1());
        setResu(resultado);
        return getResu();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean programa = true;
        char opcao;
        Calculadora calculadora = new Calculadora(1, 2, 3, scanner, false);
        while (programa == true) {
            calculadora.EscolherOP();
            calculadora.ImprimirResu();

            System.out.print("<<S para sim>>\n<<N para Não>>\n");
            System.out.print("você ainda deseja continuar no programa?: \n-->");

            String entrada = scanner2.nextLine();
            if (!entrada.isEmpty()) {
                opcao = entrada.charAt(0);
            } else {
                System.out.println("Entrada inválida, tente novamente.");
                continue; // Volta para o início do loop
            }
            if (opcao == 'N' || opcao == 'n') {
                programa = false; // Encerra o loop se o usuário escolher 'N'
            }

        }

    }
}
