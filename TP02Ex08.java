//Marcelo Marques Araujo CB3005631

import java.util.Scanner;

public class TP02Ex08 {
    
    public static void main(String[] args){
        final int linhas = 3, colunas = 4;

        float multiplicador;
        float[][] valores = new float[linhas][colunas];
        float[][] valoresMultiplicados = new float[linhas][colunas];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print("Digite a posição ["+ i +"]["+ j +"]: ");
                valores[i][j] = scan.nextFloat();

            }
        }

        System.out.print("Digite a constante multiplicativa: ");
        multiplicador = scan.nextFloat();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valoresMultiplicados[i][j] = valores[i][j] * multiplicador;
            }
        }

        System.out.println(" Matriz original");
        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print(valores[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println(" Matriz ");
        for(int i = 0; i < valoresMultiplicados.length; i++){
            for(int j = 0 ; j < valoresMultiplicados[i].length; j++){
                System.out.print(valoresMultiplicados[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}
