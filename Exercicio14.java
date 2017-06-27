
package exercicio14;

import java.util.Scanner;


public class Exercicio14 {

    
   static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
       int faltas = 0;
        funcao (faltas,0);
    }
    public static void funcao(int faltas, int aux){
        System.out.println("Digite as faltas do "+ (aux+ 1)+ " ° aluno"  );
        faltas += leitor.nextInt();
        aux++;
        
        if(aux == 10)
            System.out.println("A média de faltas dos alunos é de: "+(faltas/10)+ " faltas");
        else 
            funcao(faltas, aux);
    }
    
    }
    

