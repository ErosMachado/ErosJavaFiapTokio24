package exerciciosAula05;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite seu genero (M), (F), (O), (N): ");
		char genero = scan.nextLine().charAt(0);
		
		System.out.println("Amigao, seu nome e: "+nome+"! \nSeu genero e: "+genero);  

	}

}
