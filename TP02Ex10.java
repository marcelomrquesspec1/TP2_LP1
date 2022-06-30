//Marcelo Marques Araujo CB3005631]

import java.util.Scanner;


public class TP02Ex10 {

    public static void main(String args[]){
      
        Scanner scan = new Scanner(System.in);
        int ordem = 0;

        System.out.println("Digite a ordem da Matriz: ");
        ordem = scan.nextInt();

        float matriz[][] = new float[ordem][ordem];
        float identidade[][] = new float[ordem][ordem];
        float pivo = 0, m = 0;

        for(int i = 0; i < matriz.length; i++){
          for(int j = 0 ; j < matriz[i].length; j++){
              System.out.print("DIgite a posição ["+ i +"]["+ j +"]: ");
              matriz[i][j] = scan.nextFloat();

          }
        }
        System.out.print("Matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (i == j) {
                    identidade[i][j] = 1;
                } else {
                    identidade[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < ordem; j++) {
            pivo = matriz[j][j];
            for (int k = 0; k < ordem; k++) {
              matriz[j][k] = (matriz[j][k]) / (pivo); 
                identidade[j][k] = (identidade[j][k]) / (pivo); 
            }

            for (int i = 0; i < ordem; i++) {
                if (i != j) {
                    m = matriz[i][j];
                    for (int k = 0; k < ordem; k++) {
                      matriz[i][k] = (matriz[i][k]) - (m * matriz[j][k]); 
                        identidade[i][k] = (identidade[i][k]) - (m * identidade[j][k]);
                    }
                }
            }
        }

        System.out.print("Matriz inversa: \n");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(identidade[i][j] + "\t");
            }
            System.out.println("");
        }
    
	}
}