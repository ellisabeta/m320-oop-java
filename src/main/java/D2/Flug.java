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
        passengers.remove(passengers.size()-1);
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

        System.out.println("Would you like to add (press 1) or remove (press 0) a passenger?");

        Scanner scanner2 = new Scanner(System.in);
        String response = scanner2.nextLine();
        if (response.equals("0")) {
            flight.removePassenger();
        } else {
            System.out.println("Please enter a passenger:");
            flight.addPassenger(scanner.nextLine());
        }

        System.out.println("Passengers on the flight: " + flight.printPassengerList());
    }
}
