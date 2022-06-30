
//Marcelo Marques Araujo CB3005631

import java.util.Scanner;


public class TP02Ex04 {
    
	public static void main(String[] args) {
            
		int[][] nros = new int[2][3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nros.length; i++) {
			for (int j = 0; j < nros[i].length; j++) {
				System.out.print("Entre com um valor: ");
				nros[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < nros.length; i++) {
			for (int j = 0; j < nros[i].length; j++) {
				System.out.print(nros[i][j] + " ");
			}
			System.out.println();
		}
		
        scan.close();
	}
}