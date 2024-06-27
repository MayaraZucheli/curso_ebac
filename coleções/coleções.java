package coleções;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class coleções {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nomeMasculino = new ArrayList<>();
        List<String> nomeFeminino = new ArrayList<>();
        List<String> listaInicial = new ArrayList<>();

        System.out.println("Nomes e gêneros? (Ex: nome:M/F, nome:M/F) ");

        String nome = sc.nextLine();
        String[] nomeList = nome.split(",\\s*");
        for (String n : nomeList) {
            listaInicial.add(n.trim());
        }

        for (String n : listaInicial) {
            String[] temp = n.split(":");
            if (temp.length >= 2) {
                if (temp[1].equalsIgnoreCase("M")) {
                    nomeMasculino.add(temp[0].trim());
                } else if (temp[1].equalsIgnoreCase("F")) {
                    nomeFeminino.add(temp[0].trim());
                }
            }
        }

        Collections.sort(nomeFeminino);
        Collections.sort(nomeMasculino);

        System.out.println("Nomes femininos: " + nomeFeminino);
        System.out.println("Nomes masculinos: " + nomeMasculino);

        sc.close();
    }
}
