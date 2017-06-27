
package exercicio15;

import java.util.Scanner;


public class Exercicio15 {
    
     static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
       int idade = 0;
        funcao (idade,0);
    }
    public static void funcao(int idade, int aux){
        System.out.println("Digite a idade do "+ (aux+ 1)+ " ° aluno"  );
        idade += leitor.nextInt();
        aux++;
        
        if(aux == 10)
            System.out.println("A média de idade dos alunos é : "+(idade/10)+ " anos");
        else 
            funcao(idade, aux);
    }
    
    }
    

