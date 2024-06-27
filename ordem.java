import java.util.Arrays;
import java.util.Scanner;

public class ordem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira os nomes separados por vírgula: ");
        String input = scanner.nextLine().trim(); 
        String[] nomes = input.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
