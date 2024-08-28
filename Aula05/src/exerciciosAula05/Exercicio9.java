package exerciciosAula05;
import java.util.Scanner; 


public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: \n");
        int num = scanner.nextInt();
        
        int centena = (num / 100) * 100;
        int dezena = ((num % 100) / 10) * 10;
        int unidade = num % 10;

        System.out.println("Numero digitado: " + num);
        System.out.println("Centena = " + centena);
        System.out.println("Dezena = " + dezena);
        System.out.println("Unidade = " + unidade);
        
        scanner.close();
	}

}

