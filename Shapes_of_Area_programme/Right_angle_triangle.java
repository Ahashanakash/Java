/**
 *
 * @author Akash
 */
class Right_angle_triangle extends Triangle {

    Right_angle_triangle(float base, float height) {
        super(base, height);
    }

    void calculateArea() {
        float area = 0.5f * base * height;
        System.out.println("Area of Right Angle Triangle: " + area);
    }
}
