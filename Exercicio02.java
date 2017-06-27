package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        contar(100);
    }

    public static void contar(int x) {
        System.out.println(x);
        x--;
        if (x >= 100) {
            contar(x);
        }
    }
}
