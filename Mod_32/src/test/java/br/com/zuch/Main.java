package br.com.zuch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.zuch.dao.ProdutoDao;
import br.com.zuch.domain.Produto;

public class Main {
    private ProdutoDao produtoDao = new ProdutoDao();

    public static void main(String[] args) {
        Main main = new Main();
        main.cadastrarProdutos();
    }

    public void cadastrarProdutos() {
        Scanner scanner = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Quantidade de produtos a cadastrar: ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto prod = new Produto();

            System.out.print("Código do produto: ");
            prod.setCodigo(scanner.nextLine());

            System.out.print("Nome do produto: ");
            prod.setNome(scanner.nextLine());

            System.out.print("Descrição do produto: ");
            prod.setDescricao(scanner.nextLine());

            System.out.print("Data de fabricação do produto Formato(DD/MM/YYYY): ");
            prod.setDataFabricacao(scanner.nextLine());

            listaProdutos.add(prod);
        }

        for (Produto produto : listaProdutos) {
            produto = produtoDao.cadastrar(produto);
        }

        scanner.close();
    }
}
