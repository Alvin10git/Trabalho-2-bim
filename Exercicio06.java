
package exercicio06;


public class Exercicio06 {

 
    
          
    public static void main(String[] args) {
       imprimir(0);
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
