package modulo16;

public class principal {
    public static void main(String[] args) {
        pessoaFisica pessoaFisica = new pessoaFisica("Mayara", "Rua A, 123", "123.456.789-00");
        pessoaJuridica pessoaJuridica = new pessoaJuridica("Empresa Livros", "Av. B, 456", "12.345.678/0001-99");

        System.out.println("Detalhes da Pessoa Física:");
        pessoaFisica.mostrarDetalhes();

        System.out.println("\nDetalhes da Pessoa Jurídica:");
        pessoaJuridica.mostrarDetalhes();
    }
}
