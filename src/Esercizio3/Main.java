package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa (o \":q\" per uscire): ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                String[] characters = input.split("");
                String result = String.join(",", characters);
                System.out.println("Caratteri separati dalla virgola: " + result);
            }
        } while (!input.equals(":q"));

    }
}
