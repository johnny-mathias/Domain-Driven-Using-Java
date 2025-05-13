import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("digite uma frase");

//        String vogais = "aeiou";
//        for (int i=0; i < vogais.length(); i++) {
//            frase = frase.replace(vogais.charAt(i), '*');
//        }

        frase = frase.replaceAll("[aeiou]", "*");


        JOptionPane.showMessageDialog(null, frase);

    }
}