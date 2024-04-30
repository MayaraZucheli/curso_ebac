package projeto;

import java.util.Scanner;

public class PrimitivoWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor numérico: ");

        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor tipo primitivo: " + valorPrimitivo);
        System.out.println("Valor tipo wrapper: " + valorWrapper);

        scanner.close();
    }
}