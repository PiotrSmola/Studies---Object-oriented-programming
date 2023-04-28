package zad1;

import java.time.LocalDate;

public class Budynek {
    private String nazwa;
    private int rokBudowy;
    private int liczbaPieter;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa budynku: " + this.nazwa);
        System.out.println("Rok budowy: " + this.rokBudowy);
        System.out.println("Liczba pięter: " + this.liczbaPieter);
    }

    public int obliczWiekBudynku() {
        LocalDate aktualnaData = LocalDate.now();
        int aktualnyRok = aktualnaData.getYear();
        return aktualnyRok - this.rokBudowy;
    }

    public static void main(String[] args) {
        Budynek budynek1 = new Budynek("Wieżowiec", 1985, 12);
        Budynek budynek2 = new Budynek("Biurowiec", 2005, 6);
        Budynek budynek3 = new Budynek("Kamienica", 1920, 4);
        budynek1.wyswietlInformacje();
        System.out.println("Wiek budynku: " + budynek1.obliczWiekBudynku() + " lat");
        System.out.println();
        budynek2.wyswietlInformacje();
        System.out.println("Wiek budynku: " + budynek2.obliczWiekBudynku() + " lat");
        System.out.println();
        budynek3.wyswietlInformacje();
        System.out.println("Wiek budynku: " + budynek3.obliczWiekBudynku() + " lat");
    }
}