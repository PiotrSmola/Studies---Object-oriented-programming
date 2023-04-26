package zad1;

public class Prostokat implements Figura {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double obliczPole() {
        return this.dlugosc * this.szerokosc;
    }

    public double obliczObwod() {
        return 2.0 * (this.dlugosc + this.szerokosc);
    }

    public void wyswietlDane() {
        System.out.println("Prostokąt: ");
        System.out.println("Długość: " + this.dlugosc);
        System.out.println("Szerokość: " + this.szerokosc);
        System.out.println("Pole: " + this.obliczPole());
        System.out.println("Obwód: " + this.obliczObwod());
    }
}