
package exercicio16;

import java.util.Arrays;
import java.util.Scanner;


public class Exercicio16 {

    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
       String [] nomes = new String [10]; 
        System.out.println(Arrays.toString(listadenomes(nomes,0)));
               
    }
    public static String [] listadenomes (String [] nomes, int aux){
        System.out.println("Digite o nome do "+ (aux+ 1)+ " ° aluno"  );
        nomes[aux]= leitor.nextLine();
        aux++;
        
        if(aux == 10){
            return nomes;
        }
        else {
            return listadenomes(nomes,aux);
        }
    }
    
}
