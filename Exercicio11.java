
package exercicio11;

import java.util.Scanner;


public class Exercicio11 {

    
    public static void main(String[] args) {
       int [][][] matriz = new int [5][5][5];
       ler(matriz,0,0,0,0);
       imprimir(matriz,0,0,0,0);
    }
     
    public static int [][][]ler(int matriz [][][],int i,int j,int k, int x){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        matriz [i][j][k] = leitor.nextInt();
        k++;
        x++;
        if(k==5){
            j++;
            k = 0;
        }
        if(j==5){
            i++;
            j = 0;
        }
        if(i>4){
            return matriz;
        }
        return ler(matriz, i, j, k, x);
        
    }
    public static void imprimir (int [][][] matriz, int i, int j, int k, int x){
         System.out.print("numero "+(x+1)+ "= "+ matriz[i][j][k]);
         k++;
         x++;
         if(k==5){
             j++;
             k=0;
         }
         if(j==5){
             i++;
             j=0;
         }
         if(i<5)
             imprimir(matriz,i,j,k,x);
    }
    
}
