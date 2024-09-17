package questao_2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String text = scanner.nextLine();

        int count = countLetterA(text);

        System.out.println("A letra 'a' aparece " + count + " vezes na string.");

        scanner.close();
    }

    public static int countLetterA(String text) {
        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}
