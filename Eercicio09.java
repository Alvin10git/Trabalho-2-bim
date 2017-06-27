
package eercicio09;

public class Eercicio09 {

    
    public static void main(String[] args) {
        imprimir (99);
    }
     public static int imprimir(int x) {
         
        System.out.println(x);
        x -= 2;
        if (x >= 0) {
            imprimir(x);
        }
        return x;
     }
}
