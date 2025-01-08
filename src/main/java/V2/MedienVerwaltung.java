package V2;

import V1.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MedienVerwaltung {

    private ArrayList<Medien> medienList;

    public MedienVerwaltung() {
        medienList = new ArrayList<>();
        medienList.add(new DVDs("dvd", 2010, 1.50, 90));
        medienList.add(new CDs("cd", 2000, 2.00, "chicken nuggets"));
        medienList.add(new Buecher("book", 2020, 3.00, 1010101010));
    }

    public void printMedia() {
        if (medienList.isEmpty()) {
            System.out.println("Nothing in media list");
        } else {
            for (Medien medien : medienList) {
                System.out.println(medien);
            }
        }
    }

    public Medien searchMedien(String titel) {
        for (Medien medien : medienList) {
            if (medien.toString().contains(titel)) {
                return medien;
            }
        }
        return null;
    }

    public void startTUI() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Show all media");
            System.out.println("2. Search for media");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("All Media:");
                    printMedia();
                    break;
                case 2:
                    System.out.print("Enter title to search: ");
                    String title = scanner.nextLine();
                    Medien result = searchMedien(title);
                    if (result != null) {
                        System.out.println("Found: " + result);
                    } else {
                        System.out.println("Media not found.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        MedienVerwaltung verwaltung = new MedienVerwaltung();
        verwaltung.startTUI();
    }
}
