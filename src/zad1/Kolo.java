package zad1;

public class Kolo implements Figura {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double obliczPole() {
        return Math.PI * Math.pow(this.promien, 2.0);
    }

    public double obliczObwod() {
        return 2*Math.PI * this.promien;
    }

    public void wyswietlDane() {
        System.out.println("Koło");
        System.out.println("Promień: " + this.promien);
        System.out.println("Pole: " + this.obliczPole());
        System.out.println("Obwód: " + this.obliczObwod());
    }
}
