package Pitagoras;
import java.util.Scanner;

public class teoremaPitagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular hipotenusa");
        System.out.println("2. Calcular catetos");

        int opcao = input.nextInt();

        if (opcao == 1) {
            CalcHipo();
        } else if (opcao == 2) {
         	CalcCateto();
        } else {
            System.out.println("Opção inválida!");
        }
        input.close();
    }
	public static void CalcHipo() {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite o valor do cateto A:");
	        double A = input.nextDouble();

	        System.out.println("Digite o valor do cateto B:");
	        double B = input.nextDouble();

	        double C = Math.sqrt(A*A + B*B);
	        System.out.println("A hipotenusa é " + C);

	        input.close();
		}
       public static void CalcCateto() {
    	   Scanner input = new Scanner(System.in);
 
           System.out.println("Digite o valor da hipotenusa:");
           double C = input.nextDouble();

           System.out.println("Digite o valor de um dos catetos:");
           double A = input.nextDouble();

           double B = Math.sqrt(C*C - A*A);
           System.out.println("O outro cateto é " + B);

           input.close();
       }
	}

