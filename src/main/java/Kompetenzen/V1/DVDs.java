package Kompetenzen.V1;

public class DVDs extends Medien{

    private int Filmlaenge;

    public DVDs(String Title, int Jahr, double Preis, int Filmlaenge) {
        super(Title, Jahr, Preis);
        this.Filmlaenge = Filmlaenge;
    }

    public int getFilmlaenge() {
        return Filmlaenge;
    }
    public void setFilmlaenge(int Filmlaenge) {
        this.Filmlaenge = Filmlaenge;
    }

    @Override
    public String toString() {
        return super.toString() + "Filmlaenge: " + Filmlaenge;
    }
}
