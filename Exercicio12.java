
package exercicio12;

import java.util.Scanner;


public class Exercicio12 {

   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor para gerar a tabuada");
        int n = leitor.nextInt();
        tabuada(n, 0);
    }
    public static void tabuada(int n, int aux){
        System.out.println(n + " * "+ aux +" = "+ (n*aux));
        aux++;
        if(aux==11){
            System.out.println("Esta é a tabuada do "+n);
        }else{
            tabuada(n,aux);
        }
                
    }
    
}
