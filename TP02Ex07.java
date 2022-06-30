//Marcelo Marques Araujo CB3005631

import java.util.Scanner;


public class TP02Ex07 {
    
    public static void main(String[] args){
        final int columms = 4, lines = 3;

        float[][] valores = new float[lines][columms];
        float multi;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print("DIgite a posição ["+ i +"]["+ j +"]: ");
                valores[i][j] = scan.nextFloat();

            }
        }

        System.out.print("Digite constante multiplicativa: ");
        multi = scan.nextFloat();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] *= multi;
            }
        }

        System.out.println("Matriz ");
        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print(valores[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}