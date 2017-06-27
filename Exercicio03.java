package exercicio03;
import java.util.Scanner;
public class Exercicio03 {
 
    public static void main(String[] args) {
        
        int[] A = new int[10];
        for (int i = 0; i <A.length; i++) {

            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = leitor.nextInt();
            
            
        }
        int resultado = somar (A,0);
        System.out.println(resultado);
        
        

    }
    public static int somar(int []A, int i){
        if(i<A.length)
            return A[i] + somar(A,i+1);
        else 
            return 0;
        
    }
}
