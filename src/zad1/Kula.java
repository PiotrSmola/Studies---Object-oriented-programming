package zad1;

public class Kula implements Figura {
    private double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    public double obliczObjetosc() {
        return 4.1887902047863905 * Math.pow(this.promien, 3.0);
    }

    public void wyswietlDane() {
        System.out.println("zad1.Kula: ");
        System.out.println("Promień: " + this.promien);
        System.out.println("Objętość: " + this.obliczObjetosc());
    }
}