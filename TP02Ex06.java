//Marcelo Marques Araujo CB3005631

import java.util.Scanner;


public class TP02Ex06 {
    
    public static void main(String[] args){
        final int lines = 2, colums = 3;

        String[][] names = new String[lines][colums];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < names.length; i++){
            for(int j = 0 ; j < names[i].length; j++){
                System.out.print("Digite a  posição ["+ i +"]["+ j +"]: ");
                names[i][j] = scan.nextLine();

            }
        }

        System.out.println("Matriz ");
        for(int i = 0; i < names.length; i++){
            for(int j = 0 ; j < names[i].length; j++){
                System.out.print(names[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}
