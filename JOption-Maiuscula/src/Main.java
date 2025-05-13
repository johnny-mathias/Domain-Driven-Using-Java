import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite uma frase maneira: ");
        String fraseMaiuscula = frase.toUpperCase();

        System.out.println(fraseMaiuscula);
    }
}