//Marcelo Marques Araujo CB3005631

import java.util.Scanner;


public class TP02Ex01 {
    
    public static void main(String[] args){
        
        
        
        
        float v1, v2;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("1º valor: ");
    	v1 = scan.nextFloat();

        do{
            System.out.print("2º valor: ");
            v2 = scan.nextFloat();

            if(v1 >= v2){
                System.out.println("O 2º valor deve ser maior que: " + v1);
            }
            
        }while(v1 >= v2);

    	System.out.println("1º valor:" + v1 + "\n2º valor:" + v2);
        
        scan.close();
    }
}