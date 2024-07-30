/**
 *
 * @author Akash
 */
public class main {

    public static void main(String[] args) {
        Triangle ob1 = new Triangle(40, 50);
        Right_angle_triangle ob2 = new Right_angle_triangle(40, 50);
        Equilatera_triangle ob3 = new Equilatera_triangle(40, 50);
        ob1.calculateArea();
        ob2.calculateArea();
        ob3.calculateArea();
    }
}
