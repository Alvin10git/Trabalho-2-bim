
package exercicio13;

import java.util.Scanner;


public class Exercicio13 {

   static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
       int nota = 0;
        System.out.println(funcao(nota,0)/10);
    }
    public static int funcao(int nota, int aux){
        System.out.println("Digite a "+ (aux+ 1) + "° nota" );
        nota += leitor.nextInt();
        aux++;
        
        if(aux == 10) return nota;
        else return funcao(nota, aux);
    }
    
}
