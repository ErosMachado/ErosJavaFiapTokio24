package exerciciosAula05;
import java.util.Scanner;


public class Exercicio6 {

	public static void main(String[] args) {
		double T;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("nome da peca1: ");
		String peca1 = scan.nextLine();
		System.out.println("Quantidade de peca1: ");
		int q1 = scan.nextInt();
		System.out.println("valor unitario da peca1: ");
		double v1 = scan.nextDouble();
		
		System.out.println("nome da peca2: ");
		String peca2 = scan.next();
		System.out.println("Quantidade de peca2: ");
		int q2 = scan.nextInt();
		System.out.println("valor unitario da peca2: ");
		double v2 = scan.nextDouble();
		
		System.out.println("A peca "+peca1+"\n custa: "+v1+"\n Quantidades pedidas: "+q1);
		System.out.println("A peca "+peca2+"\n custa: "+v2+"\n Quantidades pedidas: "+q2);

		T = (q1*v1)+(q2*v2);
		
		System.out.println("O valor total a ser pago pelas duas quantidades de pecas e: ");
		System.out.println(T);

	}
}
