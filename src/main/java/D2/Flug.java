package D2;

import java.util.ArrayList;
import java.util.List;

public class Flug {

    List<Passagier> passengers = new ArrayList<Passagier>();

    public void addPassenger() {
        passengers.add(new Passagier());
    }

    public void removePassenger() {
        passengers.remove(new Passagier());
    }

    public void printPassengerList() {
        for (Passagier p : passengers) {
            p.printName();
        }
    }

    public static void main(String[] args) {

    }
}
