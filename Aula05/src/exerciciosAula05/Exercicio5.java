package exerciciosAula05;
import java.util.Scanner;


public class Exercicio5 {

	public static void main(String[] args) {
		double a, b, mp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		mp = (a*4+b*6)/10;
		System.out.println("Companheiro, sua media ponderada e: "+mp);

	}

}
