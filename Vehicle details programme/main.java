package Vehicle details programme;
import java.util.*;

public class main {

    public static void main(String[] args) {
        vehicle Car = new car("BMW", 2005, 276343575.0, 4);

        vehicle bike = new Motorcycle("Hero Honda", 2000, 50000.50, true);

        System.out.println("Vehicle Information");
        System.out.println("");
        System.out.println("Car Information");
        Car.info();
        System.out.println();
        System.out.println("Motorcycle Information");
        bike.info();
    }
}
