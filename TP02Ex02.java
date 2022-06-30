//Marcelo Marques Araujo CB3005631
import java.util.Scanner;


public class TP02Ex02 {
	public static void main(String[] args) {
            
            
		int[] numeros = new int[10];
		float numeroMaior = 0, somaNumeros = 0, media;
		
		Scanner scan = new Scanner(System.in);
 
		for (int i = 0; i < 10; i++) {
			do {
				System.out.print("digite valor positivo: ");
				numeros[i] = scan.nextInt();
				
				if (numeros[i] <= 0) {
					System.out.println("valor digitado não era positivo");
				} 
			} while (numeros[i] <= 0);
			
			somaNumeros = somaNumeros + numeros[i];
			
			if(numeros[i]>numeroMaior) {
				numeroMaior = numeros[i];
			}
			
		}
		
		media = somaNumeros / 10;

		System.out.println("O maior numero digitado foi: "+ numeroMaior);

		System.out.println("A soma dos valores digitados é: "+ somaNumeros);

		System.out.println("A média dos valores digitados é: " + media);

		scan.close();
	}
}
