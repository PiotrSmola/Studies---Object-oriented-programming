package zad1;

public class Kwadrat implements Figura {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obliczPole() {
        return this.bok * this.bok;
    }

    public double obliczObwod() {
        return 4.0 * this.bok;
    }

    public void wyswietlDane() {
        System.out.println("Kwadrat");
        System.out.println("Bok: " + this.bok);
        System.out.println("Pole: " + this.obliczPole());
        System.out.println("Obwód: " + this.obliczObwod());
    }
}