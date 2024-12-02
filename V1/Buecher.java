package V1;

public class Buecher extends Medien{

    private int ISBN;

    public Buecher(String Title, int Jahr, double Preis, int ISBN ) {
        super(Title, Jahr, Preis);
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

}
