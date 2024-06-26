import java.util.Scanner;

public class media {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Nota 4: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        if (media >= 7){
            System.out.println("Aluno aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}