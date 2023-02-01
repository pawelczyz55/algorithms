package pl.pawel.test.ciphers;

import java.util.Scanner;
import pl.pawel.main.ciphers.Caesar;

public class CaesarTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Caesar caesar = new Caesar();

        System.out.println("Enter the word or sentence to encode/decode: ");
        String stringToDo = sc.nextLine();
        System.out.println("Enter the shift: ");
        int shift = sc.nextInt();

        Caesar.printOptions();
        int option = sc.nextInt();
        sc.nextLine();

        String stringfAfterOperation = caesar.encodeOrDecode(stringToDo, shift, option);

        System.out.println("Given string by you: " + stringToDo);
        System.out.println("String after the operation: " + stringfAfterOperation);

        sc.close();
    }
}
