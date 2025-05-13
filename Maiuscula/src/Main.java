import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase maneira: ");
        String frase = scanner.nextLine();
        String fraseMaiuscula = frase.toUpperCase();

        System.out.println(fraseMaiuscula);
    }
}