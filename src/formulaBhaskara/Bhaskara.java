package formulaBhaskara;


import java.util.Scanner;

public abstract class Bhaskara {

	public static void main(String[] args) {
		// Formula_Bhaskara
        Scanner input = new Scanner(System.in);
		
		
		System.out.println("Olá, favor digite o valor de A");
        double a = input.nextDouble();
		System.out.println("Favor digite B");
        double b = input.nextDouble();
		System.out.println("Favor digite C");
        double c = input.nextDouble();
      //Math.sqrt = raiz_quadrada
      
        double Delta =(b*b)-4*a*c;
        double x1 = -b + Math.sqrt(Delta) / (2*a);
        double x2 = -b - Math.sqrt(Delta) / (2*a);
        double x = -b / (2 * a);
        
		if(Delta < 0) {
			System.out.println("O delta é " + Delta +".Equação não possui raízes reais.");
		}else if(Delta == 0){
			System.out.println("a equaçaõ possui apenas um raiz real:" + x);
		}else if(Delta >0){
			System.out.println("O delta é " + Delta);
			System.out.println("X' é : " + x1);
			System.out.println("X'' é : " + x2);
		}

	}

}
