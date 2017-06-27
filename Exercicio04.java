/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Exercicio04 {
static Scanner leitor = new Scanner(System.in);
    static int [] vetor = new int [10];
    static int i= 0;
    public static void main(String[] args) {
       for (i = 0; i<10; i++) {
           System.out.println("Digite um numero para armazenar");
           vetor[i] = leitor.nextInt();
       }
       
      int menor = funcao(vetor, 0, vetor.length-1);
        System.out.println("o menor valor é " +  menor);
    }
      private static int funcao(int [] vetor, int i, int f){  
          if(i == f){
              return vetor[i];
          }else{ 
              int n1;
              int n2;
              int m;
              
              m = (i+f)/2;
              n1= funcao(vetor, i, m);
              n2= funcao(vetor, m+1, f);
              
              if(n1<n2)
                  return n1;
              else
                  return n2;
              }
          
      }
}
