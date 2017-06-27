
package exercicio24;

import java.util.Scanner;

public class Exercicio24 {
 
    static int origem;
    static int trabalho;
    static int destino;
	
	public static void main(String[] args) {

		int discos; 		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
	        discos = leitor.nextInt();		
		hanoi(discos, 1, 3, 2);
	}
         public static void hanoi(int n, int origem, int destino, int trabalho) {

		if (n > 0) {
			hanoi(n - 1, origem, trabalho, destino);
			mover(origem, destino);
			hanoi(n - 1, trabalho, destino, origem);
		}

	}
         private static void mover(int origem, int destino) {
		System.out.println(origem + " -> " + destino);
	}
    
}
