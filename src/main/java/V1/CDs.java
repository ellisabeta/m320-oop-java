package V1;

public class CDs extends Medien{

    private String Bandname;

    public CDs(String Title, int Jahr, double Preis, String Bandname) {
        super(Title, Jahr, Preis);
        this.Bandname = Bandname;
    }

    public String getBandname() {
        return Bandname;
    }

    public void setBandname(String Bandname) {
        this.Bandname = Bandname;
    }

    @Override
    public String toString() {
        return super.toString() + "CDs " + "Bandname=" + Bandname ;
    }
}
