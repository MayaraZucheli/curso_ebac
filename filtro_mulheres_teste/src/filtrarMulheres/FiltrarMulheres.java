package filtrarMulheres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class FiltrarMulheres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();


        System.out.println("Digite o número de pessoas:");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número:");
            scanner.next(); 
        }

        int numPessoas = scanner.nextInt();
        scanner.nextLine(); 


        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo (M/F) da pessoa " + (i + 1) + ":");
            char sexo = scanner.nextLine().toUpperCase().charAt(0); 

            pessoas.add(new Pessoa(nome, sexo));
        }

        List<Pessoa> mulheres = pessoas.stream()
                                      .filter(pessoa -> pessoa.getSexo() == 'F')
                                      .collect(Collectors.toList());


        boolean apenasMulheres = mulheres.stream().allMatch(pessoa -> pessoa.getSexo() == 'F');

        if (apenasMulheres) {
            System.out.println("Apenas mulheres foram filtradas com sucesso.");
        } else {
            System.out.println("Houve um problema ao filtrar apenas mulheres.");
        }

        System.out.println("Mulheres na lista:");
        mulheres.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo()));

        scanner.close();
    }

    static class Pessoa {
        private String nome;
        private char sexo;

        public Pessoa(String nome, char sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public char getSexo() {
            return sexo;
        }
    }
}