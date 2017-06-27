
package exercicio10;

import java.util.Scanner;


public class Exercicio10 {

    
    public static void main(String[] args) {
       int [][] matriz = new int [5][5];
       ler(matriz,0,0,0);
       imprimir(matriz,0,0,0);
    }
     
    public static int [][]ler(int matriz [][],int i,int j,int x){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        matriz [i][j] = leitor.nextInt();
        j++;
        x++;
        if(j==5){
            i++;
            j = 0;
        }
        if(i>4){
            return matriz;
        }
        return ler(matriz, i, j, x);
        
    }
    public static void imprimir (int [][] matriz, int i, int j, int x){
         System.out.print("numero "+(x+1)+ "= "+ matriz[i][j]);
         j++;
         x++;
         if(j==5){
             i++;
             j=0;
                     
         }
         if(i<5)
             imprimir(matriz,i,j,x);
    }
   
}

