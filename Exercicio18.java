
package exercicio18;

import java.util.Scanner;
public class Exercicio18 {

    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite seu capital inicial");
        double capital = leitor.nextDouble();
        System.out.println("Digite a taxa de juros");
        double taxa = leitor.nextDouble();
        System.out.println("Digite o periodo que deseja fazer");
        int periodo = leitor.nextInt();
         
        juros(capital,taxa,periodo,1);
        
    }
    public static void juros(double capital,double taxa,int periodo , int i){
       if(i<=periodo){
            if(i>1){
            System.out.println(i+ " meses = "+ " R$ " +  (capital*(taxa/100)*i));
            }else{
            System.out.println(i+ " mes = " + " R$ " + (capital*(taxa/100)* i ) );
        }
    }
       i++;
       if(i<= periodo){
           juros(capital,taxa,periodo,i);
       }
    
}
}
