import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.print("Podaj dodatnia liczbe: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }


        // Zadanie 2
        System.out.print("Podaj dodatnia liczbe: ");
        int liczba = scanner.nextInt();

        int potega = 1;

        while (potega <= liczba) {
            System.out.println(potega);
            potega = potega * 2;
        }


        // Zadanie 3
        int suma = 0;
        int liczba3;

        System.out.println("Podawaj liczby, 0 konczy:");

        do {
            liczba3 = scanner.nextInt();
            suma = suma + liczba3;
        } while (liczba3 != 0);

        System.out.println("Suma: " + suma);


        // Zadanie 4
        System.out.println("Podawaj liczby, 0 konczy:");

        int liczba4 = scanner.nextInt();

        int najmniejsza = liczba4;
        int najwieksza = liczba4;
        int suma4 = 0;
        int ile = 0;

        while (liczba4 != 0) {

            if (liczba4 < najmniejsza) {
                najmniejsza = liczba4;
            }

            if (liczba4 > najwieksza) {
                najwieksza = liczba4;
            }

            suma4 = suma4 + liczba4;
            ile++;

            liczba4 = scanner.nextInt();
        }

        System.out.println("Najmniejsza: " + najmniejsza);
        System.out.println("Najwieksza: " + najwieksza);
        System.out.println("Suma najmniejszej i najwiekszej: " + (najmniejsza + najwieksza));
        System.out.println("Srednia: " + (double) suma4 / ile);


        // Zadanie 5
        Random random = new Random();

        int wylosowana = random.nextInt(100) + 1;
        int strzal;

        System.out.println("Zgadnij liczbe od 1 do 100:");

        do {
            strzal = scanner.nextInt();

            if (strzal > wylosowana) {
                System.out.println("Podałeś za dużą wartość");
            } else if (strzal < wylosowana) {
                System.out.println("Podałeś za małą wartość");
            } else {
                System.out.println("Gratulacje");
            }

        } while (strzal != wylosowana);


        // Zadanie 6
        System.out.print("Podaj znak prostokata: ");
        String znak = scanner.next();

        System.out.print("Podaj x: ");
        int x = scanner.nextInt();

        System.out.print("Podaj y: ");
        int y = scanner.nextInt();

        System.out.print("Podaj dlugosc a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj dlugosc b: ");
        int b = scanner.nextInt();

        for (int i = 1; i < y; i++) {
            System.out.println();
        }

        for (int i = 0; i < b; i++) {

            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < a; j++) {
                System.out.print(znak);
            }

            System.out.println();
        }


        // Zadanie 7
        System.out.print("Podaj wysokosc choinki: ");
        int wysokosc = scanner.nextInt();

        for (int i = 1; i <= wysokosc; i++) {

            for (int j = 1; j <= wysokosc - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // Zadanie 8
        System.out.print("Podaj liczbe do silni: ");
        int silniaLiczba = scanner.nextInt();

        long silnia = 1;

        for (int i = 1; i <= silniaLiczba; i++) {
            silnia = silnia * i;
        }

        System.out.println("Silnia: " + silnia);


        // Zadanie 9
        System.out.print("Podaj slowo: ");
        String slowo = scanner.next();

        String odwrocone = "";

        for (int i = slowo.length() - 1; i >= 0; i--) {
            odwrocone = odwrocone + slowo.charAt(i);
        }

        if (slowo.equals(odwrocone)) {
            System.out.println("To jest palindrom");
        } else {
            System.out.println("To nie jest palindrom");
        }


        // Zadanie 10
        petlaGlowna:
        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                continue;
            }

            for (int j = 1; j <= 10; j++) {

                if (j > i) {
                    continue petlaGlowna;
                }

                System.out.println(j);
            }
        }

        scanner.close();
    }
}