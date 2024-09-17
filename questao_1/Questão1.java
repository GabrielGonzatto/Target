package questao_1;

import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        if (num == a || num == b) {
            return true;
        }

        int fib = a + b;

        while (fib <= num) {
            if (fib == num) {
                return true;
            }
            a = b;
            b = fib;
            fib = a + b;
        }

        return false;
    }
}
