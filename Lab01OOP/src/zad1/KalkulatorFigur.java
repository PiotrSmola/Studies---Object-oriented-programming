package zad1;
import java.util.Scanner;

public class KalkulatorFigur {
    public KalkulatorFigur() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz figurę geometryczną: ");
        System.out.println("1. Koło");
        System.out.println("2. Kwadrat");
        System.out.println("3. Prostokąt");
        System.out.println("4. Sześcian");
        System.out.println("5. Prostopadłościan");
        System.out.println("6. Kula");
        System.out.println("7. Stożek");
        int wybor = in.nextInt();
        Figura figura = null;
        switch (wybor) {
            case 1:
                System.out.print("Podaj promień: ");
                double promien = in.nextDouble();
                figura = new Kolo(promien);
                break;
            case 2:
                System.out.print("Podaj długość boku: ");
                double bok = in.nextDouble();
                figura = new Kwadrat(bok);
                break;
            case 3:
                System.out.print("Podaj długość: ");
                double dlugosc = in.nextDouble();
                System.out.print("Podaj szerokość: ");
                double szerokosc = in.nextDouble();
                figura = new Prostokat(dlugosc, szerokosc);
                break;
            case 4:
                System.out.print("Podaj długość boku: ");
                double bokSzescian = in.nextDouble();
                figura = new Szescian(bokSzescian);
                break;
            case 5:
                System.out.print("Podaj długość: ");
                double dlugoscProst = in.nextDouble();
                System.out.print("Podaj szerokość: ");
                double szerokoscProst = in.nextDouble();
                System.out.print("Podaj wysokość: ");
                double wysokoscProst = in.nextDouble();
                figura = new Prostopadloscian(dlugoscProst, szerokoscProst, wysokoscProst);
                break;
            case 6:
                System.out.print("Podaj promień: ");
                double promienKula = in.nextDouble();
                figura = new Kula(promienKula);
                break;
            case 7:
                System.out.print("Podaj promień: ");
                double promienStozek = in.nextDouble();
                System.out.print("Podaj wysokość: ");
                double wysokoscStozek = in.nextDouble();
                figura = new Stozek(promienStozek, wysokoscStozek);
                break;
            default:
                System.out.println("Nieprawidłowy wybór");
        }

        if (figura != null) {
            ((Figura)figura).wyswietlDane();
        }

        in.close();
    }
}