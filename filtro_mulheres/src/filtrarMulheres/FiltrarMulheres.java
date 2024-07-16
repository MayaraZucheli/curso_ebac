package filtrarMulheres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class FiltrarMulheres {

    public static void main(String[] args) {
        // Inicialização do Scanner para ler dados do console
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar as pessoas inseridas
        List<Pessoa> pessoas = new ArrayList<>();

        // Leitura do número de pessoas a serem inseridas
        System.out.println("Digite o número de pessoas:");

        // Verificar se a entrada é um número inteiro válido
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número:");
            scanner.next(); // limpar a entrada inválida
        }

        int numPessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        // Loop para inserção dos dados de cada pessoa
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo (M/F) da pessoa " + (i + 1) + ":");
            char sexo = scanner.nextLine().toUpperCase().charAt(0); // Lê e converte para maiúsculo

            // Cria uma nova Pessoa com os dados lidos e adiciona à lista de pessoas
            pessoas.add(new Pessoa(nome, sexo));
        }

        // Filtragem das mulheres usando Stream e expressão lambda
        List<Pessoa> mulheres = pessoas.stream()
                                      .filter(pessoa -> pessoa.getSexo() == 'F')
                                      .collect(Collectors.toList());

        // Impressão das mulheres filtradas
        System.out.println("Mulheres na lista:");
        mulheres.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo()));

        // Fechar o Scanner para liberar recursos
        scanner.close();
    }

    // Classe interna Pessoa para representar indivíduos
    static class Pessoa {
        private String nome;
        private char sexo;

        // Construtor da classe Pessoa
        public Pessoa(String nome, char sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        // Métodos getter para obter nome e sexo da Pessoa
        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }
    }
}
