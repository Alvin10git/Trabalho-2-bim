package exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        contar(0);

    }

    public static void contar(int x) {
        System.out.println(x);
        x++;
        if(x<=100)
        contar(x);
    }
}
