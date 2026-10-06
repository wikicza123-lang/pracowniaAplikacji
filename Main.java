import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // TABLICE

        // ZADANIE 1
        System.out.println("Zadanie 1");
        int[] liczby1 = {1, 2, 3, 4, 5, 6};
        String[] litery = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < liczby1.length; i = i + 2) {
            System.out.println(liczby1[i]);
        }
        for (int i = 0; i < litery.length; i = i + 2) {
            System.out.println(litery[i]);
        }

        // ZADANIE 2
        System.out.println("Zadanie 2");
        int[] liczby2 = {5, 12, -3, 47, 8, 21};
        int najwieksza = liczby2[0];
        for (int i = 0; i < liczby2.length; i++) {
            if (liczby2[i] > najwieksza) {
                najwieksza = liczby2[i];
            }
        }
        System.out.println("Najwieksza liczba: " + najwieksza);

        // ZADANIE 3
        System.out.println("Zadanie 3");
        String[] slowa3 = {"ala", "ma", "kota"};
        for (String slowo : slowa3) {
            System.out.println(slowo.toUpperCase());
        }

        // ZADANIE 4
        System.out.println("Zadanie 4");
        String[] slowa4 = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj slowo:");
            slowa4[i] = sc.next();
        }
        for (int i = 4; i >= 0; i--) {
            String odwrocone = "";
            for (int j = slowa4[i].length() - 1; j >= 0; j--) {
                odwrocone = odwrocone + slowa4[i].charAt(j);
            }
            System.out.println(odwrocone);
        }

        // ZADANIE 5
        System.out.println("Zadanie 5");
        int[] liczby5 = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Podaj liczbe:");
            liczby5[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (liczby5[j] > liczby5[j + 1]) {
                    int pomocnicza = liczby5[j];
                    liczby5[j] = liczby5[j + 1];
                    liczby5[j + 1] = pomocnicza;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(liczby5[i]);
        }

        // ZADANIE 6
        System.out.println("Zadanie 6");
        int[] liczby6 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbe:");
            liczby6[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            long silnia = 1;
            for (int j = 1; j <= liczby6[i]; j++) {
                silnia = silnia * j;
            }
            System.out.println("Silnia z " + liczby6[i] + " to " + silnia);
        }

        // ZADANIE 7
        System.out.println("Zadanie 7");
        String[] tablicaA = {"jeden", "dwa", "trzy"};
        String[] tablicaB = {"jeden", "dwa", "trzy"};
        boolean takieSame = true;
        for (int i = 0; i < tablicaA.length; i++) {
            if (!tablicaA[i].equals(tablicaB[i])) {
                takieSame = false;
            }
        }
        if (takieSame == true) {
            System.out.println("Tablice sa takie same");
        } else {
            System.out.println("Tablice sa rozne");
        }

        // ZADANIE 8
        System.out.println("Zadanie 8");
        int[] liczby8 = new int[10];
        for (int i = 0; i < 10; i++) {
            liczby8[i] = r.nextInt(21) - 10;
        }

        System.out.println("Tablica:");
        for (int i = 0; i < 10; i++) {
            System.out.println(liczby8[i]);
        }

        int najmniejszy = liczby8[0];
        int najwiekszy = liczby8[0];
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            if (liczby8[i] < najmniejszy) {
                najmniejszy = liczby8[i];
            }
            if (liczby8[i] > najwiekszy) {
                najwiekszy = liczby8[i];
            }
            suma = suma + liczby8[i];
        }
        double srednia = suma / 10.0;

        int mniejsze = 0;
        int wieksze = 0;
        for (int i = 0; i < 10; i++) {
            if (liczby8[i] < srednia) {
                mniejsze++;
            }
            if (liczby8[i] > srednia) {
                wieksze++;
            }
        }

        System.out.println("Najmniejszy: " + najmniejszy);
        System.out.println("Najwiekszy: " + najwiekszy);
        System.out.println("Srednia: " + srednia);
        System.out.println("Mniejszych od sredniej: " + mniejsze);
        System.out.println("Wiekszych od sredniej: " + wieksze);

        System.out.println("Tablica od konca:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(liczby8[i]);
        }

        // ZADANIE 9
        System.out.println("Zadanie 9");
        int[] liczby9 = new int[20];
        for (int i = 0; i < 20; i++) {
            liczby9[i] = r.nextInt(10) + 1;
        }
        for (int liczba = 1; liczba <= 10; liczba++) {
            int ile = 0;
            for (int i = 0; i < 20; i++) {
                if (liczby9[i] == liczba) {
                    ile++;
                }
            }
            System.out.println("Liczba " + liczba + " powtarza sie " + ile + " razy");
        }
    }
}