package Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Inserisci il numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);e
        }
        scanner.close();
    }
}
