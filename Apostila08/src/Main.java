public class Main {
    public static void main(String[] args) {

        String email = "churros@fiap.com.br";
        String confirmarEmail = "churros@fiap.com.br";

        //Validar se os emails são iguais:
        //O Equals verifica o valor da String e não o endereço de memória
        if (email.equals(confirmarEmail)) {
            System.out.println("Email confirmado");
        } else {
            System.out.println("Emails não são iguais");
        }
        System.out.println("Email: " + email);
        System.out.println("Confirmar email: " + confirmarEmail);

        //Exibir a quantidade de caracteres do email

        System.out.println(email + " possui " + email.length() + " caracteres");

        System.out.println("o \"@\" aparece primeiro na posicao "+ email.indexOf('@'));


        System.out.println("Email sem dominio: " + email.substring(0, email.indexOf('@')));
        System.out.println("Dominio: " + email.substring(email.indexOf('@')));



    }
}