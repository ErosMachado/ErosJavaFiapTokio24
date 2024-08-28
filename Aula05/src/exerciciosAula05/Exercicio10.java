package exerciciosAula05;
import java.util.Scanner; 


public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite quantos anos inteiros voce tem: \n");
        int ano = scanner.nextInt();
        
		System.out.println("Digite quantos meses inteiros voce tem dos que nao cabem em 1 ano: \n");
        int mes = scanner.nextInt();
        
        System.out.println("Digite quantos dias inteiros voce tem dos que nao cabem em 1 mes: \n");
        int dia = scanner.nextInt();
        
        int diasTotais = (ano*365)+(mes*30)+dia;
        
        System.out.println("voce tem: "+ diasTotais +" dias totais!");
        
        scanner.close();
	}

}
