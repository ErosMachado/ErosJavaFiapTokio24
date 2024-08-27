package exerciciosAula05;
import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		double a, b, m, mp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		m = (a+b)/2;
		System.out.println("Parca, sua media aritmetica e: "+m);
		mp = (a*5+b*5)/10;
		System.out.println("Companheiro, sua media ponderada e: "+mp);


	}

}
