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
        return 6.283185307179586 * this.promien;
    }

    public void wyswietlDane() {
        System.out.println("Koło: ");
        System.out.println("Promień: " + this.promien);
        System.out.println("Pole: " + this.obliczPole());
        System.out.println("Obwód: " + this.obliczObwod());
    }
}
