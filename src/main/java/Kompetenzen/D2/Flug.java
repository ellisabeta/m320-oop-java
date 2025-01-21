package Kompetenzen.D2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flug {

    List<Passagier> passengers = new ArrayList<Passagier>();

    public void addPassenger(String name) {
        passengers.add(new Passagier(name));
    }

    public void removePassengerBy(int index) {
        if (index >= 0 && index < passengers.size()) {
            passengers.remove(index);
        }
    }

    public void printPassengerList() {
        passengers.stream().forEach(p -> p.printName());
    }

    public static void main(String[] args) {
        Flug flight = new Flug();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a new passenger: ");
        String name = scanner.nextLine();

        flight.addPassenger(name);
        System.out.println("Passengers list: ");
        flight.printPassengerList();

        while (true) {
            System.out.println("Would you like to add (press 1) or remove (press 0) a passenger?");

            String response = scanner.nextLine();
            if (response.equals("0")) {
                System.out.println("Please enter the index of the passenger to be removed: ");
                int index = Integer.parseInt(scanner.nextLine());
                flight.removePassengerBy(index);
            } else {
                System.out.println("Please enter a passenger:");
                flight.addPassenger(scanner.nextLine());
            }

            System.out.println("Passengers list: ");
            flight.printPassengerList();
        }
    }
}
