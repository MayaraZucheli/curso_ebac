package table;

import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String[] args) {

        @anotation(tabela = {"Mayara","Felipe", "Dom", "Misha"})
        List<String> nomeTabela = new ArrayList<>();
        nomeTabela.add("Mayara");
        nomeTabela.add("Felipe");
        nomeTabela.add("Dom");
        nomeTabela.add("Misha");

        List<Integer> idadeTabela = new ArrayList<>();
        idadeTabela.add(33); 
        idadeTabela.add(35);
        idadeTabela.add(5);
        idadeTabela.add(7); 
        
        System.out.println("Nome\t\tIdade");
        System.out.println("----------------------");
        for (int i = 0; i < nomeTabela.size(); i++) {
            System.out.println(nomeTabela.get(i) + "\t\t" + idadeTabela.get(i));
        }
    }
}