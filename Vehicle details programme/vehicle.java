package vehicle details programme;

public class vehicle {

    String model;
    int year;
    double price;

    public vehicle(String model, int year, double price) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public void info() {
        System.out.println("Model of the car " + model);
        System.out.println("Year " + year);
        System.out.println("Price " + price);
    }
}
