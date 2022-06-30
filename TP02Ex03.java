//Marcelo Marques Araujo CB3005631

import java.util.Scanner;

public class TP02Ex03 {
    
    public static void main(String[] args){
        int qtdNumeros;
    	float[] valores;
        float numMaior = 0, numMenor = 0, soma = 0, media = 0, porcentagemPositivos = 0, porcentagemNegativos = 0;
        String finalizar = "N";
        Scanner scan = new Scanner(System.in);

        do {
            do{
                System.out.print("quantidade de numeros que serão digitados: ");
                qtdNumeros = scan.nextInt();

                if(qtdNumeros < 0 || qtdNumeros > 20){
                    System.out.println("A quantidade digitada deve ser positivo e menor que vinte");
                }
                
            }while(qtdNumeros < 0 || qtdNumeros > 20);

            valores = new float[qtdNumeros];

            for(int i = 0; i < valores.length; i++){
                System.out.print("Entre o " + (i + 1) + "º valor: ");
                valores[i] = scan.nextFloat();

                if(i == 0){
                    numMaior = valores[i]; 
                    numMenor = valores[i]; 
                }else if(valores[i] > numMaior){
                    numMaior = valores[i]; 
                }else if(valores[i] < numMenor){
                    numMenor = valores[i]; 
                }

                if(valores[i] > 0){
                    porcentagemPositivos++;
                }else if(valores[i] < 0){
                    porcentagemNegativos++;
                }

                soma += valores[i];
            }

            
            media = soma / valores.length;
            porcentagemPositivos = porcentagemPositivos / valores.length * 100;
            porcentagemNegativos = porcentagemNegativos / valores.length * 100;

            System.out.println("Maior valor: " + numMaior);
            System.out.println("Menor valor: " + numMenor);
            System.out.println("Soma dos valores valor: " + soma);
            System.out.println("Media: " + media);
            System.out.println("Porcentagem de +: " + porcentagemPositivos + "%");
            System.out.println("Porcentagem de -: " + porcentagemNegativos + "%");

            do{
                System.out.print("\n\nDeseja executar o programa novamente: ");
                finalizar = scan.nextLine().toUpperCase();

                if(finalizar != "N" && finalizar != "S"){
                    System.out.println("Opção errada, \"S\" = Sim | \"N\" = Não");
                }
                
            }while(finalizar != "N" && finalizar != "S");

        } while (finalizar == "N");
        scan.close();
    }
}