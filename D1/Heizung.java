package D1;

public class Heizung {

    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int temperature, int min, int max, int increment) {
        this.temperature = temperature;
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    public static void main(String[] args) {
        System.out.println("Heizung");
    }


}
