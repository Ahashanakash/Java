/**
 *
 * @author Akash
 */
class Equilatera_triangle extends Triangle {

    Equilatera_triangle(float base, float height) {
        super(base, height);
    }

    void calculateArea() {
        float area = (float) (Math.sqrt(3) / 4 * Math.pow(base, 2));
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}
