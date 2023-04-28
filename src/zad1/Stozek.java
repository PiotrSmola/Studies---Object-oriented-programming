package zad1;

public class Stozek implements Figura {
    private double promien;
    private double wysokosc;

    public Stozek(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public double obliczObjetosc() {
        return (Math.PI * Math.pow(this.promien, 2.0) * this.wysokosc);
    }

    public void wyswietlDane() {
        System.out.println("Stożek");
        System.out.println("Promień: " + this.promien);
        System.out.println("Wysokość: " + this.wysokosc);
        System.out.println("Objętość: " + this.obliczObjetosc());
    }
}