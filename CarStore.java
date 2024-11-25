import java.util.Scanner;

public class CarStore {

    private final String carName;
    private final int carYear;

    public CarStore(String carName, int carYear) {
        this.carName = carName;
        this.carYear = carYear;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarYear() {
        return carYear;
    }

    public void displayInfo() {
        System.out.println("Car Name: " + getCarName() + ", Car Year: " + getCarYear());
    }

    public void setFavouriteCar() {
        System.out.println("Favourite Car: " + getCarName() + ", Car Year: " + getCarYear());
    }

    public static void main(String[] args) {

        CarStore car1 = new CarStore("McLaren", 2020);
        CarStore car2 = new CarStore("BMW", 2019);
        CarStore car3 = new CarStore("Mustang", 2022);

        CarStore[] cars = {car1, car2, car3};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display Available Cars");
            System.out.println("2. Select Favorite Car");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Cars:");
                    for (CarStore car : cars) {
                        car.displayInfo();
                    }
                    break;
                case 2:
                    System.out.println("Select a car as your favorite (1, 2, or 3):");
                    int carChoice = scanner.nextInt();

                    if (carChoice >= 1 && carChoice <= cars.length) {
                        CarStore favoriteCar = cars[carChoice - 1];
                        favoriteCar.setFavouriteCar();
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
