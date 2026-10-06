public class meotdy {

    // ZADANIE 1
    public static int podajWiek() {
        return 19;
    }

    // ZADANIE 2
    public static String podajImie() {
        return "Wiktor";
    }

    // ZADANIE 3
    public static void dzialania(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    // ZADANIE 4
    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    // ZADANIE 5
    public static boolean podzielnaPrzez3i5(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    // ZADANIE 6
    public static double naTrzeciaPotege(double liczba) {
        return liczba * liczba * liczba;
    }

    // ZADANIE 7
    public static double pierwiastek(double liczba) {
        return Math.sqrt(liczba);
    }

    // ZADANIE 8
    public static boolean czyProstokatny(double a, double b, double c) {
        return a * a + b * b == c * c
                || a * a + c * c == b * b
                || b * b + c * c == a * a;
    }

    // ZADANIE 9
    public static char ostatniZnak(String tekst) {
        return tekst.charAt(tekst.length() - 1);
    }

    // ZADANIE 10
    public static boolean czyPalindrom(String tekst) {
        String male = tekst.toLowerCase();
        for (int i = 0; i < male.length() / 2; i++) {
            if (male.charAt(i) != male.charAt(male.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // ZADANIE 11
    public static int sumaTablicy(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        return suma;
    }

    // ZADANIE 12
    public static int zliczWystapienia(String tekst, char znak) {
        int licznik = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {
        System.out.println(podajWiek());
        System.out.println(podajImie());
        dzialania(6, 3);
        System.out.println(czyParzysta(8));
        System.out.println(podzielnaPrzez3i5(15));
        System.out.println(naTrzeciaPotege(3));
        System.out.println(pierwiastek(16));
        System.out.println(czyProstokatny(3, 4, 5));
        System.out.println(ostatniZnak("Witaj"));
        System.out.println(czyPalindrom("Kajak"));

        int[] liczby = {1, 7, 20, 100};
        System.out.println(sumaTablicy(liczby));

        System.out.println(zliczWystapienia("Ala ma kota", 'a'));
    }
}