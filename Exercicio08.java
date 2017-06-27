package exercicio08;

public class Exercicio08 {

    public static void main(String[] args) {
        imprimir(100);
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
