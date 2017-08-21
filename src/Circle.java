public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius is illegal");
        }
        this.radius = radius;
    }

    public double area() {
        return this.radius * this.radius * 3.14;
    }
}
