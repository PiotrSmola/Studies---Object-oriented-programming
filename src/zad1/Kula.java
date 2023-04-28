package zad1;

public class Kula implements Figura {
    private double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    public double obliczObjetosc() {
        return ((4/3)*Math.PI) * Math.pow(this.promien, 3.0);
    }

    public void wyswietlDane() {
        System.out.println("Kula");
        System.out.println("Promień: " + this.promien);
        System.out.println("Objętość: " + this.obliczObjetosc());
    }
}