package V1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Medien {

    private String Titel;
    private int Jahr;
    private double Preis;

    public Medien() {}

    public Medien(String titel, int jahr, double preis) {
        Titel = titel;
        Jahr = jahr;
        Preis = preis;
    }

    @Override
    public String toString() {
        return "Titel: " + Titel + ", Jahr: " + Jahr + ", Preis: " + Preis + ", ";
    }

    public static void main(String[] args) {
        System.out.println("MedienListe");

        ArrayList<Medien> medienList = new ArrayList<Medien>();
        medienList.add(new DVDs("dvd1", 2010, 1.50, 90));
        medienList.add(new CDs("cd1", 2000, 2.00, "My cool bandname hehe"));
        medienList.add(new Buecher("buch1", 2020, 3.00, 1010101010));

        for (Medien medien : medienList) {
            System.out.println(medien);
        }

        medienList.remove(2);
        System.out.println("After removing the book out of the List: ");
        for (Medien medien : medienList) {
            System.out.println (medien);
        }
    }
}
