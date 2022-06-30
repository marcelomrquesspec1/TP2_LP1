//Marcelo Marques Araujo CB3005631

import java.util.Scanner;


public class TP02Ex05 {
    
    public static void main(String[] args){
        final int  colunas = 2, linhas = 3;

        float[][] values = new float[linhas][colunas];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < values.length; i++){
            
            for(int j = 0 ; j < values[i].length; j++){
                System.out.print("DIgite a  posição ["+ i +"]["+ j +"]: ");
                values[i][j] = scan.nextFloat();

            }
        }

        System.out.println("Matriz");
        for(int i = 0; i < values.length; i++){
            
            for(int j = 0 ; j < values[i].length; j++){
                System.out.print(values[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}