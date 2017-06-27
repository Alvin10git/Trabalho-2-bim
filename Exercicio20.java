
package exercicio20;
import java.util.Scanner;
public class Exercicio20 {

   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor para calcular o fatorial");
        int a = leitor.nextInt();
        System.out.println(fatorial(a));
    }
    public static int fatorial(int a){
        if(a>1){
            return fatorial(a-1)*a;
        }else{
            return 1;
        }
            
    }
}
