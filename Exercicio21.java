package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    static int soma = 0;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o numero triangular");
        int n = leitor.nextInt();
        System.out.println(triangular(n));

    }

    public static int triangular(int n) {

        if (n <= 1) {
            return n;

        } else {

            return n + triangular(n - 1);
        }
    }
}
