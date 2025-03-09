package core;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();

    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        while(true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                return value;

            } catch (NumberFormatException e) {
                System.out.println("ingresa un numero valido");

            }
        }
    }
}
