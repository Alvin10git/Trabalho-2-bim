
package exercicio23;

import java.util.Scanner;


public class Exercicio23 {

    
      public static void main(String[] args){  
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor divisor");
        int a1 = leitor.nextInt();
        System.out.println("digite um valor para o dividendo");
        int a2 = leitor.nextInt();
       int resultado = mdc(a1, a2);
       System.out.println(resultado);
    }  
      
      
    public static int mdc(int a1, int a2){  
        if(a1 < a2)  
            throw new IllegalArgumentException("a1 tem de ser maior do que a2");  
          
        int a = a1 % a2;  
        if(a == 0){  
            return a2;  
        }else{  
            return mdc(a2, a);  
        }  
          
    }  
  
}  
    

