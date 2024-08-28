package exerciciosAula05; 

 

import java.util.Scanner; 

 

public class Exercicio7 { 

 

	public static void main(String[] args) { 

		double r; 

		Scanner scan = new Scanner(System.in); 

		System.out.println("Qual o valor do produto? "); 

		double v1 = scan.nextDouble(); 

		System.out.println("Qual o valor pago? "); 

		double v2 = scan.nextDouble(); 

		r = v2 - v1; 

		System.out.println("o troco e: "+r); 

 

	} 

 

} 