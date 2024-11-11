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
}
