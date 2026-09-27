import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }


        // Zadanie 2
        System.out.print("Podaj pierwszy bok: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugi bok: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzeci bok: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Można zbudować trójkąt");
        } else {
            System.out.println("Nie można zbudować trójkąta");
        }


        // Zadanie 3
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        if (liczba1 > liczba2) {
            System.out.println("Największa: " + liczba1);
        } else {
            System.out.println("Największa: " + liczba2);
        }


        // Zadanie 4
        System.out.print("Podaj pierwszą liczbę: ");
        int x = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int y = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int z = scanner.nextInt();

        if (x >= y && x >= z) {
            System.out.println("Największa: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Największa: " + y);
        } else {
            System.out.println("Największa: " + z);
        }


        // Zadanie 5
        System.out.print("Podaj numer miesiąca: ");
        int miesiac = scanner.nextInt();

        switch (miesiac) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
        }


        // Zadanie 6
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.next();

        if (imie.equals("Wiktor")) {
            System.out.println("Twoje imię jest takie samo jak moje");
        } else {
            System.out.println("Mamy różne imiona");
        }


        // Zadanie 7
        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();

        boolean pelnoletni = wiek >= 18 ? true : false;

        System.out.println(pelnoletni);


        // Zadanie 8
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }


        // Zadanie 9
        System.out.print("Podaj wagę w kg: ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj wzrost w metrach: ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("BMI: " + bmi);

        if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("waga prawidłowa");
        } else if (bmi <= 18.5) {
            System.out.println("niedowaga");
        } else {
            System.out.println("nadwaga");
        }


        // Zadanie 10
        double cena;
        int raty;

        do {
            System.out.print("Podaj cenę towaru od 100 do 10000 zł: ");
            cena = scanner.nextDouble();
        } while (cena < 100 || cena > 10000);

        do {
            System.out.print("Podaj liczbę rat od 6 do 48: ");
            raty = scanner.nextInt();
        } while (raty < 6 || raty > 48);

        double oprocentowanie;

        if (raty <= 12) {
            oprocentowanie = 0.025;
        } else if (raty <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }

        double rata = (cena + cena * oprocentowanie) / raty;

        System.out.println("Miesięczna rata: " + rata + " zł");


        // Zadanie 11
        System.out.println("KALKULATOR");

        System.out.print("Podaj pierwszą liczbę: ");
        double liczbaA = scanner.nextDouble();

        System.out.print("Podaj działanie (+, -, *, /): ");
        String dzialanie = scanner.next();

        System.out.print("Podaj drugą liczbę: ");
        double liczbaB = scanner.nextDouble();

        switch (dzialanie) {
            case "+":
                System.out.println("Wynik: " + (liczbaA + liczbaB));
                break;

            case "-":
                System.out.println("Wynik: " + (liczbaA - liczbaB));
                break;

            case "*":
                System.out.println("Wynik: " + (liczbaA * liczbaB));
                break;

            case "/":
                if (liczbaB == 0) {
                    System.out.println("Nie można dzielić przez zero");
                } else {
                    System.out.println("Wynik: " + (liczbaA / liczbaB));
                }
                break;

            default:
                System.out.println("Błędny symbol działania");
        }

        scanner.close();
    }
}