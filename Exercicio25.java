
package exercicio25;

import java.util.Scanner;


public class Exercicio25 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero");
        int n = leitor.nextInt();
        System.out.println(pell(n));
    }
    public static int pell(int n){
        if (n == 0 || n == 1)
            return n;
        else 
            return 2*pell(n-1) + pell(n-2);
        
    }
    }
