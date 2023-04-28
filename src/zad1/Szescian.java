package zad1;

public class Szescian implements Figura {
    private double bok;

    public Szescian(double bok) {
        this.bok = bok;
    }

    public double obliczObjetosc() {
        return Math.pow(this.bok, 3.0);
    }

    public void wyswietlDane() {
        System.out.println("Sześcian");
        System.out.println("Bok: " + this.bok);
        System.out.println("Objętość: " + this.obliczObjetosc());
    }
}
