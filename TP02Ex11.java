//Marcelo Marques Araujo CB3005631

import java.util.Scanner;



public class TP02Ex11 {

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Digite o valor da matriz[N x N]: ");
        n=s.nextInt();
        double a[][]=new double [n][n];
       
        for (int i=0;i<n;i++)
         for (int j=0;j<n;j++)
          a[i][j]=s.nextInt();
       
           for(int i = 0; i < n; i++)
           {
               for(int j = 0; j < n; j++)
                   if(j>i)
                   {
                       double ratio = a[j][i]/a[i][i];
                       for(int k = 0; k < n; k++)
                           a[j][k] -= ratio * a[i][k];                      
                   }
           }
           double det = 1.0; 
           for(int i = 0; i < n; i++)
               det *= a[i][i];
           System.out.println("O Determinante é : "+det);
           s.close();
       }
}