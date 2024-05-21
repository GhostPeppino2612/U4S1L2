package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi il numero: ");
        int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 0: {
                    System.out.println("zero");
                    break;
                }
                case 1: {
                    System.out.println("uno");
                    break;
                }
                case 2: {
                    System.out.println("due");
                    break;
                }
                case 3: {
                    System.out.println("tre");
                    break;
                }
                default: {
                    System.out.println("Il numero inserito non è compreso tra 0 e 3");
                }
            }
        scanner.close();
    }
    }
