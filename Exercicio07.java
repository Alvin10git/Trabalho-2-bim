
package exercicio07;


public class Exercicio07 {

   
     
    public static void main(String[] args) {
       imprimir(1);
    }
    public static int imprimir(int x){
        System.out.println(x);
        x +=2;
        if(x<=100){
            imprimir(x);
        }
        return x;
    }
    
}
