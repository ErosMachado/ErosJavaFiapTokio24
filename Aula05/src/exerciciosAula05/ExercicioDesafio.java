package exerciciosAula05;
import java.util.Scanner; 


public class ExercicioDesafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dias totais voce tem: ");
        int diasTotais = scanner.nextInt();
        
        int anos = diasTotais/365;
        int meses = (diasTotais%365)/30;
        int dias = ((diasTotais%365)%30);
        
        System.out.println("voce tem: "+ anos + " anos!");
        System.out.println("voce tem: "+ meses + " meses!");
        System.out.println("voce tem: "+ dias + " dias!");
        
		scanner.close();
	}
}
