package D2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flug {

    List<Passagier> passengers = new ArrayList<Passagier>();

    public void addPassenger(String name) {
        passengers.add(new Passagier(name));
    }

    public void removePassenger() {

    }

    public String printPassengerList() {
        System.out.println("Passengers available:");
        for (Passagier p : passengers) {
            p.printName();
        }
        return passengers.toString();
    }

    public static void main(String[] args) {
        Flug flight = new Flug();

        System.out.println("Add a new passenger: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        flight.addPassenger(name);
        System.out.println("Passengers on the flight: " + flight.printPassengerList());
    }
}
