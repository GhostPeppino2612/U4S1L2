package Esercizio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Il numero di caratteri è pari? --> " + stringaPariDispari("ciaoy"));
        System.out.println("L'anno è bisestile? --> " + annoBisestile(2200));
    }
    public static boolean stringaPariDispari(String string) {
        return string.length() % 2 == 0;
    }
    public static boolean annoBisestile(int num) {
        return num % 4 == 0 || (num % 100 == 0 && num % 400 == 0);
    }
}
