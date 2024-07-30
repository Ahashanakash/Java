/**
 *
 * @author Akash
 */
class Triangle {

    protected float base;
    protected float height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    void setBase(float base) {
        this.base = base;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getBase() {
        return this.base;
    }

    float getHeight() {
        return this.height;
    }

    void calculateArea() {
        System.out.println("Area calculation method in Triangle class");
    }
}
