
package exercicio22;

import java.util.Scanner;


public class Exercicio22 {

    
    public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
 
    public static void main(String[] args) {   
	Scanner leitor = new Scanner(System.in);
        System.out.println("digite um valor");
	int n = leitor.nextInt();
        System.out.println(fibo(n));
 
    }
 
}
