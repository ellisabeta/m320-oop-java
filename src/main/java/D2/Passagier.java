package D2;

public class Passagier {

    private String name;

    public Passagier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }
}
