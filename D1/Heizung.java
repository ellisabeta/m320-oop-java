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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature <= this.min || temperature >= this.max) {
            this.temperature = temperature;
        } else {
            System.out.println("No temperature..");
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void increaseTemperature() {
        if (temperature + increment <= max) {
            temperature += increment;
        } else {
            System.out.println("Can't increase temperature..");
        }
    }

    public void decreaseTemperature() {
        if (temperature - increment >= min) {
            temperature -= increment;
        } else {
            System.out.println("Can't decrease temperature..");
        }
    }

    public static void main(String[] args) {
        System.out.println("Heizung");

        Heizung heizung = new Heizung(15,1,20,1);
        System.out.println("Default temperature: " + heizung.getTemperature());
        System.out.println("Default min: " + heizung.getMin());
        System.out.println("Default max: " + heizung.getMax());

        heizung.increaseTemperature();
        System.out.println("Increased temperature: " + heizung.getTemperature());

        heizung.decreaseTemperature();
        System.out.println("Decreased temperature: " + heizung.getTemperature());
    }

}
