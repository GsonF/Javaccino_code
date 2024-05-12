package Conversor_temperatura;
import java.util.Scanner;
public class conversor {

	public static void main(String[] args) {
		//Conversor_Temperaturas
		// converter de grau Celsius para Fahrenheit, basta multiplicar a
		//temperatura em graus Celsius por 1,8 e somar 32.
		
		//Subtraímos a temperatura em ºF por 32 e dividimos 
		//o resultado por 1,8.
		Scanner input = new Scanner(System.in);
		System.out.println("Olá escolha uma opção:");
		System.out.println("1 - C para F");
		System.out.println("2 - F para C");
		
        int opcao = input.nextInt();
		
		if(opcao == 1) {
			CparaF();
		}else if(opcao == 2) {
			FparaC();
		}else {
			System.out.println("Opção invalida");
		}
		input.close();
	}
	public static void CparaF(){//Celsius -> Fahrenheit
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperaura em Celsius");
		double C = input.nextDouble();
		System.out.println("Convertendo para Fehrenheit"+C * 1.8 + 32);
	}
	public static void FparaC(){//Fahrenheit → Celsius
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a temperaura em Fahrenheit");
		double F = input.nextDouble();
		System.out.println("Convertendo para Celcius: " +(F - 32)/1.8);
	}
}
