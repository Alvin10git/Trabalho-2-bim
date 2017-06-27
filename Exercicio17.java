
package exercicio17;

import java.util.Scanner;
public class Exercicio17 {

    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
       int num1 = 0;
       int num2 = 0;
       
        System.out.println("Digite o primeiro numero");
        num1 = leitor.nextInt();
        System.out.println("Digite o multiplicador");
        num2 = leitor.nextInt();
        System.out.print(num1 +" x "+ num2 + " = " +(num1*num2) + " = ");
        funcao(num1,num2);
        
    }
    public static int funcao(int num1, int i){
        if(i == 0 ){
            return 0;
        }
        if(i>1){
            System.out.print(num1+" + ");
        }
        if(i==1){
            System.out.println(num1);
        }
        i--;
        return funcao(num1,i);
    }
    
}
