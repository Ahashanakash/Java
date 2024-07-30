package Vehicle details programme;

public class Motorcycle extends vehicle {

    boolean hasSideCar;

    public Motorcycle(String model, int year, double price, boolean hasSideCar) {
        super(model, year, price);
        this.hasSideCar = hasSideCar;
    }

    public void info() {
        super.info();
        System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}
