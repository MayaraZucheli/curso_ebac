package app;

import classes.Carro;
import classes.CarroOnix;
import classes.CarroKwid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Carro> list = new ArrayList<>();

        System.out.print("Quantos carros serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Digite os dados do " + i + "° carro");
            System.out.print("Modelo do carro (onix/kwid)? ");
            String modelo = sc.next();
            System.out.print("Cor: ");
            String cor = sc.next();
            System.out.print("Ano do carro: ");
            int anoDoCarro = sc.nextInt();

            if (Objects.equals(modelo, "onix")) {
                Carro onix = new CarroOnix(cor, anoDoCarro);
                list.add(onix);
            } else if (Objects.equals(modelo, "kwid")) {
                Carro kwid = new CarroKwid(cor, anoDoCarro);
                list.add(kwid);
            } else {
                System.out.println("Modelo desconhecido: " + modelo);
            }
        }

        System.out.println();
        System.out.println("Dados de todos os carros:");
        for (Carro c : list) {
            System.out.println(c);
        }

        sc.close();
    }
}
