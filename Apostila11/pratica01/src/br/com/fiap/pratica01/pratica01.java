package br.com.fiap.pratica01;

import br.com.fiap.model.Aluno;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pratica01 {
    public static void main(String[] args) {
        //Instanciando o Scanner
        Scanner scanner = new Scanner(System.in);

        //Fazendo o contrato da lista alunos
        List<br.com.fiap.model.Aluno> alunos = new ArrayList<>();

        //Dados de cada aluno
        int rm;
        String nome;
        int idade;
        double nota1;
        double nota2;

        //Estatisticas dos alunos
        double mediaNotaGeral = 0.0;
        double mediaIdade = 0.0;
        int maiorIdade = 0;
        int menorIdade = 0;


        //Menu
        String menu = "OPÇÕES:\n1- Cadastrar\n2- Exibir\n0- Sair";

        //Pedir os dados de cada aluno para o usuario
        int opcao = 1; //Variavel de controle


        while (opcao != 0) {
            if (opcao == 1) {
                System.out.println("Digite o RM do aluno: ");
                rm = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o nome do aluno: ");
                nome = scanner.nextLine();

                System.out.println("Digite a idade do aluno: ");
                idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite a nota 1: ");
                nota1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Digite a nota 2: ");
                nota2 = scanner.nextDouble();
                scanner.nextLine();

                Aluno aluno = new Aluno(rm, nome, idade, nota1, nota2);
                alunos.add(aluno);

                System.out.println(menu);
                opcao = scanner.nextInt();
                scanner.nextLine();

                //Maior e menor idades
                if (maiorIdade < idade) {
                    maiorIdade = idade;
                }
                if (menorIdade > idade) {
                    menorIdade = idade;
                }
                //Medias
                mediaNotaGeral += nota1 + nota2;

                mediaIdade += idade;

            }
            if (opcao == 2) {
                //Calcula o total de alunos
                System.out.println("Total de alunos: " + alunos.size());

                //Calcular a media de notas da sala
                double mediaNotas = mediaNotaGeral/2 /alunos.size();
                System.out.println("Media de notas: " + mediaNotas);

                //Calcular a media da idade da sala
                double idades = mediaIdade / alunos.size();
                System.out.println("Idades média: " + idades);


            }
        }


        while (opcao == 0) {
            System.out.println("Encerrando o programa...");
            break;
        }




        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Alunos: " + alunos.get(i));
        }
    }
}
