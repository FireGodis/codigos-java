

import java.util.Scanner;


//teste

public class Main
{
    
    public static float resultado_soma(int x, int y){
        
        float resultado_soma = x + y;
        return(resultado_soma);
        
        
    }
    
    public static float resultado_subtracao(int x, int y){
        
        float resultado_subtracao = x - y;
        return(resultado_subtracao);
    }
    
    public static float resultado_divisao(int x, int y){
        
        float resultado_divisao = x / y;
        return(resultado_divisao);
    }
    public static float resultado_multiplicacao(int x, int y){
        
        float resultado_multiplicacao = x * y;
        return(resultado_multiplicacao);
    }
    
    public static double resultado_potencia(int x, int y){
        
        double resultado_potencia = Math.pow(x,y);
        return(resultado_potencia);
    }
    
    public static double resultado_raiz(int x){
        
        double resultado_raiz = Math.sqrt(x);
        return(resultado_raiz);
    }
    
	public static void main(String[] args) {
	    
	    int num1, num2= 0;
	    
	    Scanner op = new Scanner(System.in);
	    int opcao = 0;
	    boolean programa = true;
	    boolean programa2 = true;
	    
	    char continuar;
	    
	    while(programa == true){
	        
	        boolean programa3 = true;
	        
	        
	        System.out.println("Bem vindo a Calculadora Java\n\n");
	        System.out.println("Escreva o primeiro numero: ");
	        num1 = op.nextInt();
	        System.out.println("Escreva o segundo numero: ");
	        num2 = op.nextInt();
	        
	        
	        System.out.println("Selecione uma operaçao: \n\n");
	        System.out.println("1 -> +\n");
	        System.out.println("2 -> -\n");
	        System.out.println("3 -> /\n");
	        System.out.println("4 -> *\n");
	        System.out.println("5 -> ^\n");
	        System.out.println("6 -> Raiz Quadrada\n");
	        System.out.println("\n-->");
	        
	        
	        
	        while(programa2 == true){
	             opcao = op.nextInt();
	            
	             switch(opcao){
	            
	            case 1:
	                
	                System.out.println("o resultado é: " + resultado_soma(num1,num2));
	                programa2 = false;
	                break;
	            case 2:
	                System.out.println("o resultado é " + resultado_subtracao(num1,num2));
	                programa2 = false;
	                break;
	            case 3:
	                System.out.println("o resultado é " + resultado_divisao(num1,num2));
	                programa2 = false;
	                break;
	            case 4:
	                System.out.println("o resultado é " + resultado_multiplicacao(num1,num2));
	                programa2 = false;
	                break;
	            case 5:
	                System.out.println("o resultado é " + resultado_potencia(num1,num2));
	                programa2 = false;
	                break;
	            case 6:
	                System.out.println("o resultado é " + resultado_raiz(num1));
	                programa2 = false;
	                break;
	            default:
	                System.out.println("Opcao invalida, Digite novamente!\n");
	        }
	        
	        
	        }
	        
	        while(programa3 == true){
	            
	            System.out.println("Voce deseja continuar no programa?: \n");
	            System.out.println("S Ou N?");
	            continuar = op.next().charAt(0);
	            if(continuar == 'S' || continuar == 's'){
	               
	               programa2 = true;
	               programa3 = false;
	            } else if(continuar == 'N' || continuar == 'n'){
	               programa = false;
	               programa3 = false;
	            } else{
	               System.out.println("opção invalida!\n");
	        }
	            
	        }
	        
	        
	        
	  
	        
	        
	    }
		
	}
}
