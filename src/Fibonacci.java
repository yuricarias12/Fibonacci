import java.util.Scanner;

public class Fibonacci {
    static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean pertence = false;

        System.out.print("Insira um número: ");
        int numero = ler.nextInt();


        for (int i = 0; i <= numero; i++) {
            if (fibonacci(i) == numero) {
                pertence = true;

            }
        }

        if (pertence == true) {
            System.out.print("Número informado pertence a sequência de Fibonacci.");
        } else {
            System.out.print("Número informado não pertence a sequência de Fibonacci.");
        }

        ler.close();
    }
}