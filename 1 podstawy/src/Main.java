import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Zad. 1
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");

        // Zad. 2
        String imie = "Wiktor";
        int rokUrodzenia = 2008;
        double liczba = 0.66;

        // Zad. 3
        int obecnyRok = 2026;
        int wiek = obecnyRok - rokUrodzenia;

        System.out.println("Mam na imię " + imie + ", mam " + wiek
                + " lat i będę pisać maturę za " + liczba + " roku.");

        // Zad. 4
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double stopnie = scanner.nextDouble();

        double fahrenheit = 1.8 * stopnie + 32.0;

        System.out.println("Temperatura w stopniach Fahrenheita: " + fahrenheit);

        // Zad. 5
        System.out.print("Podaj pierwszy bok trójkąta: ");
        double bok1 = scanner.nextDouble();

        System.out.print("Podaj drugi bok trójkąta: ");
        double bok2 = scanner.nextDouble();

        System.out.print("Podaj trzeci bok trójkąta: ");
        double bok3 = scanner.nextDouble();

        double obwod = bok1 + bok2 + bok3;

        System.out.println("Obwód trójkąta: " + obwod);

        // Zad. 6
        System.out.print("Podaj pierwsze słowo: ");
        String slowo1 = scanner.next();

        System.out.print("Podaj drugie słowo: ");
        String slowo2 = scanner.next();

        System.out.print("Podaj trzecie słowo: ");
        String slowo3 = scanner.next();

        System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);

        // Zad. 7
        System.out.print("Podaj wyraz: ");
        String wyraz = scanner.next();

        System.out.println("Liczba znaków: " + wyraz.length());

        // Zad. 8
        int x = 5;
        int y = 2;
        double wynik = (double) x / y;

        System.out.println("Wynik dzielenia: " + wynik);

        // Zad. 9
        System.out.print("Podaj słowo: ");
        String slowo = scanner.next();

        System.out.println(slowo.toUpperCase());

        // Zad. 10
        System.out.print("Podaj promień koła: ");
        int promien = scanner.nextInt();

        double pole = Math.PI * promien * promien;

        System.out.println("Pole koła: " + pole);

        scanner.close();
    }
}