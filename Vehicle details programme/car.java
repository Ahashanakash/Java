package Vehicle details programme;
public class car extends vehicle {

    int numberOfDoors;

    public car(String model, int year, double price, int numberOfDoors) {
        super(model, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    public void info() {
        super.info();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
