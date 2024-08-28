package exerciciosAula05;
import java.util.Scanner; 

public class Exercicio8 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        double cotacaoD = 5.54;
		        double cotacaoE = 6.15;
		        double cotacaoP = 0.0058;
		        double cotacaoL = 7.30;
		        double cotacaoI = 0.038;

		        System.out.println("Digite o valor em Reais: \n");
		        double vReal = scanner.nextDouble();


		        double valorD = vReal / cotacaoD;
		        double valorE = vReal / cotacaoE;
		        double valorP = vReal / cotacaoP;
		        double valorL = vReal / cotacaoL;
		        double valorI = vReal / cotacaoI;
		        
		        System.out.printf("valor em Dolar: %.2f \n", valorD);
		        System.out.printf("valor em Euro: %.2f \n",valorE);
		        System.out.printf("valor em Peso Argentino: %.2f \n",valorP);
		        System.out.printf("valor em Libra: %.2f \n",valorL);
		        System.out.printf("valor em Iene: %.2f \n",valorI);
		        
		        scanner.close();

	}

}
