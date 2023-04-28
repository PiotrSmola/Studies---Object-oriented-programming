package zad1;

public class Prostopadloscian implements Figura {
    private double dlugosc;
    private double szerokosc;
    private double wysokosc;

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public double obliczObjetosc() {
        return this.dlugosc * this.szerokosc * this.wysokosc;
    }

    public void wyswietlDane() {
        System.out.println("Prostopadłościan");
        System.out.println("Długość: " + this.dlugosc);
        System.out.println("Szerokość: " + this.szerokosc);
        System.out.println("Wysokość: " + this.wysokosc);
        System.out.println("Objętość: " + this.obliczObjetosc());
    }
}